/*** OOP:
  object in real-world is like an entity such as a mobile, car, book, etc. Object-Oriented
Porgramming is a methodology or paradigm to design a program using classes and objects. It
simplifies software development and maintenace by providing some concepts.

** Concepts include:
-Class

-Object

-Inheritance

-Polymorphism

-Abstraction

-Encapsulation


** Class:
  class is a blueprint to create an object(or you can say it's a data type of an object type) in
Java, everything related to classes and objects. Each class has its methods and attributes that can
be accessed and manipulated through the objects.


** Object:
  an object is an entity that has two characteristics (states and behavior). Some of the real world
object are car, table ,etc. an object is a variable of the type class. A class has the methods and
data members (attributes), both of them can be accessed through an object. And an object is an
instance of class.


** Inheritance:
  In OOP, inheritance is a process by which we can reuse the functionalities of existing classes
to a new classes. In the concept of inheritance, there are two terms base (parent) class and derived
(child) class. When a class is inherited from another class (based class), it (derived) class
obtains all the properties and behaviors of the base class.


**Need of Inheritance:
	
	-Code Reusability.
	
	-Extensibility.
	
	-Implementation of method overriding.
	
	-Achieving Abstraction.


**Java Inheritance Super() keyword:
	It's used to differentiate the members of superclass from the members of
subclass, if they have same name.

	It is used to invoke the superclass constructor form subclass.


**IS-A Relationship is basically a way to know which subclass belong to basedclas by using "instanceof" to check: System.out.println(subclass instanceof basedclass);


**Interface: you can used extends keyword to inheritance from one class to another but with interface you need to use implements so you can inheritance from interface to class.


**HAS-A Relationship
In OOP, a HAS-A mean that one class contains another class as a field(a member variable).

-It basically "X has a Y".

-This models real-world relationships where an object is made of or depend on other obj.

**example:
	A Car has a Engine.
	A Library has Books.
	A Person has an Address.


**Why HAS-A is important:

-Code reuse - you can use existing classes without inheritance from them.

-flexibility - You can swap out parts without changing the whole.

-Better Design - Favors composition over inheritance, which is widely recommanded best
practice in modern java.

*There are three type if inheritance in Java:


	-Single Inheritance. (based class) -> (derive class).


	-Multi Level Inheritance. (based class) -> (derive class) -> (another derive class).

							(derive class)
	-Hierachical Inheritaince. (based class) ->
							(derive class)



**Types of HAS-A
-Aggregation - The contained object can exist independently of the container.

Ex: Library has book -> the book still exist if the library closes.

-Composition - The contained object's lifetime depends on the container.

Ex: A Human has a hearth ->  if the human dies, the heart isn't useful anymore.


**Summary:
-HAS-A : One class contains another class.

-Implemented using field (not inheritance).

-Encourages modular, flexible design.



** Java Aggregation:

 It's a relationship between two classes where one class contain an instance of another
class. Ex: when an object A contains a reference to another obj B or we can say objA has
HAS-A relationship with obj B, then it is termed as Aggregation in Java Programming.



*Usage:
 Aggregation in Java helps in reuseing the code. Obj B can have utility methods and which
can be utilized by multiple objs. Whichever class has obj B then it can utilize its methods.





***************************************************************************

** Polymorphism:
  it means "many forms". In OOP, polymorphism is useful when you want to create mutiple forms with
the same name of a sigle entity. To implement it, we use two concepts "method overloading" and
"method overriding".

  + Method Overloading:
	-Happens in the same class (or can also happen in a subclass, but it's not related to
inheritance, just normal multiple methods with same name).

	-You write multiple methods with the same name but with different parameter lists(different
number or types of parameters).

	-The return type can be the same or different.

	-The compiler decides which method to call at compile time(this is called compile-time 
polymorphism or static binding).

	//Example:
		class Calulator{
			
			//same method return different based on the parameters:
			//if you insert integer type of value into parameter the add above will
			//execute. but if you insert point number into the parameter it will
			//execute the bottom one.


			int add(int a, int b){
				return a + b;
			}

		
			boolean add(boolean a, boolean b){

				return a + b;
			}

		}




   +Method overriding:
	-Happens in inheritance (between superclass and subclass).

	-A subclass provides its own version of a method that already exists in the superclass.

	- * The method must have:
	
		-same name.
		-same parameter list(signature must match exactly).
		-same or covariant return type(meaning compatible return type).

	-The overriding method cannot have a stricter access modifier(e.g.. can't make a public to 
private).
	
	-Decided at runtime(this is runtime polymorphism or dynamic binding).




	**Usage of @Override:
		-It's a compiler instruction:
		"telling compiler, this method is supposed to override a method from superclass.
	please check that i didn't make a mistake."

		-If everything matches, the compiler ignores it at runtime. no performance
	difference, no behavioral difference.

		-If it doesn’t actually override anything (e.g., wrong parameter list, typo in name)
	, the compiler will throw an error.


	✅ Best practice:
		Always use @Override when you intend to override. It’s a free safety net —
	no runtime cost, just fewer bugs.


***Polymorphism: base class reference with derrive obj:
	
	Ex: basedClass bc = new deriveClass();

	*Summary:
	
	- Parent cannot directly access child-specific members.

	- Parent reference can call override methods of the child class (run time Polymorphism)

	- To call child-only methods, must downcast.

*** Rules of method Overriding:

 	-The argument list should be exactly the same as that of the overriding method.

	-The return type should be the same or a subtype of the return type declared in the original overriden method in the subclass.

	-Access Level cannot be restrictive than the superclass.

	-Instance methods can be overriden only if they an inherited by the subclass.
	
	-A method declared final cannot be overriden.

	-A method declared static cannot be overridden but can be re-declared.

	-If a method cannot be inherited, then it cannot be overriden.

	-A subclass within the same package as the instance's superclass can
override any superclass method that is not declared private or final.

	-A subclass difference package can only override the non-final methods
declared public or protected.

	-An overriding method can throw any uncheck exceptions, regardless of
whether the overriding method throws exceptions or not. However, the overriding method should not throw checked exception that are new or broader than the one declared by the overriden method. The overriden method can throw narrower or fewer exceptions than the overridden method.

	-Constructors cannot be overridden. 

*** Dynamic Binding:
	
	Binding means linking a method call to the method definition.
		
		-Static Binding(early binding) -> Happens at compile time.
		-Dynamic Binding (late binding) -> Happens at runtime.

	*Dynamic Binding:
		
		Dynamic binding accurs when a method that is overridden in a subclass is called through
	a parent reference at runtime.

		*The actual method execute depends on the object type. not the reference type.


Example:
***********************************************************************************

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // reference type = Animal, object = Dog
        Animal a2 = new Cat();  // reference type = Animal, object = Cat

        a1.sound();  // Dog barks   ← resolved at runtime
        a2.sound();  // Cat meows   ← resolved at runtime
    }
}
		
***********************************************************************************

	*** Key Points about dynamic binding:
	
		-Works with method overriding, not method overloading.
		-Declared at runtime, based on the actual object type.
		-Helps achieve polymorphism(many forms).
		-Makes code more flexible and extensible.





| Feature          | Static Binding (Early)                             | Dynamic Binding (Late)                             |
| ---------------- | -------------------------------------------------- | -------------------------------------------------- |
| Time of decision | Compile time                                       | Runtime                                            |
| Works with       | Method overloading, private, static, final methods | Method overriding                                  |
| Example          | `Math.max(5, 10)` → compiler decides               | `Animal a = new Dog(); a.sound();` runtime decides |



	**Think of it like:
		-static binding : "We already know which method to call before running the program".
		-dynamic binding : "We will wait until the program runs and see what obj are we really dealing with".


*** Java Instance Initializer Block:

	An instance initailizer block is a block of code that is declared inside a class to initailize the instance "Data Member".
Instance Initailizer block is executed once for each object and can be used to set initial values for instance variables.

	The instance initailizer block is similar to constructor but its execution and use are differnt.

	**Example:

	pubic class Tester{

		public int a;
		{

			a = 10;
		}
	}


	**Characteristics of instance Inistailizer block:

	-Instance initializer block is called once when the obj is created.

	-Instance initailizer block is called before any constructor of an object is invoked.

	-In case of child class, Instance initializer block will be called after super class constructor call.

	-Its block can be used to execute multiple statements.

	-Its initializer block is generally used to instantiate multiple value fields like arrays.



*** Abstraction:

	In OOP, an abstraction is a technigue of hiding internal details and showing functionalities. The abstract classes and
interfaces are used to achieve abstraction in java.

	The real-world example of an abstraction is a Car, the internal details such as the engine, process of starting a car,
process of shifting gears, etc. are hidden from the user, and features such as the start button, gears, display, break, etc are given
to the user. when we perform any action on these features, the internal process works.





***Encapsulation:
	In OOP approach, encapsulation is a process of binding the data	member(attributes) and methods together. The encapsulation
restricts direct access to important data. The best example of the encapsulation concept is making a class where the data members are
private and methods are public to access through an object. In this case, only methods can access those private data.
















*/












