package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {

	public static void main(String[] args) throws Exception {
		test();
	}

public static void test() throws Exception {
	
	String projectLocation = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.tinyupload.com/");
	System.out.println("--------------");
	Thread.sleep(3000);
	driver.findElement(By.name("uploaded_file")).click();
	//driver.findElement(By.className("pole_plik")).click();
	System.out.println("--------------");
	
	Runtime.getRuntime().exec("C:\\Users\\Sachin\\Documents\\fileuploadscript.exe");
	
	Thread.sleep(3000);
	
	driver.close();
}
}
