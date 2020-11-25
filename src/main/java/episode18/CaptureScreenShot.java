package episode18;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		// get page screenshot
		File firstSrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img1.png");
		FileHandler.copy(firstSrc, dest);
		// get element screenshot
		WebElement ele = driver.findElementById("home");
		File eleSrc = ele.getScreenshotAs(OutputType.FILE);
		File eledst = new File("./snaps/img2.png");
		FileHandler.copy(eleSrc	, eledst);
		// get sections screenshot
		WebElement info = driver.findElementByClassName("has-background-info-light");
		eleSrc = info.getScreenshotAs(OutputType.FILE);
		eledst = new File("./snaps/img3.png");
		FileHandler.copy(eleSrc	, eledst);
		// quit the browser
		driver.quit();
	}
}








