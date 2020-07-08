package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
static WebDriver driver=null;

	public static void main(String[] args) throws Exception {
	test();
	
	}
	
	public static void test() throws InterruptedException {
	    String projectLocation = System.getProperty("user.dir");
	     
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
//		driver.findElement(By.linkText("ABCD – American Born Confused Desi - Wikipedia")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		      WebElement linkElement = driver.findElement(By.linkText("ABCD – American Born Confused Desi - Wikipedia"));
		   
		     if(linkElement.isEnabled()) {
		    	 System.out.println("Element found");
		    	 }
		     return linkElement;
	    	 
		     }
		   });
		   
		   element.click();
		   

		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
	}

}
