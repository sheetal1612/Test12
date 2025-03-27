package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  Select select=new Select(driver.findElement(By.xpath("//select[@id='country']")));
	  select.selectByVisibleText("India");
//	  select.selectByIndex(0);
	  
	  Select mulSelect=new Select(driver.findElement(By.xpath("//select[@id='colors']")));
	  if(mulSelect.isMultiple())
	  {
		  mulSelect.selectByIndex(2);
		  mulSelect.selectByValue("green");
		  mulSelect.selectByVisibleText("Red");
		  List<WebElement> eles=mulSelect.getAllSelectedOptions();
		  System.out.println("Size after selecting values : "+eles.size());
		  for(WebElement ele:eles)
			{
			System.out.println("Selected value is : "+ele.getText());
			}
		  
		  mulSelect.deselectByVisibleText("Green");
	  }
	  
  }
}
