package testNgBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	@DataProvider(name = "login")
	public String[][] getData() {
		String[][] data = new String[2][2];
		// row 1
		data[0][0] = "koushik350@gmail.com";
		data[0][1] = "Pass123$";

		data[1][0] = "koushik1@letcode.in";
		data[1][1] = "Pass123$";

		return data;
	}
	@Test(dataProvider = "login")
	public void login(String email, String pass) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementByName("email")
		.sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[.='LOGIN']").click();
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		driver.quit();
	}

}
