package episode43;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnThrowVSThrows {

	public void code(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}
	public static void main(String[] args)  {
		LearnThrowVSThrows lts = new LearnThrowVSThrows();
		lts.test();
		//		lts.code();
	}


	public void test(){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		try {
			driver.findElement(By.name("email1")).sendKeys("koushik350@gmail.com");
		} catch (NoSuchElementException e) {
			System.err.println("Element not found");
			throw new RuntimeException();
		}
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		driver.quit();
	}



}










