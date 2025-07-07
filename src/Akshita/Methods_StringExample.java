package Akshita;

import java.util.Scanner;

public class Methods_StringExample {
    public static void main(String[] args) {
//      String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String Name = in.next();
        String personalised = myGreat(Name);
        System.out.println(personalised);
    }

    static String myGreat(String name) {
        String message =  "Hello " + name;
        return message;
    }

//    static String greet(){
//
//        String greeting = "how are you";
//        return greeting;
//    }
}
