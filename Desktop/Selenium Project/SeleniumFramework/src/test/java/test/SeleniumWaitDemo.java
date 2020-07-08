package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.FacebookSignupPage;

public class SeleniumWaitDemo {
	static WebDriver driver=null;
	public static void main(String[] args){
		SeleniumWaits();
		
	}
	
	@SuppressWarnings("deprecation")
	public static void SeleniumWaits() {
		try {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//250 ms by default
		
		driver.get("https://www.facebook.com/");
		FacebookSignupPage.firstname_textbox(driver).sendKeys("Sachiksha");
		FacebookSignupPage.lastname_textbox(driver).sendKeys("Shinde");
		
		WebDriverWait wait =  new WebDriverWait(driver, 2);
		
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		}
		
//		driver.findElement(By.name("diksha")).click();
		finally {
	    driver.close();
		}
}
}
