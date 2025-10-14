//Example: student class: name, age, dateOfBirth, grade.
//Below is an example of how class and object work and add alittle of using
//Array that can store objects. And using for loop to accessed ouput methods
//of those objects.

class Student{

	private String name;
	private int age;
	private String dateOfBirth;
	private char grade;

	public Student(String name, int age, String dateOfBirth, char grade){

		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.grade = grade;

	}


	public void getStudent(){

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Date Of Birth: " + dateOfBirth);
		System.out.println("Grade: " + grade);
	}


}


public class Ex{
	
	public static void main(String a[]){

		Student st = new Student("Dara Sakk", 25, "17/9/2000", 'A');
		
		Student st1 = new Student("John Nerf", 27, "11/2/1998", 'B');

		Student stuArr[] = new Student [2];

		stuArr [0] = st;
		stuArr [1] = st1;
	

		for(int i = 0; i < stuArr.length; i++){

			stuArr[i].getStudent();
			System.out.println();
		}
		
	}
	
}










