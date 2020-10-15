package episode8;

public class LearnStatic {
	
	int x = 0;
	static int y =0;
	
	void counter() {
		x++;
		y++;
		System.out.println("non-static => "+x+ " static => "+y);
	}
	
	public static void main(String[] args) {
		LearnStatic ls = new  LearnStatic();
		ls.counter();
		ls.counter();
		System.out.println("Once again created object");
		LearnStatic ls2 = new  LearnStatic();
		ls2.counter();
		ls2.counter();
		LearnStatic ls3 = new  LearnStatic();
		ls3.counter();
		ls3.counter();
		
		
	}

}
