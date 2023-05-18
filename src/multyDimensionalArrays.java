import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class multyDimensionalArrays {
    public static void main(String[] args) {

        //Methods used to execute tasks:

        //incrementArrayByElement();
        //getChessBoardArray();
        //multiplyTwoMatrices();

    }
    //task #0
    public static void incrementArrayByElement() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to add to the array: ");
        int number = scanner.nextInt();

        int[][][] threeDimensionalArray = new int[][][]{
                {
                        {1, 74, 64, 958, 43},
                        {64, 93, 5, 0, 123},
                        {75, 2, 12, 264, 8}
                }
        };

        for(int i = 0; i < threeDimensionalArray.length; i++) {
            for(int j = 0; j < threeDimensionalArray[i].length; j ++) {
                for(int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    threeDimensionalArray[i][j][k] = threeDimensionalArray[i][j][k] + number;
                    System.out.print(threeDimensionalArray[i][j][k] + " " );
                }
                System.out.println(); //Why, in order to separate arrays we have to include this statement?
            }
        }
    }

    //task # 1
    public static void getChessBoardArray() {
        String[][] chessArr = new String[8][8];
        for(int i = 0; i < chessArr.length; i++) {
            for(int j = 0; j < chessArr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessArr[i][j] = "W";
                } else {
                    chessArr[i][j] = "B";
                }
                System.out.print(chessArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Extra tasks
    //Task #2
    public static void multiplyTwoMatrices() {
        int[][] matrixOne = new int[][]{{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] matrixTwo = new int[][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};

        int[][] matrixThree = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
            matrixThree[i][j] = 0;
            for(int k = 0; j < 3; k++) {
                matrixThree[i][j]+= matrixOne[i][k] * matrixTwo[k][j];
            }
            System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }
    }


    //Task #3
    public static void sumOfMatricesElements() {

    }

    //Task #4
    public static void printDiagonalOfElements() {

    }

    //Task #5




}
