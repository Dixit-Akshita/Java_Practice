package Akshita;

public class BlockScope {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 30;
//        String name = " Utkarsh";
//        {
//          int a = 95; // already declared outside the block in the same method, hence you cannot declare it again but you can change the value(declare it)
//            a = 100;   // reassign the original reference variable to some other value
//            System.out.println(a);
//            int c = 35;
//        }
//            name = "Rahul";
//            System.out.println(name);
        // values declared in this block, will remain in block
//        }



        //SCOPING IN for loops
        for(int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            int a = 10; //can't be declared again
            a = 485631; //initialising
        }
//            System.out.println(i);  //can't be used outside for loop
//         System.out.println(a); //outside the block
//        System.out.println(name);  //outside the block
//       System.out.println(c); //cannot use outside the block
    }
}

// anything declared outside the block can be used inside the block but anything that is declared inside the block can't be used outside the block
// anything that is declared outside the block can't be redeclared inside the block but anything declared inside the block can be redeclared outside the block


