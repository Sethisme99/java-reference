//Example:

abstract class Employee{
	private String name;
	private String AD;
	private String number;
	
	//constract EMP:
	public Employee(String name, String AD, String number){

		System.out.println("Constructing an Employee");
		this.name = name;
		this.AD = AD;
		this.number = number;
	}

	//compute Pay:
	public double computePay(){

		System.out.println("Inside Employee ComputePay");
		return 0.0;
	}
	
	//mailing a check to EMP:
	public void mailCheck(){

		System.out.println("Mailing a check to " + this.name + this.AD);
	}

	//get EMP info
	
	public String toString(){

		return name + " " + AD + " " + number;
	}

	//get EMP name:
	public String getName(){
		return name;
	}

	//get EMP AD:
	public String getAD(){
		return AD;
	}

	//get EMP phone number:
	public String getNumber(){
		return number;
	}

	//change EMP name:
	
	public String newName(String newName){
		return this.name = newName;
	}

	//in case user wanna change AD:
	public String newAD(String newAD){
		return this.AD = newAD;
	}

	//change phone number:
	
	public String newNumber(String newNumber){
		return this.number = newNumber;
	}
}



class Salary extends Employee{

	private double basedSalary;
	private double salPerday;
	private int workDays;
	private double daysToHours;
	
	private int regular_OT_workDays;
	private int weekend_OT_workDays;

	private final double workHours = 8;
	private static final double regularOT = 1.5;
	private static final double weekendOT = 2.5;


	public Salary(String name, String AD, String number, int workDays, double basedSalary,
			int regular_OT_workDays, int weekend_OT_workDays){

		super(name, AD, number);
		get_workDays(workDays);
		get_basedSalary(basedSalary);
		get_regular_OT(regular_OT_workDays);
		get_weekend_OT(weekend_OT_workDays);
	}


	@Override
	//get EMP info
	public String toString(){

		return  "Name: " + getName() + "\n" +
				"Address: " + getAD() + "\n" +
				"Phone Number: " + getNumber() + "\n" +
				"Based Salary: " + basedSalary + "\n" +
				"Work Days: " + workDays + "\n" +
				"Regular OT WorkDays: " + regular_OT_workDays + "\n" +
				"Weekend OT WorkDays: " + weekend_OT_workDays + "\n";
	}


	//get work days:
	public int get_workDays(int workDays){

		return this.workDays = workDays;
	}

	//get based salary:
	public double get_basedSalary(double basedSalary){

		return this.basedSalary = basedSalary;
	}

	//get regular OT:
	public int get_regular_OT(int regular_OT_workDays){
		return this.regular_OT_workDays = regular_OT_workDays;
	}

	//get weekend OT:
	public int get_weekend_OT(int weekend_OT_workDays){

		return this.weekend_OT_workDays = weekend_OT_workDays;
	}


}



public class Test{

	public static void main(String[] a){

		Salary sl1 = new Salary("Jonh", "PhnomPenh", "+85577763354", 28, 200, 2, 0);
		System.out.println(sl1.toString());
	}


}


