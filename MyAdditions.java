package HelloJava;

public class MyAdditions {

	public static void main(String[] args) {
		int no1, no2, plus;
		MyAdditions add = new MyAdditions();
		int j = add.add();
		System.out.println("The Addition of Hidden Number is :\t" + j);

		System.out.println("Here is another");
		no1 = 4564;
		no2 = 3214;
		plus = no1 + no2;
		System.out.println("The Addition of Hidden Number is :\t" + plus);

	}

	public int add() {
		int num1, num2, sum;
		num1 = 787;
		num2 = 458;
		sum = num1 + num2;
		return sum;
		// System.out.println("the Addition of Hidden number is :" + sum);

	}

}
