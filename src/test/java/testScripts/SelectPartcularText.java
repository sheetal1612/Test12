package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectPartcularText {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demoblaze.com/");
	  Thread.sleep(5000);
	List<WebElement> eles=  driver.findElements(By.xpath("//a[@class='hrefch']"));
	System.out.println("eles.size()"+eles.size());
	for(WebElement ele:eles)
	{
	
		System.out.println("ele.getText()"+ele.getText());
		if(ele.getText().equalsIgnoreCase("Samsung galaxy s7"));
		ele.click();
		break;
	}
  }
}
