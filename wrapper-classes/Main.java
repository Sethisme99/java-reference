/*   Java Wrapper Classes:
 *
 	Normally, when we work with numbers, we use primitive data types such as byte, int, long,
double, etc.

	However, in development, we come across situations where we need to use objects instead of
primitive data types. In order to achieve this. Java provides wrapper classes.


	**Note:
	-Wrapper classes are those whose objects wraps a primitive data type within them.

	-In the java.lang package java provides a separate class for each of the primitive data
types namely Byte, Character, Double, Integer, Float, Long, Short.

	-At the time of instantiation, these classes accept a primitive datatype directly, or in
the form of String.

	-Wrapper classes provide methods to, convert primitive datatypes within them to String obj
and, to compare them with other objects etc.

	-Using wrapper classes, you can also add primitive datatypes to various Collection objects
such as ArrayList, HashMap etc. You can also pass primitive values over a network using wrapper -
classes.

   ** Object of java wrapper class:

   	The object of the wrapper class contains or wraps its respective primitive data type.
Converting primitive data types into object it called boxing, and this is taken care by the -
compiler. Therefore, while using a wrapper class you need to pass the value of the primitive data
type to the constructor of the wrapper class.

	And the wrapper object will be converted back to a primitive data type, and this process
is called unboxing. The Number class is part of the java.lang package.


  ** Creating Java Wrapper class Objects

  	In java, to create a wrapper object, you have to use the wrapper class instead of the 
primitive data type.

	If you want to print the values of these objects, just print the object.

   ** Syntax:

   	wrapper_class object _name = value;


    ** Example:


public class Main{

	public static void main(String a[]){

		Integer x = 5; //boxes int to an Integer object
		x = x + 10; //unboxes the Integer to a int
		System.out.println(x);

	}


}





 * */






