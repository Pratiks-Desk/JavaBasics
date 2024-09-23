package HelloJava;

import java.util.Scanner;

public class IfElse_OddOrEvenNumber  {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Number :"+"\t");
		int num=sc.nextInt();
		System.out.println("You Enter :" + "\t"+num);

		if (num%2==0)
			System.out.println("Number is Even.!");	
		else
		System.out.println("number is Odd.");
	}

}
