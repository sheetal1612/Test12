package ParallerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class sampleTwoTest {
	WebDriver driver;
	  @Test
	  public void sample1() {
		   driver= new ChromeDriver();
		   long id=Thread.currentThread().getId();
		   System.out.println("thread 1 : "+id);
		   
		  
	  }
	  @Test
	  public void sample2() {
		   driver= new EdgeDriver();
		   long id=Thread.currentThread().getId();
		   System.out.println("thread 2 : "+id);
		   
		  
	 }
	  @Test
	  public void sample3() {
		   driver= new ChromeDriver();
		   long id=Thread.currentThread().getId();
		   System.out.println("thread 3 : "+id);
		   
	 }
	  @Test
	  public void sample4() {
		   driver= new EdgeDriver();
		   long id=Thread.currentThread().getId();
		   System.out.println("thread 4 : "+id);
		   
		  
	 }
  }

