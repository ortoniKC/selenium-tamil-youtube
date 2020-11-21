package episode14;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		// load the URL
		driver.get("https://letcode.in/");
		
		// click login btn
		driver.findElementByLinkText("Log in").click();
		// enter email id
		driver.findElementByName("email")
		.sendKeys("koushik350@gmail.com");
		// enter password
		driver.findElementByName("password")
		.sendKeys("Pass123$");
		// click login btn
		driver.findElementByXPath("//button[.='LOGIN']").click();

	}

}
