package episode27;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElementById("fruits")
		WebElement fruits = driver.findElementByCssSelector("#fruits");
		Select myFruits = new Select(fruits);
		myFruits.selectByVisibleText("Apple");
		myFruits.selectByVisibleText("Banana");
		System.out.println(myFruits.isMultiple());
		List<WebElement> allFruits = myFruits.getOptions();
		allFruits.forEach(i -> System.out.println(i.getText()));
		
		WebElement country = driver.findElementById("country");
		Select myCountry = new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry = myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		
		WebElement heros = driver.findElementById("superheros");
		Select myHeros = new Select(heros);
		boolean isMul = myHeros.isMultiple();
		System.out.println("Is Multiple? "+isMul);
		myHeros.selectByIndex(1);
		myHeros.selectByValue("bt");
		// TODO: loops
		List<WebElement> allHeros = myHeros.getAllSelectedOptions();
		for (WebElement webElement : allHeros) {
			System.out.println(webElement.getText());
		}
		
		myHeros.deselectByIndex(1);
		
		
//		myFruits.deselectByVisibleText("Banana");
		
		
		
		// bootStrap dd
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElementByXPath("(//div[contains(@class,'ui selection')])[1]").click();
		driver.findElementByXPath("(//div[text()='Male'])[1]").click();
	}

}
