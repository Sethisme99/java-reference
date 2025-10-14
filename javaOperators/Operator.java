/*Ternary Operator:
 *
 * We used this operator to decide which value to store in the variable.
 *
 ** Syntax: variable = (condition) ? value1 : value2;

 *** Note:
 -If the conditon is = "false" the value2 will be store inside the variable.
 -If the condition is = "true" the value 1 will be store inside the variable.
 * */

	//Example: If you are a student then the answer is "You are a student".
	// But if you're not then the answer is "You are not a student".
/*
class Operator{
	public static void main(String args[]){
		
		//if you are a student assign to "true".
		//if not assign to "false".

		boolean isStudent = true;

		//Ternary Operator:
		String storeStudent = (isStudent == true) ? "You are a student!" : "You are not a student!";

		System.out.println(storeStudent);
	}

}
*/

//**************************************

/* instanceof Operator:
 *
 *  This operator is used only for object reference variables. The operator
 check wheather the object is a particular type(class type of interface type).
 instanceof operator is written as -
	
 	//Synstax:
	//
	(object reference variable) instanceof (class/interface type)
 * */

//example: creating a String variable name and then using instanceof operator
//if the is string or not. if its string the answer will be "true".
//
/*
public class Operator{

	public static void main(String a[]){

		//create string var:
		String name = "Jame";
	
		//check if name variable is type String:
		boolean result = name instanceof String;
		
		System.out.println("name Data type is type String : " + result);
	}

}
*/

//example 2: inheritace.
//we're creating a variable "v1" of class vehicle and then
//using "instanceof" operator to checking the vehicle is type car or not.
//Note because of java require main class name the same of file name so
//Car = Operator.
//
//
class Vehicle{}

public class Operator extends Vehicle{

 public static void main(String a[]){
	Vehicle v1 = new Operator();
	
	//checking:
	boolean result = v1 instanceof Operator;
	System.out.println("Operator is vehicle: " + result);
 }

}






 











