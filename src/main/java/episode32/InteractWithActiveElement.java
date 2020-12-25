package episode32;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithActiveElement {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
