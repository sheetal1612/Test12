package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ExtentReports {
	WebDriver driver;
	ExtentReports extentreports;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	@BeforeTest
	public void setupExtentReports() {
		extentreports= new ExtentReports();
	}
  @Test
  public void seleniumSearch() {

	 WebDriver driver= new ChromeDriver();
	 driver.navigate().to("https://accounts.lambdatest.com/register");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@222");
	 driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("Test@222");
	 driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();

  }
}


