package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "H:\\Hoang Long\\E-learning\\SeleniumWebdriver\\SeleniumPractise\\SeleniumWebdriverUdemyV2\\geckodriver.exe");

		String baseURL = "https://letskodeit.teachable.com/p/practice";
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN8_1);
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
						
	}

}
