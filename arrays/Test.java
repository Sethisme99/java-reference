//Array of object:


class Student{

	String name;
	int age;
	char grade;


	public Student(String name, int age, char grade){
		
		this.name = name;
		this.age = age;
		this.grade = grade;

	}


}

public class Test{

	public static void main(String a[]){

		//name, age, grade

		Student st1 = new Student("Phearoth Raseth", 25, 'A');
		Student st2 = new Student("sok", 24, 'B');

		Student students [] = new Student[2];
		
		students [0] = st1;
		students [1] = st2;


		for(int i = 0; i < students.length; i++){
		
		  System.out.println("Name: " + " " + students[i].name);
		  System.out.println("Age: " + " " + students[i].age);
		  System.out.println("Grade: " + " " + students[i].grade);
		
		  System.out.println();
		}

	}


}







