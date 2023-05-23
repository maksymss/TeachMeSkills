package Company;

public class Accountant extends Workforce {
    public Accountant (String name, int age, int yearsWorked, double salary) {
        super(name, age, yearsWorked, salary);
    }
    @Override
    public void getTitle() {
        System.out.println("Richard is an Accountant");
    }
}
