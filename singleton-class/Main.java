/*  Java Singleton Class:
 	
    	This pattern involves a single class which is responsible to create an
object while making sure that only single object get created. This class -
provides a way to access its only object of the class.

	Since there is only one Singleton instance, any instance fields of a -
Singletons often control access to resources, such as database connection or -
sockets.

	For example, if you have a license for only one connection for your -
database or your JDBC driver has trouble with multithreading, the Singleton make
sure that only one connection is made or that only one thread can access the -
connection at a time.

** Advantages of Singleton Design Pattern:
	
	Singleton design pattern saves memory because only one object instance
is created and it also provides global access to it instance.


** Use of Singleton Design Pattern:

	The singleton design pattern is used when you want to create such a
class that has only one instace. It is mainly used in multithreading to create
multi-threaded and database-related applications.

	Some of the designs where singleton design pattern is used:

	- To create logger classes
	- To create configuration management-related classes
	- To create classes related to database connection pooling
	- To create a class for the caching mechanism

	 

** Java Singleton Class/Design Pattern:

	
class Singleton{

	private static Singleton singleton = new Singleton();


	//A private constructore prevents any other class from instaniating.
	private Singleton(){}

	public static Singleton getInstance(){

		return singleton;
	}

	protected void demoMethod(){

		System.out.println("Demo method for singleton");
	}

}


public class Main{

public static void main(String a[]){

	Singleton tmp = Singleton.getInstance();
	tmp.demoMethod();
}
}

** Example2:
	Following implementation shows a classic Singleton design pattern. In
this example, the ClassicSingleton class maintains a static reference to the
lone singleton instance and returns that reference from the static -
getInstance() method.

	ClassicSingleton class employs a techique known as "lazy" instantiation
to create the singleton. as a result, the singleton instance is not created -
until the getInstance() method is called for the first time. this technigue -
ensures that singleton instances are created only when needed.


class ClassicSingleton{

	private static ClassicSingleton instance = null;
	private ClassicSingleton(){}

	public static ClassicSingleton getInstance(){

		if(instance == null){
			instance = new ClassicSingleton();
		}
		return instance;
	}

	protected void demoMethod(){
		System.out.println("demo method for singleton!");
	}
}


public class Main{

	public static void main(String args[]){


		ClassicSingleton tmp = ClassicSingleton.getInstance();
		tmp.demoMethod();
	}

}



** Examle 3:

	Implementation show a threadsafe Singleton object creation.
the classicSingleton class maintains a static reference to the lone singleton -
instance and returns that reference from the static getInstance() method which-
is a threadsafe using synchronized keyword.







 
 *
 *
 *
 *
 *
 *
 * */


class ClassicSingleton{

	private static ClassicSingleton instance = null;
	private ClassicSingleton(){}


	public static synchronized ClassicSingleton getInstance(){

		if(instance == null){
			instance = new ClassicSingleton();
		}

		return instance;

	}

	protected void demoMethod(){
		System.out.println("Demo Method of Singleton Class!");
	}

}



public class Main{

	public static void main(String args[]){

		ClassicSingleton tmp = ClassicSingleton.getInstance();
			tmp.demoMethod();
	}

}







