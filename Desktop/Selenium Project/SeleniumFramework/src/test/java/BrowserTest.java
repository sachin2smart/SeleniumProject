import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	static WebDriver driver;
	
public static void main(String[] args) {	
	setBrowserConfig();
	   runTest();
	
}

public static void setBrowserConfig() {
	String projectLocation = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
	driver = new ChromeDriver();
	
//	System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
//    System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox");
//    driver = new FirefoxDriver();	


//			System.setProperty("webdriver.ie.driver",projectLocation+"\\drivers\\iedriver\\IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
	
}

public static void runTest() {
    driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
   WebElement firstname = driver.findElement(By.name("firstname"));
   firstname.sendKeys("Diksha");
   
  List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));  
  int count = listOfInputElements.size();
  System.out.println("Count of input elements is " +count);
	driver.quit();
}
}
