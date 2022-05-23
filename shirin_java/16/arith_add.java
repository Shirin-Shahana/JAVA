package Arithmetic;
import java.util.*;

interface operations {
    public void addition();
    
    
}


class arith_add implements operations {
    
    public void addition() {
	Scanner sc=new Scanner(System.in);
     	int a,b;
    System.out.print("Enter the value a ");
        a = sc.nextInt();
        System.out.print("Enter the value b : ");
        b =sc.nextInt();
	int r=a+b;
        System.out.println("Result : "+r);
        
    }
}