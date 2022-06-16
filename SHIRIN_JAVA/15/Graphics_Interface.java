import Graphics.Circle;
import Graphics.Rectangle;

import Graphics.Square;
import Graphics.Triangle;

import java.util.*;

public class Graphics_Interface
{
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();	
         Square s = new Square();	
        int n;
        while (true) {
            System.out.println("1:Area of Circle");
            System.out.println("2:Area of Square");
            System.out.println("3:Area of Rectangle");
            System.out.println("4:Area of Triangle");
            System.out.println("5:EXIT");
            System.out.println("Enter Your choice ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    c.area();
                    break;
                case 2:
                    s.area();
                    break;
                case 3:
                    r.area(); 
                    break;
                case 4:
                    t.area();
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
