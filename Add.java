package HelloJava;

public class Add {

	public static void main(String[] args) {

		// HelloClass add = new HelloClass();
		// int j = HelloClassCopy.add();

		Add add = new Add();
		int j = Add.add();
		System.out.println("The Addition of Hidden Number is :" + j);

	}

	static int add() {
		int num1, num2, sum;
		num1 = 452;
		num2 = 654;
		sum = num1 + num2;
		return sum;
	}
}
