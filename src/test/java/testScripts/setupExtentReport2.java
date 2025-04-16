package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class setupExtentReport2 {
	WebDriver driver;
	ExtentReports extentreports;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	@BeforeTest
	public void setupExtentReports() {
		extentreports= new ExtentReports();
		spark=new ExtentSparkReporter("test-output/SparkReporter.html");
		extentreports.attachReporter(spark);
	}
	
	@AfterTest
	public void flush() {
		extentreports.flush();
	}
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
	    driver.get("https://danube-webshop.herokuapp.com/");
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
	if(ITestResult.FAILURE==result.getStatus()){
		test.log(Status.FAIL,result.getThrowable().getMessage());
	}
	
		
	}
	
  @Test
  public void seleniumSearch() throws InterruptedException {
	  test=extentreports.createTest("Pass Login");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='Novels & Stories']")).click();
	    Thread.sleep(2000);
	    String str=driver.getCurrentUrl();
	    Assert.assertTrue(str.contains("novel"));

  }
  @Test
  public void seleniumSearch1() throws InterruptedException {
	  test=extentreports.createTest("Fail Login");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='Crime & Thrillers']")).click();
	    Thread.sleep(3000);
	    String str=driver.getCurrentUrl();
	    Assert.assertTrue(str.contains("crime1"));

  }
}


