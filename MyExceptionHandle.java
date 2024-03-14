package HelloJava;

import java.util.Iterator;
import java.util.Scanner;

public class MyExceptionHandle {
	public static void main(String[] args) {

		int num1, num2, sum, op;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Your First number :\t");
		num1 = scan.nextInt();
		System.out.println("\n \t\t okey your endered 1st num is :\t" + num1);

		System.out.print("Enter Your Second number :\t");
		num2 = scan.nextInt();
		System.out.println("\n \t\t okey your endered 2nd num is :\t" + num2);

		System.out.println("Ok now select option of operation which you want to perform with your number.");
		System.out.println("\t 1. Addition \t 2. Subtraction \t 3. Multiplication");
		op = scan.nextInt();

		for (int i = 0; i < 4; i++) {
			if (op == i) {
				if (i == 1) {
					sum = num1 + num2;
					System.out.println("The Additionn of Given numbers is :\t " + sum);
					break;
				}

				if (i == 2) {
					int sub = num1 - num2;
					System.out.println("The Subtraction of Given numbers is :\t " + sub);
					break;
				}

				if (i == 3) {
					int mul = num1 * num2;
					System.out.println("The Multiplication of Given numbers is :\t " + mul);
					break;
				}
				if (i == 4) {

					int div = num1 / num2;
					System.out.println("The Multiplication of Given numbers is :\t " + div);
					break;

				}

			}
			if (op >= 4) {
				System.out.println("Sorry Your Entered option is not available..");
				break;
			}

		}

	}

}
