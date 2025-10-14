/*	** Java Data Structures:
 
	Data structures are ways to store and organize data so you can use it efficiently.

	An array is an example of data structure, which allows multiple elements to be stored in a single -
variable.

	Java includes many other data structures as well, in the "java.util" package. Each is used to handle
data in different ways.

	* Some of the most common are:
	
		- ArrayList
		- HashSet
		- HashMap
 

	** ArrayList:

	An "ArrayList" is a resizable array that can grow as needed.
	It allows you to store elements and access them by index.

	*Example:
 
import java.util.ArrayList;

public class Main{

	public static void main(String[] args){


		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		System.out.println(cars);
		

	}

}

 
	** HashSet

	A "HashSet" is a collection where every element is unique - no duplicates are allowed.

	* Example:
	



import java.util.HashSet;
import java.util.Arrays;

public class Main{

	public static void main(String[] args){

		HashSet<String> bikes = new HashSet<String>();

		bikes.add("BMX");
		bikes.add("Honda");
		bikes.add("Yamaha");
		bikes.add("Ducati");

		System.out.println(bikes);

	}



}

	** HashMap:

	A "HashMap" stores key-value pairs, which are great when you want to store values and find them by
a key (like name or ID).

	* Example:

 

import java.util.HashMap;

public class Main{

	public static void main(String[] args){
		
		//Create a HashMap obj called capital cities.

		HashMap <String, String> capital_cities = new HashMap<String, String>();

		capital_cities.put("England", "London");
		capital_cities.put("Germany", "Berlin");
		capital_cities.put("Norway", "Oslo");
		capital_cities.put("USA", "Washinton.DC");

		System.out.println(capital_cities);

	}

}




*Data Structures Overview

Data Structure|		Stores|			KeepsOrder?|	Allows Duplicates?|	Best For
	
ArrayList		Ordered elements	Yes		Yes			Accessing elements by index
	
HashSet			Unique elements		No		No			Avoiding duplicates, fast checks
	
HashMap			Key-value pairs		No		Yes (keys are unique)	Fast lookup by key


	** Iterators:

	When learning about data structures, you will often hear about iterators too.
	
	An iterator is a way to loop through elements in a data structure.

	It is called an "iterator" because it is the technical term for looping.






 * */


import java.util.ArrayList;
import java.util.Iterator;

public class Main{

public static void main(String[] args){

	ArrayList <String> cars = new ArrayList<String>();
	
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Mazda");	

	//Get an iterator for the ArrayList:
	
	Iterator<String> it = cars.iterator();

	// Iterate through the list using the iterator
	
	while(it.hasNext()){

		System.out.println(it.next());
	}
}

}





















