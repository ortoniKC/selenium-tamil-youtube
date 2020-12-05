package episode20;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/frame");
		WebElement myFrame = driver.findElementByXPath("//iframe[@src='frameUI']");
//		driver.switchTo().frame(myFrame);
//		driver.findElementByName("fname").sendKeys("koushik");
//		driver.findElementByName("lname").sendKeys("C");
		driver.switchTo().frame(0).switchTo().frame(0);
		driver.findElementByName("email").sendKeys("email");
//		driver.switchTo().parentFrame();
//		driver.findElementByName("lname").sendKeys("Chatterjee");
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//button[text()=' Refer the video ']").click();
	}

}
