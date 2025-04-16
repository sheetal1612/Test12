package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class devtools {
	ChromeDriver driver;
	DevTools devtool;
	
	@BeforeMethod
  public void setup() {
		driver=new ChromeDriver();
		devtool=driver.getDevTools();
		devtool.createSession(driver.getWindowHandle());
  }
	@Test
	public void deviceModeTest() {
		Map deviceMetrics= new HashMap() {{
			put("width",600);
			put("height",800);
			put("deviceScaleFactor",50);
			put("mobile",true);
			
		}};
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://www.selenium.dev/");
	}
	
	@Test
	public void setGroLocationTest() {
		Map groLocationeMetrics= new HashMap() {{
			put("latitude",37.090240);
			put("longitude",-95.712891);
			put("accuracy",100);
			
		}};
		driver.executeCdpCommand("Emulation.setGeolocationOverride", groLocationeMetrics);
		driver.get("https://oldnavy.gap.com/stores");
	}
}
