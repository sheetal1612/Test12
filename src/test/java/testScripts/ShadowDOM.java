package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShadowDOM {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/shadowdom"); 
	  WebElement shadowhost=driver.findElement(By.xpath("//my-paragraph[1]"));
	  SearchContext shadowRoot= shadowhost.getShadowRoot();
 //     ele.click();
	 
	  String value=shadowRoot.findElement(By.cssSelector("*[name='my-text']")).getText();
      System.out.println("value is:"+value);
  }
}
