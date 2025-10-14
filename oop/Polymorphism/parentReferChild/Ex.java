class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      
      System.out.println("Constructing an Employee");
      
      this.name = name;
      
      this.address = address;
      
      this.number = number;
   }


   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public int getNumber() {
      return number;
   }


   //Mailing a check to employee
   public void mailCheck() {
      System.out.println("Mailing a check to " + this.name + " " + this.address + " " + this.number);
   }

   //display name , add, phone num
   public String toString() {
      return name + " " + address + " " + number;
   }


   //in case want to chnage AD
   public void setAddress(String newAddress) {
      this.address = newAddress;
   }

   //change number
   public void setNumber(int newNumber){
	this.number = newNumber;
   }


}


class Salary extends Employee {

   private double salary; // Annual salary
   
   public Salary(String name, String address, int number, double salary) {
      
	   super(name, address, number);
      
	   setSalary(salary);
   }

   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");

      System.out.println("Mailing check to " + getName()
      + " with salary " + salary);
   }

   
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double newSalary) {
      if(newSalary >= 0.0) {
         salary = newSalary;
      }
   }
   
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}

//


public class Ex {

   public static void main(String [] args) {

      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
     // s.mailCheck();
     // s.setSalary(4000);
     // s.mailCheck();
     // s.computePay();
     // s.mailCheck();
      
     double sal = s.getSalary();
     System.out.println(sal);


      /*
       * If you want to used based class reference to access derrive class memeber. Required DownCast.
       * Down Cast:
	Salary s = (Salary) e;
	s.computePay();
	s.getSalary();*/
   }
}


