package resources.employee;

public class Salary implements Person {
    
    private String name;
    private int age;
    private String ad;
    private double salary;


    public Salary(String name, int age, String ad, double salary){

        this.name = name;
        this.age = age;
        this.ad = ad;
        this.salary = salary;
    }


    @Override
    public String setName(String newName){

        this.name = newName;
        return name;

    }

    @Override
    public int setAge(int newAge){

        this.age = newAge;
        return age;

    }

    @Override
    public String setAd(String newAd){

        this.ad = newAd;
        return ad;
    }

    @Override
    public String getName(){

        return name;

    }

    @Override
    public int getAge(){

        return age;

    }

    @Override
    public String getAd(){

        return ad;
    }


    public void get_data(){
        System.out.println(this);
    }

    public String toString(){

        return "Name: " + name + "\n" +
                "Age: " + age  + "\n" +
                "Address: " + ad + "\n" +
                "Salary: " + salary;

    }

}
