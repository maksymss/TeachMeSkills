//import java.util.Scanner;

//Initialized class!
public class Main {
    //Initialized main method!
    public static void main(String[] args) {
        /*Printed "Hello World!" string to the console
        //System.out.println("Hello World!");
        //Scanner userInput = new Scanner(System.in);
        //System.out.println("Enter username");

        //String userName = userInput.nextLine();
        System.out.println("Username is: " + userName);*/

        System.out.println("    |    |    ");
        System.out.println("____|____|____");
        System.out.println("    |    |    ");
        System.out.println("____|____|____");
        System.out.println("    |    |    ");
        System.out.println("    |    |    ");

        System.out.println("Christmas tree");

        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");

        //for loop option
        //Tried to do it myself, but ended up googling the solution
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();

    }
}