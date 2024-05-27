package HelloJava;

import java.util.Scanner;

public class ExceptionHandaling {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int div;
		boolean validnum = false;
		Scanner scanner = new Scanner(System.in);

		while (!validnum) {
			System.out.println("Enter any valid number: ");
			String input = scanner.nextLine();
			try {
				b = Integer.parseInt(input);
				validnum = true;
				System.out.println("you entered : " + b);
			} catch (Exception e) {
				System.out.println("Invalid number. please enter any valid number.");
			}
		
		}
		 div = 0;

			try {
				div = a / b;
			}


			finally {
				System.out.println("this msg is displayed,b'oz It's finally block. and Finally block always executes");
			}

			System.out.println("div= "+ div);

	}

}
