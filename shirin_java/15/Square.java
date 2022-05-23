package Graphics;
import java.util.*;

class Square implements Shape {
    Scanner sc = new Scanner(System.in);
    int l, b;

    public void area() {
        System.out.print("Enter the Length : ");
        l = sc.nextInt();
        
       int ar1 =l * l;
        System.out.println("Area :" + ar1);

    }

    
}
