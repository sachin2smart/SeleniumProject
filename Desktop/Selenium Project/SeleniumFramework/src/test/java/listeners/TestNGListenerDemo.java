package listeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import junit.framework.Assert;


public class TestNGListenerDemo {

	@Test
	public void Test1(){
		System.out.println("I am inside test1");
	}
	@Test
	public void Test2(){
		System.out.println("I am inside test2");
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		   WebElement firstname = driver.findElement(By.name("firstname"));
		   firstname.sendKeys("Diksha");
		   WebElement lastname = driver.findElement(By.name("lasname"));
		   lastname.sendKeys("Diksha");
		   driver.close();
		  
		   
		
		
//		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
//	    System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox");
//	    driver = new FirefoxDriver();	
	}
	@Test
	public void Test3(){
		System.out.println("I am inside test3");
		throw new SkipException("This test is skipped");
	}

}
