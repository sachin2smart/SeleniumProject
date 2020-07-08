package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasic {
	private static WebDriver driver= null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		
		   // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        String projectLocation = System.getProperty("user.dir");
    	
    	//Set the chrome browser
    	System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
    	driver = new ChromeDriver();
    	
    	test.log(Status.INFO, "Starting test case");
    	test.pass("navigated to facebook.com");
    	
    	
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.name("firstname")).sendKeys("jessy");
    	test.pass("enter firstname");
    	
    	driver.close();
    	driver.quit();
    	test.pass("closed browser");
    	
    	test.info("test completed");
    	
    	extent.flush();

	}

}
