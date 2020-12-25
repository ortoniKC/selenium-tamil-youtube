package episode29;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// 1. isDisplayed - used to check if the element is visible or rendered 
		driver.get("https://letcode.in");
		WebElement logIn =	driver.findElementByLinkText("Log in");
		boolean displayed = logIn.isDisplayed(); System.out.println("Login btn: "+displayed);



		// 2. isEnabled - if the element is intractable


		driver.get("https://letcode.in/edit");
		WebElement edit = driver.findElementById("noEdit"); System.out.println(edit.isEnabled());

		driver.get("https://letcode.in/buttons");
		boolean enabled = driver.findElementById("isDisabled").isEnabled();
		System.out.println(enabled);

		driver.get("https://semantic-ui.com/elements/button.html");
		WebElement btn = driver.findElementByXPath("//button[text()[normalize-space()='Followed']]");
		System.out.println(btn.isEnabled()); 
		String attribute =  btn.getAttribute("class");
		System.out.println(attribute.contains("disabled"));

		// 3. isSelected - if the element is already selected - radio, check box

		driver.get("https://letcode.in/radio");
		WebElement remember = driver.findElementByXPath("(//label[@class='checkbox']//input)[1]");
		System.out.println(remember.isSelected());

		// quit the browser
		driver.quit();
	}
}
