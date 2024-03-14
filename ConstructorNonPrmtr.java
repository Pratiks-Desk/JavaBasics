package HelloJava;

public class ConstructorNonPrmtr {

	int RollNum, Age;
	String Name, Clg;
	float Marks;
	
	ConstructorNonPrmtr()
	{
		RollNum=101;
		Name= "Rahul Pail";
		Age=21;
		Clg= "DK College";
		Marks=89.6f;
	}
	
	void display() {
		System.out.println("Student Id    :-\t"+RollNum);
		System.out.println("Student Name  :-\t"+Name);
		System.out.println("College Name  :-\t"+Clg);
		System.out.println("Student Age   :-\t"+Age);
		System.out.println("Student Marks :-\t"+Marks);
	}
	
	public static void main(String[] args) {
		ConstructorNonPrmtr Detail= new ConstructorNonPrmtr();
		Detail.display();

	}

}
