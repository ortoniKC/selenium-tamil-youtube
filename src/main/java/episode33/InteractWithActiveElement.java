package episode33;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithActiveElement {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
//		driver.getsc
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText(""));
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("email",
				Keys.TAB,
				"Password",
				Keys.ENTER);

	}
}
