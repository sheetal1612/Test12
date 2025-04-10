package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoComplete {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://jqueryui.com/autocomplete/"); 
	  Thread.sleep(2000);
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  WebElement ele=driver.findElement(By.xpath("//input[@id='tags']"));
	  ele.sendKeys("java");
	  Thread.sleep(2000);
	  List<WebElement> eles=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
	  for(WebElement ele1:eles)
	  {
		  if(ele1.getText().equalsIgnoreCase("JavaScript"))
		  {
			  ele1.click();
		  }
	  }
  }
}
