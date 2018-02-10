package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public static String baseURL="https://www.expedia.com/Flights";
	
	
	public static void initBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		}
	
	
	
	
	

}
