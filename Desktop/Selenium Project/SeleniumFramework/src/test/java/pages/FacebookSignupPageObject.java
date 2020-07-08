package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookSignupPageObject {
	WebDriver driver=null;
	
By textbox_firstname=By.name("firstname");
By textbox_surname=By.name("lastname");
By textbox_phoneno=By.name("reg_email__");
By textbox_password=By.name("reg_passwd__");
By radiobutton_gender=By.id("u_0_6");

public FacebookSignupPageObject(WebDriver driver) {
	this.driver=driver;
	}

public void setFirstname(String text) {
	driver.findElement(textbox_firstname).sendKeys(text);
}

public void setSurname(String text) {
	driver.findElement(textbox_surname).sendKeys(text);
}

public void setPhoneno(String text) {
	driver.findElement(textbox_phoneno).sendKeys(text);
}

public void setPassword(String text) {
	driver.findElement(textbox_password).sendKeys(text);
}

public void setGender() {
	driver.findElement(radiobutton_gender).click();
}
}
