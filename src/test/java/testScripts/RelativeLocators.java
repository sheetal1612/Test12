package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://automationbookstore.dev/");
	  String details=driver.findElement(with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1"))).getDomAttribute("id");
	  System.out.println("details"+details);
	  driver.close();
	  
  }
}
