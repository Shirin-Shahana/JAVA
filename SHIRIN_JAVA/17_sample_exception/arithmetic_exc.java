//EXCEPTION HANDLING


import java.util.*;
class arithmetic_exc
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		a=sc.nextInt();
		System.out.println("Enter number");
		b=sc.nextInt();
		try{
			if(a/b==5)
			System.out.println("b");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("error handling");
	}
}