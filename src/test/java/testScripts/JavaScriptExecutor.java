package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  String title= (String)js.executeScript(" return document.title");
	  System.out.println("title is : "+title);
	 WebElement ele=(WebElement) js.executeScript("return document.getElementById('name')");
	 ele.sendKeys("kanha");
	 js.executeScript("window.scrollBy(100,document.body.scrollHeight)");
  }
}
