package ParallerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleThreeTest {
	WebDriver driver;
	 @Test
	  public void sample1() {
		   driver= new ChromeDriver();
		   long id=Thread.currentThread().getId();
		   System.out.println("thread 1 : "+id);
		   
		  
	  }
}
