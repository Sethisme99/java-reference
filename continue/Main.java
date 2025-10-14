/*	Continue:
 *	
 *	Why using continue because we want to skip some value wheather from the array or variable or skip user input that invalid..etc.
 *	
 *
 *	Note: when working with while and do-while loop using continue, Becareful with the increement "i++". it could lead to bug.
 *		
 *		when skip value in an array. should consider using advance method: "i++;" before "continue;". 
 *
 *	Note: When using "<" because we don't want the loop bounce, it's ok to use "<=" with variable. and if you want one more
 *	
 *		iteration after the actual iteration. But when working with array or something complex better off use this "<".
 *
 *
 *
 * */


//Skip index of an array:

import java.util.Arrays;


class SkipIndex{

	private int [] myArr = {10, 20, 30, 40, 50};

	public SkipIndex(){
		
		System.out.println(Arrays.toString(myArr));

 
		//i = 0 when working with an array.
		
		int i = 0;
		while(i < myArr.length){
		

			//The goal is to skip the third index: 2 that contained 30 as its value.

			if(i == 2){
				i++;	  // move first if you want to skip	
				continue;
			}

			System.out.println("Index: " + i + " " + "Value: " + myArr[i]);
			
			i++;

		}

	}



}




//Skip with for loop:


class Skip2{

	private int [] myArr = {90, 80, 70, 60, 50};

	public Skip2(){
	
		System.out.println(Arrays.toString(myArr));

		for(int i = 0; i < myArr.length; i++){

			if(i == 3){

				continue;
			}

			System.out.println("Index: " + i + " " + "Value: " + myArr[i]);
	
		}

	}
}



class Skip3{

	private int [] myArr = {90, 80, 70, 60, 50};

	public Skip3(){

		System.out.println("Actual Array: " + Arrays.toString(myArr));


		int i = 0;

		do{

			if(i == 3){
				
				i++; //Advance first before skip!
				continue;
			}

			System.out.println("Index : " + i + " " + "Value : " + myArr[i]);

			
			i++;
		}while(i < myArr.length);

	}


}







public class Main{

	public static void main(String args[]){

		//SkipIndex sn = new SkipIndex();
		
		System.out.println("For Skip index: 3");

		Skip2 sn2 = new Skip2();

		System.out.println("While Skip index: 3 ");

		Skip3 sn3 = new Skip3();
	}


}
