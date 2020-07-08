package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadlessChromeDemo {

	public static void main(String[] args) throws Exception {
	test();
	}
	
	public static void test() throws Exception {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1360,768");
		
		WebDriver driver = new ChromeDriver(options);
		
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		System.out.println(driver.getTitle());
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
	
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("Completed");
	
		driver.close();
		driver.quit();
	}

}
