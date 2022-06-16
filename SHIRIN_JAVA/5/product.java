import java.util.Scanner;
class pdt
{
  int pcode,price;
  String pname;
  
void input()
 { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the pcode: ");
     pcode =sc.nextInt();
    
    System.out.println("Enter the pname: ");
    pname =sc.next();
    
   System.out.println("Enter the price: ");
    price =sc.nextInt();
 }

}

public class Product
{
  public static void main(String args[])
  {
     pdt p1=new pdt();
     System.out.println("Product 1 ");
     p1.input();
     System.out.println();

     pdt p2=new pdt();
     System.out.println("Product 2 ");
     p1.input();
     System.out.println();

     pdt p3=new pdt();
     System.out.println("Product 3 ");
      p1.input();
      System.out.println();
 }
}
   
 

    
     
  