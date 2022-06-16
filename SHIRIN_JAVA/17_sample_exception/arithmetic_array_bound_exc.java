

import java.util.*;
class arithmetic_array_bound_exc
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];

		try{
			
		a[10]=50;
			}

		
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("error handling");
	}
}
