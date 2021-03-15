package testNgBasic;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups = {"smoke", "sanity"})
	public void signUp() {
		System.out.println("signUp");
	}
	
	@Test(groups = {"reg"})
	public void login() {
		System.out.println("login");
	}
	
	@Test(groups = {"sanity"})
	public void searchProduct() {
		System.out.println("search Product");
	}


	@Test(groups = {"smoke"})
	public void addToCart() {
		System.out.println("add to cart");
	}

	@Test(groups = {"reg"})
	public void signOut() {
		System.out.println("sign out");
	}
}
