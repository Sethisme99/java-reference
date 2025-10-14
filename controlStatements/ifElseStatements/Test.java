//Note: == vs .equals() in Java
//1, == -> "are they the same object?"
// 	-Checks if both references point to the exact same memory location.
//	-Works for primitives(int, double, boolean, etc.)
//	-Does not check content for object like String.
//
//2, .equals() -> "Do they have the same content?"
//	-Check the actual data inside the object.
//	-Always use this for Strings, Lists, or other objects when you care about the content.
//
//Note: because String "Variable" serve as a reference pointing to where the object itself is located inside the heap memory.
//
// It's difference from the primitive type that its variable actually contained  the value itself.
//
// So when you use this "==" with primitive type it compare both value of the two variables.
//
// but when you use this "==" with Object type it serve as checking identities check. are both string located at the same place. Not compare their values.
//
//



import java.util.Scanner;

//Example working with String or obj using ".equals()":

class Login{

		private String password = "password";
		private String input;

		public void setInput(String input){
			this.input = input;
		}

		public void checkLogin(){

		if( input.equals(password)){
			System.out.println("You are successfuly login.");
		}
		else{
			System.out.println("Please try again next time.");
		}
		}

}




class Test{

	public static void main(String a[]){
		Login log = new Login();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your password:");
		log.setInput(sc.next());
		log.checkLogin();
	
	}

}



//Example working with primitive variable using "==":
/*
class Test{
 
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter your PIN:");

		int PIN = 777633;

		int input = sc.nextInt();
		
		if(input == PIN){

			System.out.println("You are successfuly login.");
		}
		else{
			System.out.println("Your PIN is wrong!");
		}
	}

}

*/

