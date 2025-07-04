package Akshita;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1:
                System.out.println("Jagruti Singh");
                break;
            case 2:
                System.out.println("Mayur Mishra");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Medical":
                        System.out.println("Medical Department");
                        break;
                    default:
                        System.out.println("No Department entered ");
                }
                break;
            default:
                System.out.println("Enter correct Emp ID");
        }
    }
}
