
//Find the average of N positive integers, raising a user defined exception
// for each negative input.


import java.util.*;


class negexception extends Exception
{
	public negexception(String str)
	{
		super(str);

	}

}
class pos_integer
{
void positiveint() throws negexception
{
	
	int count=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int limit=sc.nextInt();
	System.out.println("Enter numbers");
	for(int i=0;i<limit;i++)
	{
		
			int a=sc.nextInt();
			if(a>=0)
			{	count=count+1;
				sum=sum+a;
				
			}
			else
				throw new negexception("number is negative");	
	
		   
		
		
	
	}
	double avg=sum/count;
	System.out.println("avg="+avg);
	
}
}


class mainpos
{
	public static void main(String args[])
	{
	pos_integer pi=new pos_integer();
	try
	{
		pi.positiveint();

	}
	catch(negexception g)
	{
		System.out.println(" ");

		System.out.println("Exception Occured"+g);

	}
	}

}
