package testNgBasic;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class LearnAttributes2 {
	@Test(description = "this is used to do the sign up")
	public void signUp() {
		System.out.println("signUp");
	}
//	@Test()
//	public void login() {
//		System.out.println("login");
//		throw new NoSuchElementException("element not there");
//	}
	/*
	 * @Test(dependsOnMethods = "testNgBasic.LearnAttributes2.login", alwaysRun =
	 * true) public void searchProduct() { System.out.println("search Product"); }
	 */
	

}
