package Akshita;

import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4, 5, 6, 85, 987, 25);
//        multiple(2, 3, "jaya", "rajat");
        demo(2, 9, 25, 5524);
        demo ("Rajat" , "Mayur");
//        demo();  //error
    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

//    static void multiple(int a, int b, String ...v){
//        System.out.println(Arrays.toString(v));
//    }
//
//    static void fun(int ...v) {
//        System.out.println(Arrays.toString(v));
//    }
}
