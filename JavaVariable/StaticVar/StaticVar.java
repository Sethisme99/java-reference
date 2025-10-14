/*Java Class/Static Variable:
 *
 * Class variable also known as static variable are declared with the "static" keyword in a class,
 but also outside a method, constructor or a block.
 *
 * There would be only one copy of each static variable per class, "because it belong to class" But it can be
 accessesible or update it value to all object. Regardless of how many objects are created from it. Unlike 
 Instance Variable each object has it own copy of instance variable.
 *
 * It rarely used other than being declared as constant. Constant declared as public static final it's value
 never from there first initialized.
 *
 * Static variable are stored in the static memory. It is rare to use static variable other than declared as
 final and used as either public or private constant.
 *
 * It created when the program start and destroyed when the program stop.
 *
 * It visibility are similar to Instance Variables.
 *
 *Default value the same as instance.
 *
 * It can be aceessed by calling with the class name "ClassName.staticVariableName".
 *
 * When declared it as constant "final" then it all names should be "Uppercase". If it not constant the name
 should be normal like the rest of the variable.
 * */

  //Example: Static variable:
/*
	class Employee{

		//salary private static variable:
		private static double salary;
		//Department variable declared as constant:
		public static final String DEPARTMENT = "Computer Science";

		public Employee(double setSalary){
			salary = setSalary;
		}


		public void showEmp(){

			System.out.println("*****Show Employee*****");
			System.out.println("Department: " + DEPARTMENT);
			System.out.println("Salary: " + salary);

		}

	}

	*/


	class CountNum{

		public String title;
		public static int num;

		public CountNum(String setTitle){

			title = setTitle;
		}



		void count(){

			num++;
		}

		void showCount(){
			System.out.println("*******" + title + "*******");
			System.out.println("Count Time :" + num);
		}

	}



	class StaticVar{

		public static void main(String args[]){

		CountNum count1 = new CountNum("OBJ 1");
			count1.count();
			count1.showCount();
	
		CountNum count2 = new CountNum("OBJ2");
			count2.count();
			count2.showCount();
			



		}

	}
	


