package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		practiceForm();
		
	}
	
	public static void practiceForm() {
		String projectLocation = System.getProperty("user.dir");
		
		//Set the chrome browser
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
		WebDriver driver = new ChromeDriver();
		
		//set the firefox browser
//		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
//	    System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox");
//	    WebDriver driver = new FirefoxDriver();	
	
		//Goto the selenium practice form
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//Enter the first name
		   WebElement firstname = driver.findElement(By.name("firstname"));
		   firstname.sendKeys("Diksha");
		   
		//Enter the last name
		   WebElement lastname =  driver.findElement(By.name("lastname"));
		   lastname.sendKeys("Kalbhor");
		   
		//Close the browser
		  driver.close();
		  
		  System.out.println("Test completed successfully!!!!!!!!!!!!!");
		
	}
}
