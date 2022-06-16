//Find the area and perimeter by using object and class.

import java.util.Scanner;
class circlee
{
   double pi=3.14,area,perimeter,r;
   void area()
     {
       System.out.println("Enter the Radius of circle: ");
       Scanner sc=new Scanner(System.in);
       r=sc.nextDouble();

       area=pi*r*r;
    }

    void perimeter()
     {
       System.out.println("Enter the Radius of circle: ");
       Scanner sc=new Scanner(System.in);
       r=sc.nextDouble();

        perimeter=2*pi*r;
    }

    void display()
     {
       System.out.println("The Area of circle: "+area);
       System.out.println("The Perimeter of circle: "+perimeter);
     }
}
public class Circle
{
  public static void main(String args[])
  {
    circlee cr1 = new circlee();
    cr1.area();
    cr1.perimeter();
    cr1.display();

    circlee cr2 = new circlee();
    cr2.area();
    cr2.perimeter();
    cr2.display();
 
  
  }
}








       