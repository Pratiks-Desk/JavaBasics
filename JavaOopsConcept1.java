package HelloJava;

public class JavaOopsConcept1 {//Its Class, A template for objects or its instance.
	public static void javaMethod(){
	//Java Method , its a kind of regular function to perform a task.
		//here comes the method body.
		system.out.println("JavaMethod");
		
	}

	class ClassOne{
		public static void classOneMethod(){
			system.out.println("ClassOneMethod");
		}
	}
	class ClassInheritance extends ClassOne{	
		/*The line class ClassInheritance extends ClassOne in Java is a declaration of a class named ClassInheritance that 
  inherits from another class named ClassOne. This is an example of class inheritance,
  which is a key feature of object-oriented programming. 
  Inheritance allows a class to inherit and reuse fields and methods from another class,*/
		public static void inheritanceClassMethod(){
			system.out.println("Its InheritanceClassMethod");
		}
		
	}



}
	/*Now we use 
 1.method overloading, which is a form of polymorphism, to define two versions of the add method within the Addition class. 
 Here's how each part of the code works:

1. Method Overloading:

The Addition class contains two overloaded versions of the add method:
public static void add(int a, int b)
public static void add(int a, int b, int c)
Both methods have the same name (add) but different parameter lists (different number of parameters).
This allows us to call the add method with either two or three integer arguments.

2. Polymorphism:

Polymorphism refers to the ability of objects to take on different forms. 
In this case, it's method polymorphism, where the add method behaves differently based on the number of arguments provided.
When we call the add method from the PracticeAlways class,
the Java compiler determines which version of the add method to invoke based on the number of arguments provided.*/
	
class Addition{
	int a=10;
	int b=20;
	int c=30;
	public static void add(int a ,int b){
	int sum=a+b;
	System.out.println("Addition of a and b is: " +sum);;
}
	public static void add(int a,int b, int c){
	int sum=a+b+c;
	System.out.println("Addition of a and b is: " +sum);
}
}
