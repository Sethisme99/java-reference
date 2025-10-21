/*	** Java Array List
 
	An ArrayList is like a resizable array.

	It is part of the java.util package and implements the List interface.

	The difference between a built-in array and an ArrayList in java, is that the size of
	an array cannot be modified(if we want to add or remove elements to/from an array, we
	have to create a new one). While elements can be added and removed from an ArrayList.

	** Create an ArrayList

	import java.util.ArrayList;
	
	ArrayList<String> cars = new ArrayList<String>(); // create an ArrayList object.
	
	** Methods that can be use with ArrayList:
		
	- add(), get(), set() and remove().

	** example:


	import java.util.ArrayList;

	public class List{

		public static void main(String args[]){

			ArrayList<String> cars = new ArrayList<String>();
			cars.add("Ford");

			// add element to a specific position by refering to index number.
			//Syntax: ArrayList-obj.add(index, "new value");

			cars.add(0, "Mazada");
			
			// Using get() to return a specific value from specific index.

			String re = cars.get(0);

			// Using set to replace specific value:
			// Syntax: obj.set(index, "value");

			cars.set(1, "Volvo");

			// Using remove() to remove value from specific index:

			//cars.remove(0);

			// Using clear() to remove all values;

			// cars.clear();
			
			// Use size() to check how many elements an ArrayList have.

			int size = cars.size();

			// Loop through an ArrayList:
			// using size() to specifiy how many time the loop should run.
			// using get() to return the value after iteration.

			for(int i = 0; i < cars.size(); i++){
				System.out.println(cars.get(i));
			}
		}
	}



 // Loop through foreach:
 
 import java.util.ArrayList;
 import java.util.Collections;
 public class List{
	
	 public static void main(String args[]){

	 	ArrayList<String> cars = new ArrayList<String>();
    		cars.add("Volvo");
   		cars.add("BMW");
    		cars.add("Ford");
    		cars.add("Mazda");
		cars.add("AWS");
		//sort() use for sort list "ASC" form.
		//work with both numerically and alphabetically.

		Collections.sort(cars);	//sort cars

		for(String i : cars){

			System.out.println(i);
		}
	 }

 }


	** Var keyword:

	Var can be declare an ArrayList variable without writing the type twice. The compiler
figures out the type from the value you assign.

	// without var : ArrayList<String> cars = new ArrayList<String>();
	
	// with var: var cars = new ArrayList<String>();



	** List interface:

	import java.util.list;

	List<String> cars = new ArrayList<>();
	
	This means the variable (cars) is declared as a List (the interface), but it stores an
	ArrayList object(the actual list).
	
	Since ArrayList implements the List interface, this is posible.


 * */








