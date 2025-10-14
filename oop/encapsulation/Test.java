/*	** Java Encapsulation:
 		
 		Encapsulation is one of the four of OOP concepts. The other three are inheritance, 
 	Polymorphism and Abstraction.
 
 		Encapsulation in JAVA is a mechanism of wrapping the data(variables) and code acting
 	on the data(methods) together as single unit. In encapsulation, the variable of class will 
 	hidden from other classes, and can be accessed only through (methods) of their current class.
	therefore, it is also known as data hiding.

	** Achieving Encapsulation:
	
	To achieve encapsulation:
		
		-Declare the variables of a class as private.

		-Provide public setter and getter methods to modify and view the variable values.

		
		The public set() and get() methods are the access points of the instance variables of
	the class. Normally, these methods are referred as getters and setters. Therefore, any class
	that wants to access the variables should access them through these getters and setters.
 
 

	** Benefits of Encapsulation:

		-The fields of a class can be made read-only or write-obly.

		-A class can have total control over what is stored in its fields.


	** You can create a read only class by using on getter() methods no setter().

	** Or you can create a write only class by using only setter() methods no getter().


 *
 *
 *
 *
 *
 *
 *
 *
 * */

//Example:


class Emp{

	private String name;
	private int age;
	private String ad;

	public Emp(String name, int age, String ad){

		getName(name);
		getAge(age);
		getAd(ad);
	}

	public String toString(){

		return name + "\n" + age + "\n" + ad;
	}



	public String getName(String name){
		return this.name = name;
	}

	public int getAge(int age){

		return this.age = age;
	}


	public String getAd(String ad){
		return this.ad = ad;
	}


	public String setName(String newName){

		this.name = newName;
		return name;
	}

	public int setAge(int newAge){
		
		this.age = newAge;
		return age;
	}

	public String setAd(String newAd){

		this.ad = newAd;
		return ad;
	}

}


public class Test{

	public static void main(String[] a){
		
		Emp emp1 = new Emp("John", 22, "USA");
		System.out.println(emp1.toString());
		emp1.setName("Josh");
		System.out.println(emp1.toString());


	}
}





























