package episode12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {
	
	public static void main(String[] args) {
		// fox
		System.setProperty("webdriver.gecko.driver",
				"./drivers/geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();
		
	}

}
