package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class DesiredCapabilities {

	static WebDriver driver = null;
	
	@BeforeTest
public static void main(String[] args) {
	String projectLocation = System.getProperty("user.dir");
	
	DesiredCapabilities caps= new DesiredCapabilities();
	caps.setCapability("ignoreProtectedModeSettings", true);

		
		//Set the ie browser
		System.setProperty("webdriver.ie.driver",projectLocation+"\\drivers\\iedriver\\IEDriverServer.exe");
//		System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
		driver = new InternetExplorerDriver();

		driver.get("http://facebbook.com");
		driver.findElement(By.name("firstname")).sendKeys("Desired");
		driver.findElement(By.name("lastname")).sendKeys("Capabilities");
		driver.close();
		driver.quit();
	}

private void setCapability(String string, boolean b) {
	// TODO Auto-generated method stub
	
}

}
