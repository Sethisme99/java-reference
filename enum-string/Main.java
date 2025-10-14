/*  ** Enum String:
 
 	Java enum is a special construct to represents a group of pre-
defined constant string and provides clarity in code while used as -
constants in application code. By default, an enum string presentation
is the same as it declaration.



   ** Override Enum toString() method:
   	
   	Now in case, we want to change the default string representation
to the enum's string representation, we can create an overridden -
toString() method for each value of the enum constructor as below:


//Example:

enum WEEKDAY{

	MONDAY{

	//Overridden toString() method per value:
	public String toString(){

		return "Day 1 of the week: Monday";
	}

	}
	TUESDAY; //BUT IF YOU HAVE TUESDAY OR OTHER HERE "enum-wide"
		 //will be used to override.

	//or Override toString() per enum
	//priority will be given to value level toString() method.
	
	public String to(){

		return "Day 1 of the week: Monday";
	}
}



//Override toString() method:
//setting a custom description of enum value:

enum WEEKDAY{

//enum value constants:
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY,
SUNDAY;


//Override the toString() method for custom description:

@Override
public String toString(){

return switch(this){

	case MONDAY: yield "Day 1";
	case TUESDAY: yield "Day 2";
	case WEDNESDAY: yield "Day 3";
	case THURSDAY: yield "DAY 4";
	case FRIDAY: yield "DAY 5";
	case SATURDAY: yield "DAY 6";
	case SUNDAY: yield "DAY 7";

};

}

}

public class Main{

	public static void main(String[] args){

		//invoke toString() internally:
		System.out.println(WEEKDAY.MONDAY);
		//invoke toString() externally:
		//if the specific toString() exist external will never be
		//used if invoked externally.
		System.out.println(WEEKDAY.MONDAY.toString());

		//invoke name method() to get default name:
		System.out.println(WEEKDAY.TUESDAY.name());

	}

}
 
 
 
 *
 * */


