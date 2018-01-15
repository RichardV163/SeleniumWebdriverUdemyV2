package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver"
				, "H:\\Hoang Long\\E-learning\\SeleniumWebdriver\\SeleniumPractise\\SeleniumWebdriverUdemyV2\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
	}
}
