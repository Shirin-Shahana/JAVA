package Arithmetic;
import java.util.*;

class Arithmetic_Interface
{
public static void main(String args[]) {
       int l,b;
        Scanner sc = new Scanner(System.in);
        arith_add a = new arith_add ();
        arith_div d = new arith_div();
        arith_mul m = new arith_mul();	
         arith_sub s = new arith_sub();	
        int n;
        
        while (true) {
            System.out.println("\n1:Addition");
            System.out.println("2:Subtration");
            System.out.println("3:Multiplication");
            System.out.println("4:Division");
            System.out.println("5:EXIT");
            System.out.println("Enter Your choice ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    a.addition();
                    break;
                case 2:
                    s.subtraction();
                    break;
                case 3:
                    m.multiplication(); 
                    break;
                case 4:
                    d.division();
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                default:
                    System.out.println("invalid! choice");

            }
        }

    }
}
