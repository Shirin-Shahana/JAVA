
import java.util.*;


class fibonacci implements Runnable
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{

		     int i,c=0,n;
		 Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number to generate fibonacci series upto nth term");
  		   n=sc.nextInt();
   		int a=0;
   		int b=1;
 
 		System.out.println("Fibonacci series upto "+n+" is :-");
   		while(c<=n)
   		{
      		 System.out.print(c+" ");
      		 a=b;
      		 b=c;
      		 c=a+b;
   		}
  
    	}      
   }      
   
  
class evenno implements Runnable

{
	Scanner sc =new Scanner(System.in);
	public void run(){
	int s,e;
	System.out.println("Enter the range");
	s=sc.nextInt();
	e=sc.nextInt();
 	for(int i=s;i<=e;i++)
		{
			
			if(i%2==0)
			{
				System.out.println("even no."+i);
			}
		}
	}
}


class classeven
{
public static void main(String args[])
{
	
	   
	Scanner sc=new Scanner(System.in);
	fibonacci fi=new fibonacci();
	evenno en = new evenno();
	Thread t1 = new Thread(fi);
	Thread t2 = new Thread(en);
	t1.start();
	t2.start();
	



}
 
        
}