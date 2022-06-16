package Graphics;
import java.util.*;

public class Triangle implements Shape {
    Scanner sc = new Scanner(System.in);
    double h, b;

    public void area() {
        System.out.print("Enter the Length : ");
        b = sc.nextInt();
        System.out.print("Enter the Length : ");
        h = sc.nextInt();
       double ar1 =0.5*b*h;
        System.out.println("Area :" + ar1);

    }

    
}
