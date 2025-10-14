//Declared inside a class, but outside a method, constructor or block.
/*
 *
 *When a space allocated for an object in the heap, a slot for each instance variable value is created.

 *Instance variables are created when an object is created with the use of keyword "new" and destroyed when the object is destroyed.

 *Instance variable hold value that must be referenced by more than one method, constructor , or block, or essential parts of an 
 object's state that must be present throughout the class.

 *Instance can be declared in class level before or after use.

 *Access modifiers can be declared in class level before or after use.
 *
 *The instace variable are visible for all methods, constructors and block in the class. 
 *
 *Recommended to make these variable private (access level). However, visibility for subclasses can be given for these variables with
 the use of access modifiers.
 *
 * It has default values:
 * *numbers = 0;
 * *boolean = false;
 * *object references or none primitive like "string = null"
 * It assigned during the declaration or within the constructor.
 *
 *It can be accessed directly by calling the variable name inside the class. or within static method "when instance variable are given
 accessibility", They should be called using fully qualified name. Example ObjectReference.VariableName.
 *
 *
 * */


//Exaple for Java Instance Variable:
	
import java.io.*;

class Employee{
	
	//this instanceVar is visible for any child class:
	public String name;
		
	//this private instanceVar is visible in this class only:
	private double salary;

	//Constructor:
	public Employee (String empName){
		name = empName;
	}

	//Set function used to set emp salary:
	public void setSalary(double empSal){
		salary = empSal;
	}


	//Print EMP Name and Salary:
	public void showEmp(){
		System.out.println("Employee Detail:");
		System.out.println("************************************");
		System.out.println("Employee Name : " + name);
		System.out.println("Salary : " + salary);

	}}


	class InstanceVar{
		public static void main(String args[]){
			Employee emp1 = new Employee("Salty");	
			emp1.setSalary(300);
			emp1.showEmp();
			
		}
		
	}








