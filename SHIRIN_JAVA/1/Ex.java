import java.util.Scanner;

class isEven extends Exception
{
	public isEven(String str)
	{
		super(str)
	} 	

}


class EvenChecks
{
	int n,s;
	Scanner sc=new Scanner(System.in)
	void EvenC throws isEven
	{
		System.out.println("Enter the Limit of Number: ");
		n=sc.nextInt();
		System.out.println("Enter the Numbers: ");
		for(int i=0;i<n;i++)
		{
			s=sc.nextInt();
			if(s%2==0)
			{
				throw new isEven("Even Numbers not Allowed")	
			}
		}
	}
}

public class Evencheck
{
	public static void main(String args[])
	{
		EvenChecks e=new EvenChecks;
		try
		{
			e.Evenc();
		}
		
		catch(isEven u)
		{
			System.out.println("Exception Occured"+u);
		}
	}
}

