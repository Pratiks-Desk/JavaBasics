package HelloJava;

import java.util.Scanner;

public class TryCatchBlock {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		Scanner scanner = new Scanner(System.in);

			System.out.println("Enter any valid number: ");
			String input = scanner.nextLine();
			try {
				b = Integer.parseInt(input);
				System.out.println("you entered : " + b);
			} catch (NumberFormatException e) {
				System.out.println("Invalid number. please enter any valid number.");
				return;
			}
	
		 
			finally {
				System.out.println("IT's Finally block and Finally block always executes");
			}

	}

}
