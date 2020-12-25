package episode30;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageDriver {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in");
		driver.quit();
	}
}
