package Company;

public abstract class Workforce implements Title {
    private String name;
    private int age;
    private int yearsWorked;
    private double salary;

    public Workforce(String name, int age, int yearsWorked, double salary)
    {
        this.name = name;
        this.age = age;
        this.yearsWorked = yearsWorked;
        this.salary = salary;
    }
    public  void getWorkersInfo()
    {
        System.out.println("The name is: " + this.name);
        System.out.println("The age is: " + this.age);
        System.out.println("The years worked are : " + this.yearsWorked);
        System.out.println("The salary is: " + this.salary);
    }



}
