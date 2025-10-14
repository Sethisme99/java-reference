/*User Input or Scanner in JAVA:
 * 
 * To take User input in JAVA used "Scanner class". The Scanner class a build-in class of "java.util" package.
 *
 * It provide many build-in method to take difference types of user inputs from the users.
 *
 * *How to use?
 *1, Import Scanner Class:
 
 	"import java.util.Scanner;"

 *2, Create Scanner class's Object:
  
	After importing the Scanner class, you need to create its object to able to use its methods.

 **Statement to create an object of scanner class:
 	
 	"Scanner obj = new Scanner(System.in);"
 *
 * 3, Take User Input:
 	
	Scanner class provides a varierty of methods which are useful to take user input of difference types.
     Example, if you want to input an integer value, use nextInt() method.

 **Syntax:
		"int age = obj.nextInt();"
 *
 * */

//Example: Input Employee detail:
//name, age, address, salary.
//
//Import Scanner class:
import java.util.Scanner;


class Employee{

	String name;
	int age;
	String address;
	private double salary;

	//create scanner obj:
	Scanner sc = new Scanner(System.in);

	//Intro constructor:
	public Employee(){
		
		System.out.println("***********************");
		System.out.println("Please field the detail below.");
	}

	//set name function
	public void setName(){

		System.out.println("Name :");
		name = sc.next();	//use scanner obj for input string
	}

	//set age function:
	public void setAge(){
	
		System.out.println("Age :");
		age = sc.nextInt();		//use scanner obj for input integer
	
	}

	//set address function:
	public void setAddress(){
		System.out.println("Address :");
		address = sc.next();
	}

	//set salary function:
	public void setSalary(){
		System.out.println("Salary :");
		salary = sc.nextDouble();

	}


	public void showEmployeeDetail(){
		
		System.out.println("*****************************************************");
		System.out.println("Employee Detail:");
		System.out.println("	" + "Name: " + name);
		System.out.println("	" + "Age: " + age);	
		System.out.println("	" + "Address: " + address);
		System.out.println("	" + "Salary: " + salary);
		System.out.println("*****************************************************");
	}


}




public class ScannerTest{

	public static void main(String args[]){
		Employee emp1 = new Employee();
		emp1.setName();
		emp1.setAge();
		emp1.setAddress();
		emp1.setSalary();
		emp1.showEmployeeDetail();
	}

}

















