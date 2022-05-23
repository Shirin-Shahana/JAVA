package Graphics;
import java.util.*;

class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);
    int l, b;

    public void area() {
        System.out.print("Enter the Length : ");
        l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        b =sc.nextInt();
       int ar1 =l * b;
        System.out.println("Area :" + ar1);

    }

}
