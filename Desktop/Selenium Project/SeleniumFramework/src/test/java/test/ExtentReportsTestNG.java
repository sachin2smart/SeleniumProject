package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver=null;
	
@BeforeSuite
	public void setUp() {
 htmlReporter = new ExtentHtmlReporter("extentreports2.html");
 // create ExtentReports and attach reporter(s)
  extent = new ExtentReports();
 extent.attachReporter(htmlReporter);
}
 
 @BeforeTest
 public void setUpTest() {
	 String projectLocation = System.getProperty("user.dir");
		
		//Set the chrome browser
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application");
		driver = new ChromeDriver();
 }
 	
@Test
	public void test1() throws Exception {
	driver.get("https://www.facebook.com");
	
	ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	// log(Status, details)
    test.log(Status.INFO, "This step shows usage of log(status, details)");

    // info(details)
    test.info("This step shows usage of info(details)");
    
    // log with snapshot
    test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    
    // test with snapshot
    test.addScreenCaptureFromPath("screenshot.png");
	}

@AfterTest
public void tearDownTest() {
	driver.close();
	driver.quit();
	extent.flush();
System.out.println("Test completed successfully......");
}
	
@AfterSuite
	public void tearDown(){
		extent.flush();
	}
}
