package Computer;

public class Computer {
    private int price;
    private String model;
    private String ram;
    private String hdd;

    public Computer(String computerModel, int computerPrice) {
    this.model = computerModel;
    this.price = computerPrice;
    }
    public Computer(String computerModel, String computerRam, String computerHdd, int computerPrice) {
    this.price = computerPrice;
    this.model = computerModel;
    this.ram = computerRam;
    this.hdd = computerHdd;
    }
    public void getInfo() {
        System.out.println("Computer has following specifications: ");
        System.out.println("The model: " + this.model);
        System.out.println("The RAM is: " + this.ram);
        System.out.println("The HDD is: " + this.hdd);
        System.out.println("The price is: " + this.price);
    }
}
