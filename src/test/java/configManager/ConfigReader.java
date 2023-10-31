package configManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public Properties initializeProperties() {
		Properties prop = new Properties();		
		try {			
			File file = new File(System.getProperty("user.dir")+"\\src\\test\\resource\\config\\config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
