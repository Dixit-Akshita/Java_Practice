package Akshita;
//import java.util.Arrays;
import java.util.Scanner;
public class MultiDimArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
             1 2 3
             4 5 6
             7 8 9
         */

//        int[][] arr = new int[3][];    //number of rows are mandatory
//        int[][] arr = {
//               {1, 2, 3}, // 0th index
//               {4, 5},  // 1st index
//               {7, 8, 9}    // 2nd index -> arr2D[2] = {6, 7, 8, 9}
//        };
//        System.out.println(arr2D[0][1]


        int[][] arr = new int[3][3];
        System.out.print(arr.length);

//       INPUT

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // OUTPUT
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
