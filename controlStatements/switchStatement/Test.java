/*	Switch Statement:
 *	
 *	-The variables used in a switch statement can only be integers,
 *	convertable integers(byte, short, char), String, enums.
 *
 *	-You can have any number of case with in a switch.
 *
 *	-The value for a case must be the same as the data type as the variable
 *	in the switch.
 *
 *	-When a break is reached, the switch terminates.
 *
 *	-Not every case needs to contain a break. If no break appears, the 
 *	flow control will fall through the subsequent cases until a break 
 *	is reached.
 *
 *	-A switch statement can have an optional default case, which must appear
 *	at the end of the switch.
 *
 *
 *
 * */

import java.util.Scanner;

class CheckGrade{

	private String grade;

	public CheckGrade(String grade){
		this.grade = grade;
	}

	public void check(){

		switch(grade){
		    case "A":
				System.out.println("Excellent!");
			break;
		    case "B":	//without break it will skip and jump to case 'C'	
		    case "C":
				System.out.println("Very good!");
			break;
		
		     case "D":
			   	System.out.println("Good");
			break;

		     case "E":	System.out.println("Pass");
			
			break;

		      case "F":
				System.out.println("You Failed!");

			break;

		       default :
				System.out.println("Invalid grade");
		}


		System.out.println("Your grade is : " + grade);

	}
}

public class Test{

	public static void main(String a[]){
		
		System.out.println("Please insert your Grade based on these characters: ");
		System.out.println("*****" + "A, B, C, D, E, F" + "*****");
		
		Scanner sc = new Scanner(System.in);
		CheckGrade cg = new CheckGrade(sc.next());
		cg.check();
	}

}


