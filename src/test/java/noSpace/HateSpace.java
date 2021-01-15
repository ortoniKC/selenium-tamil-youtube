package noSpace;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HateSpace {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,	TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
		
		driver.findElementByClassName("button is-primary").click();
		System.out.println("completed");
	}

}
