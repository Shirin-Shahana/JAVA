// Write a program that reads from a file having integers. Copy even numbers and odd
//numbers to separate files.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.*;
class numbering
{
	public static void main(String args[])
	{
	try{	

		FileInputStream num=new FileInputStream("numbers.txt");
		FileOutputStream odd=new FileOutputStream("odd.txt");
		FileOutputStream even=new FileOutputStream("even.txt");
		
		int i;
		while((i=num.read())!=-1)
		{
			if(i%2==0)
				even.write(i);
			else
				odd.write(i);

		}
		
		System.out.println("copied");
		num.close();
		odd.close();
		even.close();
	}catch(Exception e){System.out.println(e);}
		
	}
}

