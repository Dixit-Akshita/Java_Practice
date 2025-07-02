package Akshita;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextFloat();
//        System.out.println(num);

///        TypeCasting
//        int num = (int)(67.56f);
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);      // 257 % 256 = 1     1byte=256
//        System.out.println(b);


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d =  a * b  / c;
//        System.out.println(d);

//          int number = 'a';
//          int number = 'A';
//        System.out.println(number);
//        System.out.println("नमस्तै");     //java is a unicode value




        byte b = 42;
        char c = 'a';
        short s = 1025;
        int i = 5420000;
        float f = 683.545f;
        double d = 01.23245;
        double result = (f * b) + (i/c) - (d * s);         //smaller will be converted into bigger
        // float + int - double = double
        System.out.println((f * b) + "    " + (i / c) + "    " + (d * s));
        System.out.println(result);
    }
}
