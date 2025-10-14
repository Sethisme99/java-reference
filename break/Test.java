/*	Break Statement:
 *
 *	The Java break used to exit loop immediately and tranfer control to the next statement after the loop.
 * It has two main usages: when encountered inside a loop, it terminates the loop instantly, and in when in
 * swich statement it used to exit a specific case.
 *
 **Syntex: break;
 *
 * break mostly used in loop with inside the condition. we used when we want ot stop loop in a specific condition.
 *
 *
 * */



	//Example:
	// "i" supposed to print out from 0 to 15 but "break" stop the loop when "i" reach 11.
	

/*
class Ex1{
	
	private int i = 1;

	public Ex1(){

		while(i <= 15){

			if(i == 11){
			   break;
			}
			
			System.out.println(i);
			
			i++;
		}
	}

}

*/


// for loop: same example:
//

import java.util.Arrays;

class Ex2{
	
	private int [] arrNum = {1, 2, 3, 4, 5, 6, 7};

	public Ex2(){
	
	for(int i = 0; i <= arrNum.length; i++){


		//this loop will be run 8 time and execute 7 time!
		//to know the length of the array use "System.out.println(i);"

		//The goal is to stop the loop before it reach the fifth index by using "break;".
		
		if(i == 5){

			break;	
		}

		System.out.println("Index :" + i + " " + "Value :" + arrNum[i]);
	}
	}


}

//The same example but with infinit loop:
//


/*
class Ex3{

	private int i = 1;

	public Ex3(){

		while(true){
 		
		  if(i == 11){
			
			break;
		  }
				
		  System.out.println("i: " + i);

		  i++;
		}
	}


}
*/



public class Test{
	public static void main(String a[]){

	//"break with while loop example"
	//Ex1 ex1 = new Ex1();

	//"break with for loop:"
	Ex2 ex2 = new Ex2();
	
	//"break with infinit loop:"

	//Ex3 ex3 = new Ex3();
	



	}
}








