package episode24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement ele = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		builder.dragAndDropBy(ele, x+70, y+90).perform();
	}

}
