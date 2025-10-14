/* *Abstraction:
 
 *  abstraction is the quality of dealing with ideas rather than events. Example, when you consider the
 case of e-mail, complex details such as what happens as soon as you send an e-mail, the protocol your
 e-mail server uses are hidden from the user. Therefore, to send an e-mail you just need type the content,
 mention the address of the receiver, and click send.

 * *Java Abstraction:
   
 *  Abstraction is a process of hidding the implementation details from the user, only the functionalities
 will be privided to the user. In other words, the user will have the information on what the object does
 instead of how it does it. In Java programming, abstraction is achieved using Abstract classes and
 interface.

 * *Java Abstract Class:
 
 *  A Java class which contains the abstract keyword in its declaration is known as abstract class.
 
 	-Java abstract classes may or may not contain abstract methods, i.e., methods without body
( public void get();)
 
	-But, if a class has at least one abstract method, then the class must be declared abstract.

	-If a class is declared abstract, it cannot be instantiated. But can be inheritance.

	-To use an abstract class, you have to inherit it from another class, provide implementations to
the abstract methods in it.

	-If you inherit an abstract class, you have to provide implementatios to all the abstract methods
in it.

 * * Java Abstract Methods:
 	
 	If you want a class to contain a particular methid but you want the actual implementation of that
method to be determinded by child classes, you can declare the method in the parent class as an abstract.

	-Abstract keyword is used to declare the method as abstract.
	
	-You have to place the abstract keyword before the method name in the method declaration.

	-An abstract method contains a method signature, but no method body.

	-Instead of curly braces, an abstract method will have a semi colon(;) at the end.

 *
 * * Abstract method implementation:
 
public abstract class Emp{

	private String name;
	private String address;
	private int number;


	public abstract double computePay();
	//remainder of class difinition.

}

	**Declaring a method as abstract has two consequences -

	-The class containing it must be declared as abstract.
	
	-Any class inheriting the current class must either override the abstract method or declared
itself as abstract.

	**Note: Eventually, a descendant class has to implement the abstract method; otherwise, you would
have a hierarchy of abstract classes that cannot be instantiated.

	suppose Salary class inherits the EMP class, then it should implement the computePay() method.

	**Example:
public class Salary extends Emp{

	private double salary;

	public double computePay(){
		System.out.println("Computing Salary pay for " + getName());
		return salary/52;
	}

}
	

 *
 *
 *
 *
 *
 */





abstract class Vehicle{

	public void startEngine(){

		System.out.println("The engine is starting...");
	}

}

class MotoBike extends Vehicle{

	private String brand;
	private String color;

	public MotoBike(String brand, String color){
		this.brand = brand;
		this.color = color;
	}


	public void getDetail(){
		
		System.out.println("Car Brand: " + brand);
		System.out.println("Car Color: " + color);

	}

}

public class Test{

	public static void main(String[] a){

		MotoBike mk = new MotoBike("Toyota", "Red");
		mk.getDetail();
	}

}

