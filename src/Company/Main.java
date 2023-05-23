package Company;

public class Main {
    public static void main(String[] args) {
    workforceArray();
    }
    public static void workforceArray()
    {
        Workforce[] workers = {
                new Director("Allan", 45, 8, 150000),
                new Employee("Megan", 25, 2, 60000 ),
                new Accountant("Richard", 50, 20, 100000)
        };
        for (Workforce employees: workers)
        {
            employees.getWorkersInfo();
            System.out.println();
        }
        System.out.println("\n");
        workers[0].getTitle();
        System.out.println();
        workers[1].getTitle();
        System.out.println();
        workers[2].getTitle();
    }
}
