/* Access modifier:
 *  public: can be access by any class or anyone.
 *  private : can access or modifie by only that class.
 *  protected : can access or modifie by class itself and subclass.
 * */




class Person{

	protected String name;
	public int age;

	protected Person(String name, int age){

		this.name = name;
		this.age = age;
	}

}


//Employee{} is a (derive) class of (base) class Person{}

class Employee extends Person{

	private String hireDate;
	private double salary;
	
	public Employee(String name, int age, String hireDate, double salary){

		super(name, age);
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public void getEmp(){

		System.out.println(name);
		System.out.println(age);
		System.out.println(hireDate);
		System.out.println(salary);
	}

	
}


public class Ex{

	public static void main(String a[]){

		//name, age, hireDate, salary
		
		Employee emp = new Employee("Sok", 25, "9/8/2025", 200);

		Employee emp1 = new Employee("John", 27, "8/9/2024", 500);


		//store both employee objs in the array type of Employee
		Employee empArr [] = new Employee [2];


		empArr [0] = emp;
		empArr [1] = emp1;

	
		for(int i = 0; i < empArr.length; i++){
			
			empArr[i].getEmp();
			
			System.out.println();
		}



	}


}




