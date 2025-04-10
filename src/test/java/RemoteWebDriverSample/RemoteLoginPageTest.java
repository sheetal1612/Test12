package RemoteWebDriverSample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RemoteLoginPageTest {
	WebDriver driver;
  @Test
  public void seleniumSearch() throws MalformedURLException {
	  ChromeOptions cp=new ChromeOptions();
	  cp.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  String hub=" http://10.0.12.25:4444/";
      driver=new RemoteWebDriver(new URL(hub),cp);
      driver.navigate().to("https://the-internet.herokuapp.com/login");
		 driver.findElement(By.id("username")).sendKeys("tomsmith");
		 driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		 driver.findElement(By.className("radius")).click();
		boolean msg= driver.findElement(By.xpath("//*[@class='flash success']")).isDisplayed();
  }
}


