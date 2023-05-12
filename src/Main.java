import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //getSeasonSwitch();
        //getSeasonIfElse();
        //getWeatherOutside();
        //getRainbowColor();
        //getOddNumbers();
        //reverseCountdown();
        //coundownByFive();
        //getNumbersBySeven();
        //getSquareNum();
        //getFibonacciSeq();
        //oddOrEven();
        //getNumbersSum();

}

    //task #1
    public static void getSeasonSwitch(){

        int month = 7;

        switch (month) {
            case 1 : System.out.println("It is winter!");
                break;
            case 2 : System.out.println("It is still winter!");
                break;
            case 3 : System.out.println("It is early spring!");
                break;
            case 4 : System.out.println("It is spring!");
                break;
            case 5 : System.out.println("It is still spring!");
                break;
            case 6 : System.out.println("It is early summer!");
                break;
            case 7 : System.out.println("It is summer!");
                break;
            case 8 : System.out.println("It is still summer!");
                break;
            case 9 : System.out.println("It is early fall!");
                break;
            case 10 : System.out.println("It is still fall!");
                break;
            case 11 :System.out.println("It is late fall!");
                break;
            case 12 :System.out.println("It is early winter!");
                break;
            default: System.out.println("No such a season");

        }
    };
    //task #2
    public static void getSeasonIfElse() {

        int monthNumber = 0;

        if(monthNumber == 12 && monthNumber <=2) {
            System.out.println("It is winter");
        } else if (monthNumber >= 3 && monthNumber <=5) {
            System.out.println("It is finally spring!");
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("It is summer! Vacation is coming!");
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("It's cold! Winter is here!");
        } else if (monthNumber == 0) {
            System.out.println("There is no such a season! Sorry!");
        }
    }

    //task #3
    public static void oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if(number%2 == 0) {
            System.out.println("The number is even!");
        } else
            System.out.println("The number is odd");
    }

    //task #4
    public static void getWeatherOutside() {

        int t = 4;

        if(t > -5) {
            System.out.println("It is warm outside");
        } else if (t <= -5 && t >= -20) {
            System.out.println("It is decent outside");
        } else if (t <= -20) {
            System.out.println("It is cold outside");
        } else {
            System.out.println("Going on a beach!!!!");
        }
    }

    //task #5

   public static void getRainbowColor() {
       int rainbowColor = 7;

       switch(rainbowColor) {
           case 1: System.out.println("The color is red");
               break;
           case 2: System.out.println("The color is orange");
               break;
           case 3: System.out.println("The color is yellow");
               break;
           case 4: System.out.println("The color is green");
               break;
           case 5: System.out.println("The color is blue");
               break;
           case 6: System.out.println("The color is indigo");
               break;
           case 7: System.out.println("The color is violet");
               break;
           default: System.out.println("No such a color!");
       }
   }

    //Loops
    //task #1
    public static void getOddNumbers() {
        for(int i = 1; i <= 99; i +=2 ) {
            System.out.println(i);
        }
    }

    //task #2
    public static void reverseCountdown() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

    }

    //task #3
    public static void getNumbersSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if(number >= 0) {
            for(int i = 0; i <= number; i++) {
                System.out.println(i);
            }
        }

    //task #4
    //public static void getNumbersBySeven() {
        int initialNum = 0;
        while(initialNum <= 98) {
            System.out.println(initialNum +=7);
        }
    }

    //task #5
    public static void coundownByFive() {
        for (int i = 0; i >= -45; i-=5) {
            System.out.println(i);
        }

    }

    //task #6
    public static void getSquareNum() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i*i);
        }

    }

    //Extra tasks
    //Task #1
    public static void getFibonacciSeq() {
        int numberOfNumbers = 10, firstNum = 0, secondNum = 1;

        for(int i = 0; i <= numberOfNumbers; i++) {
            System.out.println(firstNum);

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        System.out.println("These are the first 11 characters of the Fibonacci sequence!");

    }

    }
