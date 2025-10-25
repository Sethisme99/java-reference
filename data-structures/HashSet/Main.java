/*	** Java HashSet:
 
 	A HashSet is a collection of elements where every element is unique.

	HashSet do not allow duplicate element.

	It is part of the java.util package and implements the set interface.

	** Create a HashSet:

	* Example create HashSet Object:
	
	import java.util.HashSet;

	HashSet<String> cars = new HashSet<String>();
 
 
	** Methods can be use:

		- add()
		- contains()
		- remove()
	
	** Add Elements:


	import java.util.HashSet;


	public class Main{

		public static void main(String[] args){

			HashSet<String> books = new HashSet<String>();

			books.add("Rich Dad, Poor Dad");

			// use contains() to check whether an element exist.
			
			// books.contains("Rich Dad, Poor Dad");

			// use remove() to remove an element.

			// books.remove("Rich Dad, Poor Dad");

			// use clear() to remove all elements.

			// books.clear();

			// use size() to check how many elements exist.

			// books.size();	//duplicate element are not count.

			
			// Loop through HashSet.

			for(String i : books){
				
				System.out.println(i);
			}

			System.out.println(books);

		}
	
	}







 
 * */
