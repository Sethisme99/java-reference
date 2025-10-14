/*1,Encapsulation(Access Modifiers)
 *
 *It better to make fields "private" and access them via getters/setters -> this is core OOP best practice.
 
 	private String name;
	private int age;
	private String address;
	private double salary;

**Why private?
	so that other class can not accessed or change the value to messing up.
	they need to change access through the method the main class provide like "setName". etc.


 *
 *2,Don't keep scanner inside the model class.
	"Employee" should be a data class(model). It should not be responsible for reading input from the
console. Input/Output belongs in a separate part of the program(e.g.. "Main").
	"The first code" class is tightly coupled to System.in. That makes it hard to test or reuse.

 *
 * */

//Better Class

//import scanner
import java.util.Scanner;


class Employee{

	private String name;
	private String address;
	private int age;
	private double salary;

	//getters and setters:
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setAddress(String address){
		this.address = address;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public String getAddress(){
		return address;
	}

	public double getSalary(){
		return salary;
	}


    	public void showEmployeeDetail() {
        	System.out.println("*****************************************************");
        	System.out.println("Employee Detail:");
        	System.out.println("  Name: " + name);
        	System.out.println("  Age: " + age);	
        	System.out.println("  Address: " + address);
        	System.out.println("  Salary: " + salary);
        	System.out.println("*****************************************************");
    	}
}


public class Main{

	public static void main(String args[]){

		//create scanner obj:
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee();
		
		System.out.print("Name : ");
		emp1.setName(sc.nextLine());

		System.out.print("Age : ");
		emp1.setAge(sc.nextInt());
		sc.nextLine(); //consume newLine

		System.out.print("Address : ");
		emp1.setAddress(sc.nextLine());

		System.out.print("Salary : ");
		emp1.setSalary(sc.nextDouble());
		sc.nextLine();	//consume newline


		emp1.showEmployeeDetail();
	}

}
























