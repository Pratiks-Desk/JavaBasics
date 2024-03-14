package HelloJava;

public class HelloClassCopy {

	public static void main(String[] args) {

		//HelloClass add = new HelloClass();
		int l = MyAdditions.add();
		int j = HelloClass.add();
		System.out.println("The Addition of Hidden Number is :"+j);
		System.out.println("Another Addition of Hidden Number is :"+l);
		
	}
	
	static int add() {
		int num1,num2,sum;
		num1=452;
		num2=654;
		sum=num1+num2;
		return sum;
	}
}