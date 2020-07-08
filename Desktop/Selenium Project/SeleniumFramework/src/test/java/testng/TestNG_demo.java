package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_demo {
	WebDriver driver=null;
	public static String  browsername=null;
	
	@BeforeTest
public void setUpTest() throws IOException {
		String projectLocation = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if (browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("Firefox")){ 
		System.setProperty("webdriver.gecko.driver",projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
	    driver = new FirefoxDriver();	
		}
		
}
	@Test
	public void practiceForm() {
		//Goto the selenium practice form
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//Enter the first name
		   WebElement firstname = driver.findElement(By.name("firstname"));
		   firstname.sendKeys("Diksha");
		   
		//Enter the last name
		   WebElement lastname =  driver.findElement(By.name("lastname"));
		   lastname.sendKeys("Kalbhor");
	}
	
	@AfterTest
		   public void tearDownTest() throws IOException {
				driver.close();
				driver.quit();
				System.out.println("Test completed successfully!!!!!!!!!!!!!");
				PropertiesFile.setProperties(); 
			}
			
}
