package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest2 {
  
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
	  
	  @Test
	  public void check(){
		  driver.get(prop.getProperty("url"));
			 driver.navigate().to("https://the-internet.herokuapp.com/login");
			 driver.findElement(By.id("username")).sendKeys("tomsmith");
			 driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
			 driver.findElement(By.className("radius")).click();
			boolean msg= driver.findElement(By.xpath("//*[@class='flash success']")).isDisplayed();
			Assert.assertTrue(msg);
	  }
  }



