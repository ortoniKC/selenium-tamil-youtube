package testNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParamters {
	RemoteWebDriver driver;
	@Parameters({"emailId", "password", "browser"})
	@Test
	void login(String email, String pass, String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("browser is not defined");
			break;
		}
		System.out.println(email + " "+ pass);
		driver.get("https://letcode.in/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("email")
		.sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[.='LOGIN']").click();
		String title = driver.getTitle();
		System.out.println("Title is "+title);
	}

}
