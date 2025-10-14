/*	Polymorphism:
 *
 *
 * */

//Method Overloading:

/*
class Calulator{

	public int add(int a, int b){

		return a + b;
	}

	public double add(double a, double b){

		return a + b;
	}



}
*/

//Method Overriding:



class Person{

	private String name;
	private int age;
	private String birthDate;
	private char sex;


	public Person(String name){

		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}


	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}


	public void setSex(char sex){
		this.sex = sex;
	}

	@Override
	public String toString(){
		return  "Name: " + name +
				"\nAge: " + age +
				"\nSex: " + sex +
				"\nBirth Date: " + birthDate;
				
	}

}


class Student extends Person{

	private final int id;
	private String enrollmentDate;
	private boolean schoolBilled;


	public Student(String name, int id){

		super(name);
		this.id = id;
	}

	public void setEnrollment(String enrollmentDate){

		this.enrollmentDate = enrollmentDate;
	}
	
	public void setSchoolBilled(boolean schoolBilled){

		this.schoolBilled = schoolBilled;
	}


	@Override
	public String toString(){

		return	"Id: " + id + "\n" +
				super.toString() +
				"\nStudent Enrollment Date: " + enrollmentDate +
				"\nSchool Billed: " + (schoolBilled ? "Paid" : "Not Paid");

	}


}



public class Ex{

	public static void main(String a[]){

		Student st1 = new Student("Walter", 001);
		st1.setAge(15);
		st1.setSex('M');
		st1.setBirthDate("20/9/2015");
		st1.setEnrollment("8/9/2025");
		st1.setSchoolBilled(false);


		Student st2 = new Student("John", 002);
		st2.setAge(25);
		st2.setSex('M');
		st2.setBirthDate("20/9/2000");
		st2.setEnrollment("8/9/2025");
		st2.setSchoolBilled(true);

		Student stuArr[] = new Student [2];
		stuArr[0] = st1;
		stuArr[1] = st2;

		for(int i = 0; i<stuArr.length; i++){

			System.out.println(stuArr[i].toString());
			System.out.println();

		}

	
	}

}








