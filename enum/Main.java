/* ** Enum:
 
   	enum(Short for enumeration) is a special type of class that allows you to define a group
of constants(fixed). It gives type safety(can assign only predefined values) and provide a way to
to group ralated values under a single type, making your code more readable and maintainable.

	To create an enum, use the enum keyword and make sure the constants are in uppercase -
and separated by a comma.

	Why do we need enum?

	Without enums, constants are usually defined with public static final int variables. But
this is not correct because any number could be assigned, even invalid ones. Enums solves this -
problem by grouping related constants together and allowing only valid predefined values. Enum
declaration can be done outside a class or inside a class, but not inside a method.


   ** Different scenarios where enums are better than constants -

   -Days of the week
   -Directions(NORTH, SOUTH, EAST, WEST)
   -Seasins(Winter, Spring, Summer, Rainy)
   -Status codes(Run, Stop)

 

   ** Syntax:

	Declaring an enum is similar to declaring a class, but it uses the 'enum' keyword 
instead of 'class'.

	public enum Day{

		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	}




enum MobileBrands{

	Apple,
	Samsung,
	Sony

}




public class Main{

	public static void main(String a[]){
		
		System.out.println(MobileBrands.Apple);
		MobileBrands mobile = MobileBrands.Apple;

		if(mobile == MobileBrands.Apple){

			System.out.println("Matched");
		}


		switch(mobile){

			case Apple:
				System.out.println("Apple");
				break;
			case Samsung: 
				System.out.println("Samsung");
				break;
			case Sony:
				System.out.println("Sony");
				break;
			default:
				System.out.println("Device doesn't exist");

		}

	}


}



// ** Enum inside a class:

public class Main{

//enum declared inside a class

enum Light{

	RED, YELLOW, GREEN
}

public static void main(String a[]){

	Light signal = Light.RED;
	System.out.println("Signal is: " + signal);

}
}





//** Enum outisde class:

enum TrafficLight{

	RED, GREEN, BLUE;
}

public class Main{

public static void main(String a[]){

	TrafficLight tl = TrafficLight.RED;
	System.out.println(tl);
}


}


 ** Conclusion:
 	In Java, an enum is a special kind of class. Unlike a normal class where you create objs
using the new keyword, an enum automatically creates its objs, which are the constants.

	A normal class can extend another class and have public constructors, but an enum always
extends java.lang. Enum and cannot be explicitly extended, and its constructors are private. While
classes are used to model real-world entities like Car or Student, enums used to represent a fixed
set of constants such as days of the week, directions, or status codes.


*/














