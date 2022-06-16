//complex number addition
import java.util.*;
class complex_s
{
	Scanner sc=new Scanner(System.in);
	int real,imag;
	void input()
	{
	System.out.print("Enter real number:");
	real=sc.nextInt();
	System.out.print("Enter imag number:");
	imag=sc.nextInt();
	} 
	

}

public class complex
{
	public static void main(String args[])
	{
	int real,imag;
	complex_s s1=new complex_s();
	System.out.println("COMPLEX NUMBER 1:");
	s1.input();
	complex_s s2=new complex_s();
	System.out.println("COMPLEX NUMBER 2:");
	s2.input();
	
	real=s1.real+s2.real;
	imag=s1.imag+s2.imag;
	System.out.println("Add");
	System.out.println(real+"+ i"+imag);
	
	}

}