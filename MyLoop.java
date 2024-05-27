package HelloJava;

public class MyLoop {

	public static void main(String[] args) {
		int num = 1;

		System.out.println("----------++++++++++++++++----------\n");

		System.out.println("Before For Loop , The Value Of i is :\t "+num + "\n");
//		For Loop

		for (int i = num; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n\n----------++++++++++++++++----------\n");

//		While Loop
		System.out.println("Before While Loop , The Value Of i is :\t "+num + "\n");

		while (num <= 10) {
			System.out.print(num + "\t");
			num++;
		}

		System.out.println("\n\n----------*************----------\n");
		System.out.println("Before Do...While Loop , The Value Of i is :\t "+num + "\n");

//		Do..While Loop

		do {
			System.out.print(num + "\t");
			num--;
		} while (num > 1);

	}
}

/*This Java program demonstrates the usage of different types of loops: for, while, and do-while. Let's break down each part:

main Method:
The main method is the entry point of the program.
It initializes a variable num with the value 1.
for Loop:
The program starts by printing a separator line.
It then prints the value of num before entering the for loop.
The for loop iterates from the current value of num (1) up to 10.
Inside the loop, it prints the value of the loop variable i.
After the loop, it prints another separator line.
while Loop:
Similar to the for loop, the program prints the value of num before entering the while loop.
The while loop continues as long as num is less than or equal to 10.
Inside the loop, it prints the current value of num and then increments it.
After the loop, it prints another separator line.
do-while Loop:
Before entering the do-while loop, the program prints the value of num.
The do-while loop executes the loop body at least once.
Inside the loop, it prints the current value of num and then decrements it.
The loop continues as long as num is greater than 1.
After the loop, it prints another separator line.
Output:
The program prints the values of num and i as they change through the loops.
Each loop type demonstrates a different way to iterate over a sequence of numbers.
Additional Notes:
The program uses escape sequences (\t for tabs and \n for new lines) to format the output.
The loops demonstrate different looping constructs available in Java, each with its own syntax and use cases.*/
