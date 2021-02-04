package episode42;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Enter some input");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			int a = num % 0;
			System.out.println(a);
		}catch (ArithmeticException e) {
			System.err.println("Divivible by 0 not possible");
		}catch (InputMismatchException e) {
			System.err.println("Input must be number");
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			sc.close();	
		}
		System.out.println("completed");

	}

}
