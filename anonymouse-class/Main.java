/* What is anonymouse class?
 
     An anonymous class is an inner class which is declared without any class name at all. In other
words, a nameless inner class in java is called an anonymous inner class. Since it does not have a
name, it cannot have constructor because we know that a constructor name is the same as class.

** Use of Anonymous classes:
    
    They are used when you want to create a simple class that is needed for one time only for a
specific purpose. For implementing an interface or extending a class.


** Syntax:

	new(argument-list){
		//Anonymous class

	}

** Types of Anonymous Inner classes in Java:

	- Anonymous inner class that extends a class
	- Anonymous inner class that implements an interface
	- Anonymous inner class as an argument


 1, Anonymouse inner class that extends a class

     You can use an anonymous inner class to extend a class in java.

 Example: Anonymous inner class that extends a class


class MyClass{

	public void show_data(){

		System.out.println("This data still not Override yet!");
	}

}


public class Main{

public static void main(String args[]){

	MyClass class1 = new MyClass();
	class1.show_data();

	MyClass class2 = new MyClass(){

		@Override
		public void show_data(){
			System.out.println("This data has been Overrided!");
		}
	};


interface Software{

	public void show_detail();
}


public class Main{

	public static void main(String a[]){

	Software sw = new Software(){

		@Override
		public void show_detail(){

			System.out.println("This method has been implemented!");

		}

	};
	
	sw.show_detail();
	System.out.println(sw.getClass().getName());
	}
}

 Output:

 Main$1

 Explanation:

 Main → outer class where it’s defined.

 $1 → first anonymous inner class inside Main.

 If you had more, they’d be $2, $3, etc.

 3, Anonymous inner class as an argument:

   We can use the anonymous inner class as an argument so that it can be passed to methods or
constuctors.

 




 * */

abstract class Engine{

public abstract void type();

}

class Vehicle{

	public void suv(Engine e){
		e.type();
	}


}


public class Main{

	public static void main(String a[]){

		Vehicle v1 = new Vehicle();
		v1.suv(new Engine(){

			@Override
			public void type(){

				System.out.println("This is SUV type of Engine");
			}

		});

	}


}












