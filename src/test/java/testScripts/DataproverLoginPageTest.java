package testScripts;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


public class DataproverLoginPageTest {
  
	  WebDriver driver;
	  Properties prop;
	  
	  @BeforeMethod
	  public void setup() throws IOException
	  {
		  prop=new Properties();
		  String path= System.getProperty("user.dir")+"//src//test//resources//configFiles//config.properties";
		  System.out.println("path:"+ path);
		  FileInputStream ff=new FileInputStream(path);
		  prop.load(ff);
		  String browserName=prop.getProperty("browser");
		  if(browserName.equalsIgnoreCase("chrome"))
		  {
			  driver= new ChromeDriver();
		  }
		  else {
			  driver= new EdgeDriver();
		  }
	  }
	  
	  @Test(dataProvider="LoginData")
	  public void check(String userName, String userPassword){
		  driver.get(prop.getProperty("url"));
			 driver.findElement(By.id("username")).sendKeys(userName);
			 driver.findElement(By.name("password")).sendKeys(userPassword);
			 driver.findElement(By.className("radius")).click();
			boolean msg= driver.findElement(By.xpath("//*[@class='flash success']")).isDisplayed();
			Assert.assertTrue(msg);
	  }
	  
	  @DataProvider(name="LoginData")
	  public Object[][] getdata() throws CsvValidationException, IOException {
		  String path= System.getProperty("user.dir")+"//src//test//resources//testData//loginData.csv";
		  CSVReader reader=new CSVReader(new FileReader(path));
		  String[] columns;
		  ArrayList<Object> arr=new ArrayList<Object>();
		  while((columns=reader.readNext())!= null)
		  {
			Object record[]= { columns[0] , columns[1] };
			  arr.add(record);
		  }
		reader.close();
		 return arr.toArray(new Object[arr.size()][]);
		  
	  }
  }



