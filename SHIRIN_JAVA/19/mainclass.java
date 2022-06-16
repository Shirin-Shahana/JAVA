
import java.util.*;

/*class multiplication5 extends Thread
{
	public void run()
	{
		for(int i=1;i<1=5;i++)
		{
			int s=i*5;
			System.out.println(i+"* 5 ="+s);
		}
	}

}
*/

class primenum extends Thread
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{

		int i,j,n; 
	        System.out.println("Enter the number till which you want prime numbers");
	        n=sc.nextInt();
                System.out.println("Prime numbers are:-");
                for(i=2;i<=n;i++)
                {
        		int c=0;
        		for(j=1;j<=i;j++)
        		{
           		 if(i%j==0)
            		{
               			 c++;
            		}
        		}
         
       		if(c==2)
        	{
		System.out.println(i);
        	}
    		}
  
    	}      
   }      
   
  





class mainclass extends primenum
{
public static void main(String args[])
{
	
	   
	primenum pr=new primenum();
	pr.start();
 	for(int i=1;i<=10;i++)
		{
			int s=i*5;
			System.out.println(i+"* 5 ="+s);
		}

}
}