//area of different shapes using overloaded function.....
//rectangle...circle....square....triangle...

import java.util.*;
class area_overload
{
    
    double ar;
    double pi=3.14;

    //square

    double area(int a)
    {
        ar=a*a;
        return ar;
    }

    //rectangle

    double area(int l,int b)
    {
        ar=l*b;
        return ar;
    }

    //circle

    double area(double r)
    {
        ar=pi*r*r;
        return ar;
    }

    //triangle

    double area(double b,int h)
    {
        ar=.5*b*h;
        return ar;
    }

    void display(double result)
    {
        System.out.println("Area="+result);
    }

}


public class shapes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,l,b,h;
        double br,r,result;

        area_overload a1=new area_overload();

        System.out.println("Enter values for rectangle");
        System.out.print("length:");
        l=sc.nextInt();
        System.out.print("breadth:");
        b=sc.nextInt();
        result=a1.area(l,b);
        a1.display(result);

        System.out.println("Enter values for square");
        System.out.print("length:");
        a=sc.nextInt();
        result=a1.area(a);
        a1.display(result);

        System.out.println("Enter value for circle");
        System.out.print("radius:");
        r=sc.nextDouble();
        result=a1.area(r);
        a1.display(result);

        System.out.println("Enter values for triangle:");
        System.out.print("breadth:");
        br=sc.nextDouble();
        System.out.print("height:");
        h=sc.nextInt();
        result=a1.area(br,h);
        a1.display(result);

    }
}