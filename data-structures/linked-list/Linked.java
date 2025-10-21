/*	** LinkedList:
 
* Example:

import java.util.LinkedList;

public class Linked{

	public static void main(String[] args){

		LinkedList<String> cars = new LinkedList<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		System.out.println(cars);
	}

}
 

	** ArrayList vs LinkedList:

	The LinkedList class is a collection which can contain many object of the same type, just like the ArrayList.

	The LinkedList class has the same methods as ArrayList because both follow the List interface. This means you can
	add, change, remove, or clear elements in a LinkedList just like ArrayList.

	Even though they're both can be used in the same way, but they're build very differently.


	** How the ArrayList works: 

	The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the
	array is not big enough, a new. larger array is created to replace the old one and the old one is removed.

	** How the LinkedList works:

	The LinkedList stores its elements in "containers." the list has the first container and each container has a
	link to the next container in the list. To add an element to the list, the element is placed into a new container
	and that container is linked to one of the other containers in the list.

	** When to use:

		- Use ArrayList for storing and accessing data.
		- Use LinkedList to manipulate data.


 	** LinkedList methods:

	For many case, the ArrayList is more efficeient as it is common to need access to random elements in the list, but
	LinkedList provides several methods to do certain operations more efficiently.

	** Method:		Description:

	addFirst()		Adds an element to the beginning of the list.

	addLast()		Adds an element to the end of the list.

	removeFirst()		Remove an element from the beginning of the list.

	removeLast()		Remove an element from the end of the list.

	getFirst()		Return an element at the beginning of the list.

	getLast()		Return an element at the last of the list.



	** It's possible to use Var to declare LinkedList as well. Just like "ArrayList".

	** The same goes with declared List interface for LinkedList. Just like "ArrayList".






 
 * /
