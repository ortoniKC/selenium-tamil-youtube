package testNgBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParamters {
	@Parameters({"emailId", "password"})
	@Test
	void login(String email, String pass) {
		System.out.println(email + " "+ pass);
		ChromeDriver driver =  new ChromeDriver();
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
