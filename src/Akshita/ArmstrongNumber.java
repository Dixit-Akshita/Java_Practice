package Akshita;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

    // user input and print true or false
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));

    // print all the 3 digit armstrong numbers(take individual digit cube it and add)
        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
