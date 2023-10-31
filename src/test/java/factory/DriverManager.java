package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
	
	static WebDriver driver;
	
	public static WebDriver initializeBrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browsername.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
