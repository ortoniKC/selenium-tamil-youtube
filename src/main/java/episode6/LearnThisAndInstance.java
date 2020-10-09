package episode6;

public class LearnThisAndInstance {
	
	int d; // instance variable
	
	int num() {
		return 1;
	}
	
	void addTwoNumbers(int a, int b) {
		int c = 20; // local variable
		System.out.println(a+b+d);
		
//		System.out.println(c);
	}
	
	public static void main(String[] args) {
		LearnThisAndInstance ls = new LearnThisAndInstance();
		ls.addTwoNumbers(10, 5);
//		this.
	}
}
