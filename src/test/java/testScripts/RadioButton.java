package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
  @Test
  public void f() {
  
  WebDriver driver= new ChromeDriver();
  driver.get("https://testautomationpractice.blogspot.com/");
  driver.findElement(By.xpath("//*[text()='Female']")).click();
}
}
