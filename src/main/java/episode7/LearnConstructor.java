package episode7;

public class LearnConstructor {
	
	/*
	 * public LearnConstructor() { this.x = 1000; }
	 */
	
	
	protected LearnConstructor(int x) {
		this.x = x;
	}
	public LearnConstructor(int x, String s) {
		this.x = x;
		this.name = s;
	}
	
	int x;
	String name;
	
	void display() {
		System.out.println(x+ "--> "+ name);
	}
	public static void main(String[] args) {
		LearnConstructor ls = new LearnConstructor(1000);
		ls.display();
		LearnConstructor ls1 = new LearnConstructor(100, "LetCode");
		ls1.display();
	}

}
