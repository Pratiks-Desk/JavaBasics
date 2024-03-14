package HelloJava;

public class JavaConstructor {

//								Instance Variables

	int Id,Age;
	String Name;
	String College;
	float Percentage;
//								Define Contructor

	public JavaConstructor(int Roll_num, String Stu_name, String Clg,int Age,float percent)		// Constructor with Parameters
	{
		Id=Roll_num; Name=Stu_name;College=Clg;Percentage=percent;
		
		System.out.println("Student Roll No :-\t"+Id);
		System.out.println("Student Name    :-\t"+Name);
		System.out.println("College Name    :-\t"+College);
		System.out.println("Student Age     :-\t"+Age);
		System.out.println("Student Score   :-\t"+Percentage);
	}

	public static void main(String[] args) {

		new JavaConstructor(11,"Rahul Patil","DK Science College",21,89.5f);	//Accessing/Calling Constructor

	}

}
