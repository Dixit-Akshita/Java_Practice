package Akshita;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter i value ");
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(54);
//        list.add(84);
//        list.add(78);
//        list.add(7898);
//        list.add(578);
//        list.add(7855552);
//        list.add(78485);
//          list.add(54678);
//        System.out.println(list);

        // 1. System.out.println(list.contains(54));

        // 2. display all elements
//         System.out.println(list);
//        list.set(0, 99);

        // 3.  list.remove(3);

        // input

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // pass index here, list[index] syntax will not work here
        }

    }
}
