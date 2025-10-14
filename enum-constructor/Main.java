/*	Java Enum-Constructor:
 
 		It's a special kind of class that represents a group of pre-defined constant value
and can be used in switch expressions for comparison, to be used as constants in application code.

		By default, an enum does not require any constructor and its default value is the
same as its declaration.

	** Use of Enum Constructor:

		In case, we want to assign a default value to enum, we can create a enum -
constructor as shown below:

	enum WEEKDAY{

		MONDAY("Day 1");
		private final String description;

		WEEKDAY(String description){

			this.description = description;
		}

	}


	** Scope of Enum Constructor
	As enum is a special class, an enum constructor can only have private or package-private
modifier. Setting a public idenifier to enum constructor will attract a compile time error.


	** Enum with Private Constructor

	enum WEEKDAY {

	MONDAY("Day 1");

	private final String description;
	
	// valid declaration
	
	private WEEKDAY(String description) {

		this.description = description;
	}
}


//Example:
	
	enum WEEKDAY{

		MONDAY("Day 1"),
		TUESDAY("Day 2"),
		WEDNESDAY("Day 3"),
		THURSDAY("Day 4"),
		FRIDAY("Day 5"),
		SATURDAY("Day 6"),
		SUNDAY("Day 7");


	//Constant Field:
	private final String description;

	//Private Constructor:
	
	private WEEKDAY(String description){

		//initialize the description field:
		this.description = description;
	}

		//Getter method to get description:
		public String get_description(){

			return this.description;
		}
		
	}


public class Main{

	public static void main(String a[]){


		System.out.println(WEEKDAY.MONDAY.get_description());
		System.out.println(WEEKDAY.MONDAY);
	}

}

   ** Enum-private-constructor can be package like rest of the class!

 * */





