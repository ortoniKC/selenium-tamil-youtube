package episode41;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// wait for title change
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[.='✕']").click();
		WebElement elec = driver.findElementByXPath("//span[.='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(elec).perform();
		WebElement apple = driver.findElementByLinkText("Apple");
		wait.until(ExpectedConditions.visibilityOf(apple));
		apple.click();
		wait.until(ExpectedConditions.titleContains("Apple1"));
		System.out.println(driver.getTitle());















		

		

		// wait for visible
	}

}

//invisibility
//driver.get("https://letcode.in/signin");
//driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
//driver.findElement(By.name("password")).sendKeys("Pass123$");
//driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
//WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
//wait.until(ExpectedConditions.visibilityOf(toast));
//System.out.println(toast.getText());
//wait.until(ExpectedConditions.invisibilityOf(toast));
//driver.findElement(By.linkText("Sign out")).click();

// Wait for alert
//driver.get("https://letcode.in/waits");
//driver.findElement(By.id("accept")).click();
//Alert until = wait.until(ExpectedConditions.alertIsPresent());
//System.out.println(until.getText());
//until.accept();
//driver.switchTo().alert().accept();