package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import configManager.ConfigReader;
import factory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	WebDriver driver;
	private ConfigReader configReader;
	
	@Before
	public void setUp() {
		configReader = new ConfigReader();
		Properties prop = configReader.initializeProperties();
		driver = DriverManager.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		String scenarioName = scenario.getName().replaceAll(" ", "_");
		if(scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", scenarioName);
		}
		driver.quit();
	}
	
}
