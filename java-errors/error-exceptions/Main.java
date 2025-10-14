/*	** Java Exceptions - Try...Catch:

	When an error occurs. Java will normally stop and generate an error message. The technical term for
this: Java will throw an exception (throw an error).


	** Exception Handling (try and catch)

	Exception handling lets you catch and handle errors during runtime - so your program doesn't crash.

	It uses different keywords:

	- The "try" statement allows you to define a block of code to be tested for errors while it is being -
executed.

	- The "catch" statement allows you to define a block of code to be executed, if an error occurs in the
"try" block.

	-The "try" and "catch" keywords come in pairs.


	** Syntax:

	try{

		// code ....
	}catch(Exception e){

		System.out.print(Exception);
		e.printStackTrace();
	}




	** Note: "ArrayIndexOutOfBoundsException" occurs when you try to access an index number that does not -
exist.



	** example using try and catch to handle array error out of bounds:





public class Main{
	
	public static void main(String[] args){

		try{
			int [] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[5]);
		}catch(Exception e){
			System.out.println("Something went wrong!");
			e.printStackTrace();
		}
	}

}



   ** Finally

   The "finally" statement lets you execute code, after try...catch, regardless of the result:


public class Main{

	public static void main(String[] args){

		try{
			int[] myArr = {1, 2, 3};
			System.out.println(myArr[4]);

		}catch(Exception e){
			System.out.println("Something went wrong.");
			e.printStackTrace();

		}finally{

			System.out.println("The 'try...catch' is finished.");
		}
	}
}


   ** The throw keyword:

   The throw statement allows you to create a custom error.
   
   The throw statement is used together with an exception type. There are many exception types available :

   - ArithmeticException
   - FileNotFoundException
   - ArrayIndexOutOfBoundsException
   - SecurityException, etc:


    ** Example: Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older,
print "Access granted".



public class Main{


	static void checkAge(int age){
	if(age < 18){
		throw new ArithmeticException("Access denied - you must be at least 18 year old.");
	}else{
		System.out.println("Access granted - You are old enough!");
	}
	}

	public static void main(String[] args){

		checkAge(19);
	}
}

   ** Errors and Exception Types:

**************************************************************************************************************
   Error/Exception 			Description

   ArithmeticError	-> 		Occurs when a numeric calculation goes wrong.

   ArrayIndexOutOfBoundsException  -> 	Occurs when trying to access an index number that does not exist in arr

   ClassNotFoundException	->	Occurs when trying to access a class that does not exist.

   FileNotFoundException	->	Occurs when a file cannot be accessed.

   InputMismatchException	->	Occurs when entering wrong input (e.g. text in a numerical input).

   IOException			->	Occurs when an input or output operation fails.

   NullPointerException		-> 	Occurs when trying to access an object reference that is null.

   StringIndexOutOfBoundsException  ->	Occurs when trying to access a character in a string that does not -
   					exist.
*************************************************************************************************************


 * */







