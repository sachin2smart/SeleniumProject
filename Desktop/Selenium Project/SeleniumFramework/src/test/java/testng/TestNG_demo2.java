package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo2 {
	WebDriver driver=null;
	
	@BeforeTest
public void setUpTest() {
	String projectLocation = System.getProperty("user.dir");
	
	//Set the chrome browser
	System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
	driver = new ChromeDriver();
}
	@Test
	public void practiceForm1() {
		//Goto the selenium practice form
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//Enter the first name
		   WebElement firstname = driver.findElement(By.name("firstname"));
		   firstname.sendKeys("Diksha");
		   
		//Enter the last name
		   WebElement lastname =  driver.findElement(By.name("lastname"));
		   lastname.sendKeys("Kalbhor");
	}
	
	@Test
	public void practiceForm2() {
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
		   public void tearDownTest() {
				driver.close();
				driver.quit();
				System.out.println("Test completed successfully!!!!!!!!!!!!!");
			}
			
}
