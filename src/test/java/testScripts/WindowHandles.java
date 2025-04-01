package testScripts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandles {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/browser-windows"); 
	 String parentwindow= driver.getWindowHandle();
	 System.out.println("parentwindow value is:"+parentwindow);
	 Actions ac=new Actions(driver);
	  ac.scrollByAmount(300, 3000);
	 driver.findElement(By.xpath("//*[text()='New Tab']")).click();
	 Thread.sleep(3000);
	 Set<String> allWindowhandle= driver.getWindowHandles();
	 for(String ss:allWindowhandle) {
		 System.out.println("values are:"+parentwindow);
	 if(!ss.equalsIgnoreCase(parentwindow)) {
	 driver.switchTo().window(ss);
	 Thread.sleep(1000);
	 System.out.println(driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText());
	 }
	 }
	 driver.close();
	 
	 driver.switchTo().window(parentwindow);
//	 ac.scrollByAmount(1000, 1000);
//	 ac.scrollToElement(driver.findElement(By.xpath("//button[text()='New Window']")));
	 driver.findElement(By.xpath("//button[text()='New Window']")).sendKeys(Keys.ARROW_DOWN);
	 driver.findElement(By.xpath("//button[text()='New Window']")).click();
	 
	 Thread.sleep(5000);
	 driver.switchTo().newWindow(WindowType.WINDOW);
	 driver.get("https://testautomationpractice.blogspot.com/");
	 driver.quit();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
  }
}
