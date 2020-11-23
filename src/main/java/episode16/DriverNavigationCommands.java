package episode16;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		String url = driver.getCurrentUrl();
		System.out.println("Button page URL "+ url);
		Thread.sleep(3000);
		driver.findElementById("home").click();
		String homeURL = driver.getCurrentUrl();
		System.out.println("Home page URL "+ homeURL);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("retuns to button page "+driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/signin");
		
		
		/*
		 * Navigation nav = driver.navigate();
		 * nav.back(); 
		 * nav.forward();
		 * nav.refresh();
		 * nav.to("");
		 */
		
		
	}

}
