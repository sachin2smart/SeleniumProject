package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookSignupPageObject;

public class FacebookSignupPageTest {
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		facebookSignupTest();
	}

	public static void facebookSignupTest() {
String projectLocation = System.getProperty("user.dir");
		
		//Set the chrome browser
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
		driver = new ChromeDriver();
		
		FacebookSignupPageObject signupPageObject = new FacebookSignupPageObject(driver);
		driver.get("https://www.facebook.com/");
		
		signupPageObject.setFirstname("SACHIKSHA");
		signupPageObject.setSurname("SHINDE");
		signupPageObject.setPhoneno("1234567891");
	    signupPageObject.setPassword("abc@123");
	    signupPageObject.setGender();
		
	}
}
