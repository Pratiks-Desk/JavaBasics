package HelloJava;

import java.util.Scanner;

public class ArithmaticOprationsWithNumbers {

	public static void main(String[] args) throws InterruptedException {

		// int[] marks = { 78, 98, 45, 78, 88 };
		// String Addition, Subtraction,Multiplication,Division, Modulous ;
		String array[] = { "Addition", "Subtraction", "Multiplication", "Division", "Modulous" };

//	System.out.println(marks.length);
//		System.out.println(array.length);
		Scanner scan = new Scanner(System.in);

		// ---------- Taking Input Numbers to perform operation on them -----------//

		System.out.println("\t\t " + "If yoy want to perform Arithmatic operations on two numbers.");
		System.out.println("Then Enter your first number here :\t");

		int first_Num = scan.nextInt();

		System.out.println("Then Enter your another number here :\t");
		int second_Num = scan.nextInt();

		Thread.sleep(1200);
		System.out.println("ohk !! Your Entered Numbers are " + first_Num + " " + " & " + second_Num);

		// -------------------------------------------------------------------------------------------------------------//

		// ------------ Options of Operation ----------//

		System.out.println("\n Select indexing Number of Your Operation from the list given below : \t");
		Thread.sleep(1000);
		System.out.print("\n \t\t 1.Addition \t 2. Subtraction \t 3. Multiplication");
		System.out.println("\n \t\t 4.Division \t 5. Modulous ");

		// -------------------------------------------------------------------------------------------------------------//
		Thread.sleep(500);
		// ********* Logic to read the operation in array and user input ********//
		int input = scan.nextInt();

		System.out.print("\n \t\t Your Operatio" + "n: \t" + input);
//		Thread.sleep(500);
		// ---------------------- Performing Actual Operation Using If.. Statement
		// -------------------------//

		for (int i = 1; i <= 5; i++) {

			if (input > 5) {
				System.out.println("\n \t\t Oops , You Entered Invalid Option...");
				break;
			}

			if (input == i) {
				input = input - 1;
				System.out.println("\nThe name of your selected operation is:\t" + array[input]);

				if (i == 1) {
					int sum = first_Num + second_Num;
					System.out.println("The Additionn of Given numbers is :\t " + sum);
					break;
				}

				if (i == 2) {
					int sub = first_Num - second_Num;
					System.out.println("The Subtraction of Given numbers is :\t " + sub);
					break;
				}

				if (i == 3) {
					int mul = first_Num * second_Num;
					System.out.println("The Multiplication of Given numbers is :\t " + mul);
					break;
				}

				if (i == 4) {
					int div = first_Num / second_Num;
					System.out.println("The Division of Given numbers is :\t " + div);
					break;
				}

				if (i == 5) {
					int mod = first_Num % second_Num;
					System.out.println("The Modulous of Given numbers is :\t " + mod);
					break;
				}
				// ------------------------------- Actual operation was performd
				// -------------------------//
			}

		}

//		System.out.println(array[input]);
		// *************** end of that araay and user input logic ***************//
		Thread.sleep(500);

		System.out.println("\n\n!!--------------------------- THANK YOU ---------------------------!!");

		scan.close();
	}

}
