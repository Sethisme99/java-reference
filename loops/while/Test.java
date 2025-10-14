
/*
public class Test{

	public static void main(String a[]){

		int i = 1;
		while(i <= 4){
			System.out.println("hi");
			
			int j = 1;

			while(j <= 3){

				System.out.println("Hello");

				j++;
			}
			
			i++;
		}

	}

}

*/

// Going through everything but sometime doing thing special:
//


/*
public class Test{

	public static void main(String a[]){

		int i = 1;

		while(i <= 12){
			
			System.out.println("Hello");

			if(i % 3 == 0){
				
				System.out.println("Hi");

			}

			i++;

		}

	}

}
*/


//Note that the inner loop always reset per iteration of outer loop.

/*
public class Test{

	public static void main(String a[]){


		int row = 6;
		int i = 1;
		
		while(i <= row){
			
			int j = 1;

			while(j<= i){
			
				System.out.print("*");
				
				j++;
			}

			System.out.println();
			i++;
		}



}	
}

*/

/*
public class Test{

	public static void main(String a[]){


		int row = 6;
		int i = 1;
		
		do{
		    int j = 1;

			do{
				
			     System.out.print("*");
				
			j++;

			}while(j <= i);

		System.out.println();

		i++;

		}while(i <= row);

}	
}
*/


public class Test{

	public static void main(String a[]){


		int row = 6;

		for(int i = 1; i <= row; i++){


			//spacing:


			for(int k = 1; k <= row - i; k++){

				System.out.print(" ");
			}


			//Star:

			for(int j = 1; j <= i; j++){

				System.out.print("*");
			}


			System.out.println();
		}

}	
}














