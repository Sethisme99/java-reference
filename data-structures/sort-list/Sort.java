/*	** Java Sort a List:
 
	*Example: Sort an ArrayList of String asc:

	import java.util.ArrayList;
	import java.util.Collections;

	public class Sort{
	
		public static void main(String[] args){

			ArrayList<String> cars = new ArrayList<String>();
			
			cars.add("Volvo");
    			cars.add("BMW");
    			cars.add("Ford");
    			cars.add("Mazda");

			Collection.sort(cars);

			for(String i : cars){
				System.out.println(i);
			}

	}

	}



	** Reverse the Order:

	You can also sort a list in reverse order. by using the revereseOrder() method.


	import java.util.ArrayList;
	import java.util.Collections;

	public class Sort{
	
		public static void main(String[] args){

			ArrayList<String> cars = new ArrayList<String>();
			
			cars.add("Volvo");
    			cars.add("BMW");
    			cars.add("Ford");
    			cars.add("Mazda");

			Collection.sort(cars, Collections.reverseOrder());

			for(String i : cars){
				System.out.println(i);
			}

	}

	}

	
	** Note: All the same goes with Integer.
 * */
