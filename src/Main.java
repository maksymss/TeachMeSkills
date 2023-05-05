

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Three methods

        //getScannerInput();
        //getAsciiValue();
        //calculateBMI();

    }
    public static void getScannerInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("My name is " + name);
        System.out.println();

        System.out.println("What's your surname?");
        String surname = scanner.nextLine();
        System.out.println("My surname is " + surname);
        System.out.println();

        System.out.println("What's your age?");
        int age = scanner.nextInt();
        System.out.println("My age is " + age + " years old!");
        System.out.println();

        System.out.println("What's your height?");
        int height = scanner.nextInt();
        System.out.println("My height is " + height + " cm!");
        System.out.println();

        System.out.println("What's your weight?");
        int weight = scanner.nextInt();
        System.out.println("My weight is " + weight + " kg");
        System.out.println();

        scanner.close();

    };

        public static void getAsciiValue() {
        char firstAsciiSymbol = 'U';
        char secondAsciiSymbol= 'A';

        System.out.println("Letter " + firstAsciiSymbol + " corresponds to number " + (int) firstAsciiSymbol);
        System.out.println("Letter " + secondAsciiSymbol + " corresponds to number " + (int) secondAsciiSymbol);
        };

        public static void calculateBMI() {
        double myWeight = 72;
        double myHeight = 1.75 * 1.75;
        double myBMI = myWeight / myHeight;

        System.out.println("According to formula, my BMI (Body Mass Index) is " + myBMI);

        };
}