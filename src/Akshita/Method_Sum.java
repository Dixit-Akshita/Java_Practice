package Akshita;

import java.util.Scanner;

public class Method_Sum {
    public static void main (String[] args) {

        // Q: take input of 2 numbers and print the sum
//        sum();

        int ans = sum2();
//        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    // no return value
//       static void sum() {
//           Scanner in = new Scanner(System.in);
//           System.out.print("Enter number 1 : ");
//           int num1 = in.nextInt();
//           System.out.print("Enter number 2 : ");
//           int num2 = in.nextInt();
//           int sum = num1 + num2;
//           System.out.print("Sum : " + sum);
//       }


    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        return sum;
        //System.out.println();  // this will never execute
    }


    // pass the value of numbers when you are calling the method in main()
//    static int sum3(int a , int b) {
//        int sum = a + b;
//        return sum;
//    }
}






//Syntax
       /*
       return_type name (arguments) {
          //body
          return statement;
        }
        */