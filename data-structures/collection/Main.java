/*	** The Collections Framework:
 
		The java collections framework provides a set if interface(like List, Set and Map) and a set of classes
	(ArrayList, HashSet, HashMap) that implement those interfaces.

		All of these are part of "java.util" package.

		* They are used to store, search, sort, and organize data more easily - all using standardized method and
	patterns.


		* Core Interfaces in the collections framework.

*****************************************************************************************************************************
		Interface	Common Classes			   Description
		
		List		ArrayList, LinkedList		   Ordered collection that allows duplicates.

		Set		HashSet, TreeSet, LinkedHashSet	   Collection of unique elements.

		Map		HashMap, TreeMap, LinkedHashMap	   Stores key-value pairs with unique keys.

*****************************************************************************************************************************

	** Overview of Classes

*****************************************************************************************************************************
	Interface		Class			Description

	List		->	ArrayList	->	Resizable array that maintains order and allows duplicates.
				LinkedList	->	List with fast insert and remove operations.
	
	Set		->	HashSet		->	Unordered collection of unique elements.
				TreeSet		->	Sorted set of unique elements(Natural order).
				LinkedHashSet	->	Maintains the order in which elements were inserted.

	Map		->	HashMap		->	Stores key/value pairs with no specific order.
				TreeMap		->	Sorted map based on the natural order of keys.
				LinkedHashMap	->	Maintains the order in which keys were inserted.

*****************************************************************************************************************************
	

	** Which to use? & When to use?

		- Use List classes when care about order, you may have uplicates, and want to access element by index.

		- Use Set classes when need to store unique values only.
		
		- Use Map classes when need to store pairs of keys and values, like a name and its phone number.


























 * */
