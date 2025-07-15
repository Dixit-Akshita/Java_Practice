package Akshita;

import java.util.Arrays;

public class LS_InStrings {
    public static void main(String[] args) {
        String name = "Akshita Dixit";
        char target = 'a';
        //System.out.println(search(name, target));

       System.out.println(Arrays.toString(name.toCharArray()));

        }

//    static boolean search(String str, char target) {
//        if (str.isEmpty()) {          // here str.length() contains bracket bcoz it is a function/method
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//    }


    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }



}
