package episode26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://play.letcode.in/contextmenu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElementByClassName("mat-list-item-content");
		Actions builder = new Actions(driver);
		builder.contextClick(ele).perform(); // Right click
		driver.findElementByXPath("//button[.='Click me']").click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.quit();
		
	}

}
