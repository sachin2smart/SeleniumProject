package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver=null;
	String projectLocation = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName ) {
		System.out.println("Browser name is "+browserName);
		System.out.println("Thread id is "+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"\\drivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}

		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",projectLocation+"\\drivers\\iedriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Test completed successfully");
	}
}
