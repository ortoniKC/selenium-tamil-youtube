package episode15;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_HandlingInputs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/edit");
		// Enter your full Name
		driver.findElementById("fullName").sendKeys("Koushik Chatterjee");

		// Append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" person", Keys.TAB);
		
		// What is inside the text box
		String myValue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(myValue);

		// Clear the text
		driver.findElementById("clearMe").clear();

		// Confirm edit field is disabled
		boolean isEdit = driver.findElementById("noEdit").isEnabled();
		System.out.println(isEdit);

		// Confirm text is readonly
		String isReadOnly = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(isReadOnly);
		
		// quit browser
		driver.quit();
	}

}
