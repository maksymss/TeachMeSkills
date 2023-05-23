package Company;

public class Employee extends Workforce implements Title {
    public Employee (String name, int age, int yearsWorked, double salary) {
        super(name, age, yearsWorked, salary);
    }
    @Override
    public void getTitle() {
        System.out.println("Megan is Manager");
    }

}
