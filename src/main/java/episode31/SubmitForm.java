package episode31;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitForm {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElementByName("")
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).submit();
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("home")).submit();
	}
}
