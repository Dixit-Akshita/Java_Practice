package Akshita;

public class Methods_For_Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


//         swap numbers CODE-1
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);


        //    CODE-2   (Method Form - no swapping because the value is passed not the value of reference is passed)
//        swap(a, b);
//        System.out.println(a + " " + b);



        // CODE-3
//        String name = "vinay";
//        changeName(name);
//        System.out.println(name);
    }

        //CODE-2 PART
//    static void swap(int num1 ,int num2) {
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//    }


//         CODE-3 PART
//        static void changeName(String naaam){
//        naaam = "Jagruti";                 // creating a new object
//        }

}
