import java.util.Scanner;

//Initialized class!
public class Main {
    //Initialized main method!
    public static void main(String[] args) {
        //Printed "Hello World!" string to the console
        System.out.println("Hello World!");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = userInput.nextLine();
        System.out.println("Username is: " + userName);

    }
}