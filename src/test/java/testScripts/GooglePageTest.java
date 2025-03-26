package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GooglePageTest {
  @Test
  public void seleniumSearch() {
//	  ChromeOptions cp=new ChromeOptions();
//	  cp.setBrowserVersion("120");
//	 WebDriver driver= new ChromeDriver(cp);
	 WebDriver driver= new ChromeDriver();
//	  WebDriver driver= new EdgeDriver();
//	 driver.manage().window().maximize();
//	 driver.get("https://the-internet.herokuapp.com/login");
//	 driver.navigate().to("https://the-internet.herokuapp.com/login");
//	 driver.findElement(By.id("username")).sendKeys("tomsmith");
//	 driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//	 driver.findElement(By.className("radius")).click();
//	 driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//	 driver.findElement(By.xpath("//button[@type='submit' and @class='radius']")).click();
//	 driver.navigate().back();
//	 System.out.println(driver.getCurrentUrl());
//	 driver.navigate().forward();
//	 System.out.println(driver.getCurrentUrl());
//	 driver.findElement(By.linkText("Elemental Selenium")).click();
	 
	 driver.navigate().to("https://accounts.lambdatest.com/register");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@222");
	 driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("Test@222");
	 driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
	// driver.close();
  }
}
