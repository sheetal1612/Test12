package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/"); 
	  WebElement ele=driver.findElement(By.xpath("//*[@type='file']"));
	//  ele.click();
	  String path= System.getProperty("user.dir")+"//Screenshots//"+"1743068085728.png";
	  ele.sendKeys(path);
	  driver.findElement(By.xpath("//*[text()='Start upload']")).click();
  }
}
