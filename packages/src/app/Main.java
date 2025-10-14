package app;

// Import Salary from resources.person
import resources.person.Salary;

public class Main {
    public static void main(String[] args) {
        Salary emp1 = new Salary("Josh", 20, 200);
        System.out.println(emp1);
    }
}

