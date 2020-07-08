package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FacebookSignupPage;

public class FacebookTest {
	private static WebDriver driver=null;

	public static void main(String[] args) {
		facebookSignup();
		
	}
	
	public static void facebookSignup() {
		String projectLocation = System.getProperty("user.dir");
		
		//Set the chrome browser
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
		driver = new ChromeDriver();
		
		//set the firefox browser
//		System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
//	    System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox");
//	    WebDriver driver = new FirefoxDriver();	
	
		//Goto the facebook signup page and enter first name
		driver.get("https://www.facebook.com/");
		FacebookSignupPage.firstname_textbox(driver).sendKeys("Sachiksha");
		
		//Enter the surname
		FacebookSignupPage.lastname_textbox(driver).sendKeys("	Shinde");
		   
		//Enter the phone no
		FacebookSignupPage.phoneno_textbox(driver).sendKeys("1234567891");
		
		//Enter the password
		FacebookSignupPage.newpassword_textbox(driver).sendKeys("abc@1123");
		
		//Select gender
		FacebookSignupPage.gender_radiobutton(driver).click();
		
		    //Close the browser
		  driver.close();
		  System.out.println("Facebook Signup completed successfully!!!!!!!!!!!!!");
		
	}
}
