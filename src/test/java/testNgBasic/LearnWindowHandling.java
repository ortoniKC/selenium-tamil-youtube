package testNgBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandling {
	
	@Test
	public void windowHandling() {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		String windowHandle = driver.getWindowHandle();
		System.out.println("first Window: "+windowHandle);
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();
		
		
	}
	
}
