package testNgBasic;

import org.testng.annotations.Test;

public class LearnAttributes1 {
	@Test(priority = 1)
	public void signUp() {
		System.out.println("signUp");
	}
	@Test(dependsOnMethods = "testNgBasic.LearnAttributes1.signUp", priority = -1)
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("search Product");
	}
	
	
	@Test(/* dependsOnMethods = "searchProduct" */ priority = 3)
	public void addToCart() {
		System.out.println("add to cart");
		throw new RuntimeException();
	}

	@Test(/* dependsOnMethods = "addToCart" */ priority = 4)
	public void signOut() {
		System.out.println("sign out");
	}


}
