/* **Interface:
 	
   	Interface is a collection of abstract methods. The interface is used to achieve abstraction
which you can define methods without implementations. An interface is a reference type and is similar
to the class.

	Along with abstract methods, an interface may also contain constants, default methods, static
-method, and nested types. Method bodies exist only default methods and static methods.

	Writting an interface is similar to writing a class. However, a class describes the attributes
and behaviors of an object. An interface contains behaviors that a class implements. unless the class
that implements the interface is abstract, all the methods of the interface need to be defined in the
class.

 ** The similarity between class and interface:
	
 	-An interface can contain any number of methods.

	-An interface is written in a file with a .java extension, with the name of interface match
the name of the file.

	-The byte code of an interface appears in a .class file.

	-Interfaces appear in packages, and their corresponding bytecode file must be in a directory
structure that matches the package name.


  ** The difference between class and interface:
  	
  	-You cannot instantiate an interface.

	-An interface does not contain any constructor.

	-All of the methods in an interface are abstract.

	-An interface cannot contain instance fields. The only field that can appear in an interface
must declared both static and final.

	-An interface is not extended by a class; It is implemented by a class.

	-An interface can extend multiple interfaces.

 **Properties of interface:

 	-An interface is emplicitly abstract. You do not need to use the abstract keyword while
declaring an interface.

	-Each method in an interface is also implicitly abstract, so the abstract keyword is not
needed.

	-Methods in an interface are implicitly public.



 ** Implementing Interface:
 	
 	When a class implements an interface,  you can think of the class as signing a contract, agreeing to
perform the specific behaviors of the interface. If a class does not perform all the behaviors of the -
interface, the class must declare itself as abstract.

	A class uses the implements keyword to implement an interface. The implements keyword appears in the
class declaration following the extends portion of declaration.

//Example:

interface Emp{
	
	public void personal_data();
	public void salary();
}



class Employee implements Emp{
	private String name;
	private int age;
	private double basedSalary;


	public Employee(String name, int age, double basedSalary){
		this.name = name;
		this.age = age;
		this.basedSalary = basedSalary;
	}

	 public void personal_data(){

		System.out.print(this);
	}

	 public void salary(){

		System.out.println("Salary: " + basedSalary);
	}

	 public String toString(){

		return  "Personal Data:" + "\n" +
			"Name: " + name + "\n" +
			"Age: "  + age  + "\n";
	}

	

}


public class Test{

	public static void main(String[] a){

		Employee emp1 = new Employee("Josh", 22, 200);
		emp1.personal_data();
		emp1.salary();
	}

}


 **Rules for defining overriding method inside interfaces:

 	- Checked exceptions should not be declared on implementation methods other than ones declared by -
the interface method or subclasses of those declared by the interface method.

	-The signature of the interface method and the same return type or subtype should be maintained when
overriding the methods.

	-An implementation class itseld can be abstract and if so, interface methods need not be implemented.

 ** Rules for implementing interface:

 	-A class can implement more than one interface at a time.

	-A class can extend only one class, but implement many interfaces.

	-An interface can extend another interface, in a similar way as a class can extend another class.


 ** Extending Interfaces:

 	An interface can extend another interface in the same way that a class can extend another class. The -
extends keyword is used to extend an interface, and the child interface inherits the methods of the parent -
interface.


 **Extending Multiple Interface:

 	A java class only extend on parent class, multiple inheritance is not allowed. Interfaces are not classes,
however, and an interface can extend more than one parent interface.

	The extends keyword is used once, and the parent interfaces are declared in a comma-separated list.

 ** Tagging Interface:
 	
 	The most common use of extending interface occcurs when the parent interface does not contain any methods.
Example, the MouseListener interface from java.awt.event package exteded java.util.EventListener, which defined -
as:


package java.util;

public interface EventListener {}



	An interface with no methods in it is referred to as a tagging interface. There are two basic design
purposes of tagging interface -

	Create a common parent - As with the EventListener interface, which is extended by dozens of other -
interfaces in the Java API, you can use a tagging interface to create a common parent among a group of interfaces
. For example, when an interface extends EventListener, the JVM knowns that this particular interface is going to
-be used in an event delegation scenario.

	Adds a data type to a class -  this situation is where the term, tagging come from. A class that -
implements a tagging interface does not need to define any methods (since the interface does not have any), but
the class become an interface type through polymorphism.



*
*
*
*
*
*/

//Example:
//
interface Sports{
	public void setHomeTeam(String name);
	public void setVisitingTeam(String name);

}


interface Football extends Sports{

	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfQuarter(int quarter);

}

interface Hockey extends Sports{

	public void homeGoalScored();
	public void visitingGoalScored();
	public void endOfPeriod(int period);
	public void overtimePeriod(int ot);
	
}


class Event implements Hockey{

	private String home_teamName;
	private String visit_teamName;
	


	public void setHomeTeam(String name){
		
		this.home_teamName = name;
		
	}
	public void setVisitingTeam(String name){

		this.visit_teamName = name;
	}

	//Hockey:
	public void homeGoalScored(){}
	public void visitingGoalScored(){}
	public void endOfPeriod(int period){}
	public void overtimePeriod(int ot){}



	public void printData(){

		System.out.print(this);
	}

	public String toString(){

		return home_teamName + "\n" + visit_teamName + "\n";

	}


}



public class Test{

	public static void main(String[] a){
	
		Event ev = new Event();
		ev.setHomeTeam("LA-Laker");
		ev.setVisitingTeam("Red-Bull");
		ev.printData();
	}
}





