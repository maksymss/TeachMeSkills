package Company;
public class Director extends Workforce {
    public Director (String name, int age, int yearsWorked, double salary) {
        super(name, age, yearsWorked, salary);
    }
    @Override
    public void getTitle() {
        System.out.println("Allan is Director");
    }
}
