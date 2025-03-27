package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxes {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.findElement(By.xpath("//*[@type='checkbox'][1]")).click();
	  WebElement secondCheckBox=driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
	  if(secondCheckBox.isSelected())
	  {
		  secondCheckBox.click();
	  }
  }
}
