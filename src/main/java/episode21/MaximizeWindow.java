package episode21;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
		/*
		 * driver.manage() .window() .maximize();
		 */
		
		
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
	}

}
