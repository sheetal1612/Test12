package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
  @Test
  public void search() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> eles= driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));
	  System.out.append("Details are: ");
	  for(WebElement ele:eles)
	  {
		  System.out.append(ele.getText());
	  }
	  //select a book whose price is 2000
	  
	  WebElement eleBook= driver.findElement(By.xpath("//td[contains(text(),'2000')]//preceding-sibling::td[3]"));
	  System.out.append("Book Name is "+eleBook.getText());
	  
  }
}
