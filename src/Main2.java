import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //isValueIn();
        //compareTwoArrays();
        //createRandomArray();
        //checkTheValue();


    }

    public static void isValueIn() {

        int[] array = new int[]{65, 39, 1, 45, 8, 95, 4};
        boolean valueIn = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numberToCheck = scanner.nextInt();

        for (int i : array) {
            if (i == numberToCheck) {
                valueIn = true;
                break;
            }
        }
        System.out.println(valueIn);

    }
    //task #1
    public static void checkTheValue() {
        int[] arrayOne = new int[]{85, 4, 884, 649, 90, 5, 786, 847};
        int[] arrayTwo = new int[arrayOne.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < arrayOne.length; i++) {
            if (number != arrayOne[i]) {
                System.out.println(i);

            }
        }
    }

    //task #2
    public static void createRandomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of elements in array ");
        int numOfElements = scanner.nextInt();
        int[] randomArr = new int[numOfElements];
        Random random = new Random();
        for(int i = 0; i <randomArr.length; i++ ) {
            randomArr[i] = random.nextInt();
            System.out.println(randomArr[i]);
            System.out.println("The min value of array is: " + Arrays.stream(randomArr).boxed().min(Integer::compare).get());
            System.out.println("The max value of array is: " + Arrays.stream(randomArr).boxed().max(Integer::compare).get());

        }
    }

    //task #3
    public static void compareTwoArrays() {
        int[] arrayOne = new int[]{64, 3, 85, 90, 1};
        int[] arrayTwo = new int[]{75, 4, 2, 12, 35};
        int arrOneTotal = 0;
        int arrTwoTotal = 0;
            System.out.println(Arrays.toString(arrayOne));
            System.out.println(Arrays.toString(arrayTwo));

            for(int i=0; i< arrayOne.length; i++) {
               arrOneTotal = arrOneTotal + arrayOne[i];
            }
            for(int j=0; j< arrayTwo.length; j++) {
            arrTwoTotal = arrTwoTotal + arrayTwo[j];
        }
            //System.out.println(arrOneTotal); I was checking myself
            //System.out.println(arrTwoTotal);
            int arrOneAve = arrOneTotal / arrayOne.length;
            int arrTwoAve = arrTwoTotal / arrayTwo.length;

            if(arrOneAve > arrTwoAve) {
                System.out.println("ArrayOne average is " + arrOneAve + " and is greater than ArrayTwo average of " + arrTwoAve);
            } else if(arrOneAve == arrTwoAve) {
                System.out.println("ArrayOne average is " + arrOneAve + " and is equal to ArrayTwo Average of " + arrTwoAve);
            } else {
                System.out.println("ArrayTwo average is " + arrTwoAve + " and is greater than ArrayOne average of " + arrOneAve);
            }
    }
}






