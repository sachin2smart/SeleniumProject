package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSignupPage {
	
private static WebElement element = null;

	public static WebElement firstname_textbox(WebDriver driver){
		element = driver.findElement(By.name("firstname"));
		element.click();
		return element;
	}
	
	public static WebElement lastname_textbox(WebDriver driver) {
		element = driver.findElement(By.name("lastname"));
		element.click();
		return element;
	}
	
	public static WebElement phoneno_textbox(WebDriver driver) {
		element=driver.findElement(By.name("reg_email__"));
	
		return element;
	}

	public static WebElement newpassword_textbox(WebDriver driver) {
		element=driver.findElement(By.name("reg_passwd__"));
		return element;
	}
	
	public static WebElement gender_radiobutton(WebDriver driver) {
		element=driver.findElement(By.id("u_0_6"));
		return element;
	}
}

