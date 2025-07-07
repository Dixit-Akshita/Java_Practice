package Akshita;

public class Methods_OverLoading {
    public static void main(String[] args) {
        fun(586);
        fun("Kajal");
        // function overloading at compile time it will decide that  which function to run

//        int ans = sum(3 , 5);
//        int ans = sum(3 , 5 , 586);
//        System.out.println(ans);

    }

    static void fun(int a){
        System.out.print("First : ");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.print("Second : ");
        System.out.println(name);
    }

//    static int sum(int a, int b){
//        return a + b;
//    }
//
//
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }


}
