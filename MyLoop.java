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