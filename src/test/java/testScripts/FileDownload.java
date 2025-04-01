package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileDownload {
  @Test
  public void f() {
	  Map<String,Object> pref=new HashMap<String,Object>();
	  ChromeOptions opt=new ChromeOptions();
	  pref.put("download.prompt_for_download",false);
	  opt.setExperimentalOption("pref", pref);
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.selenium.dev/downloads/"); 
	  WebElement ele=driver.findElement(By.xpath("//*[text()='4.30.0']"));
 //     ele.click();
	 
	//  driver.findElement(By.xpath("//*[text()='Start upload']")).click();
      Actions ac=new Actions(driver);
      ac.scrollByAmount(100, 900).perform();
      ele.click();
  }
}
