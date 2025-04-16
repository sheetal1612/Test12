package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class booksSerach {
	WebDriver driver= new ChromeDriver();
	 @Test(priority=1)
	public void user_is_on_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    driver.get("https://danube-webshop.herokuapp.com/");
	}

	 @Test(priority=2)
	public void user_search_novels_and_stories() throws InterruptedException {
		 Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[text()='Novels & Stories']")).click();
	   
	}

	 @Test(priority=3)
	public void should_display_novel_result_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(2000);
	    String str=driver.getCurrentUrl();
	    Assert.assertTrue(str.contains("novel"));
	}
	 @Test(priority=4)
	public void user_search_crime() throws InterruptedException {
		 Thread.sleep(2000);
	 
	}

	 @Test(priority=5)
	public void should_display_crime_result_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(3000);
	    String str=driver.getCurrentUrl();
	    Assert.assertTrue(str.contains("crime"));}

	}
	
	

	

