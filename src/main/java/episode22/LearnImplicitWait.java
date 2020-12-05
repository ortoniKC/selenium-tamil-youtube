package episode22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("ema")
		.sendKeys("koushik350@gmail.com");
		driver.findElementByName("password")
		.sendKeys("Pass123$");
	}

}
