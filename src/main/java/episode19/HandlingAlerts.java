package episode19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
//Notes:
//Exception: 
//1. UnhandledAlertException
//2. NoAlertPresentException
public class HandlingAlerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/alert");
		// accept
		driver.switchTo().alert().accept();
		driver.findElementById("accept").click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alert text "+text);
		alert.accept();
		// prompt
		driver.findElementById("prompt").click();
		//		System.out.println(driver.getCurrentUrl());
		driver.switchTo().alert();
		alert.sendKeys("koushik");
		System.out.println(alert.getText());
		alert.accept();
		String name = driver.findElementById("myName").getText();
		System.out.println(name);		
	}

}








