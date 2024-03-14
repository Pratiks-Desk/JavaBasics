package HelloJava;

import java.util.Scanner;

public class ExceptionHandaling {

	public static void main(String[] args) {

		int a = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number first time");
		int b = sc.nextInt();

		int div = 0;

		try {
			div = a / b;
		}

		catch (ArithmeticException art) {
			System.out.println("Please enter valid number");
			b = sc.nextInt();
			div = a / b;
		}

		catch (NullPointerException art) {
			System.out.println("Please enter valid number");
			b = sc.nextInt();
			div = a / b;
		}

		finally {
			System.out.println("Finally block is always executed");
		}

		System.out.println(div);

	}

}
