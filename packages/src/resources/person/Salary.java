package resources.person;

public class Salary implements Person {
    private String name;
    private int age;
    private double salary;

    public Salary(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Salary: " + salary + "\n";
    }
}

