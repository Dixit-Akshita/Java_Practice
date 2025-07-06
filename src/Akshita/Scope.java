package Akshita;

public class Scope {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
        //a and b can be accessed in main function only
//        System.out.println(marks);//here it will not execute as it is out of random function
    }
    static void random(int marks) {
        int num = 567;
        System.out.println(num);
//        System.out.println(marks); //marks has scope in this function only
    }
}
