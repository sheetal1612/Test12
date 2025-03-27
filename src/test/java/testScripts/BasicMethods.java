package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicMethods {
  @Test
  public void f() throws InterruptedException, IOException {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://automationbookstore.dev/");
	  driver.findElement(By.id("searchBar")).sendKeys("Test");
	  Thread.sleep(5000);
	  WebElement closeButton=driver.findElement(By.xpath("//a[@title='Clear text']"));
//	  System.out.println("closeButton:"+closeButton.isDisplayed());
//	  if(closeButton.isDisplayed())
//	  {
//		  closeButton.click();
//	  }
//	  Thread.sleep(2000);
	  TakesScreenshot sc=(TakesScreenshot)driver;
	 File src= sc.getScreenshotAs(OutputType.FILE);
	 String path=System.getProperty("user.dir")+"/Screenshots/"+ System.currentTimeMillis()+".png";
	 FileUtils.copyFile(src, new File(path));
	 
	 File src1= closeButton.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(src1, new File(path));
	  driver.close();
  }
}
