import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


class evenodd
{
	public static void main(String args[])
	{
	
	try{
		
		

		File obj1=new File("number.txt");
		FileWriter obj2 =new FileWriter("odd.txt");
		FileWriter obj3 =new FileWriter("even.txt");
		Scanner s=new Scanner(obj1);
		while(s.hasNextLine()){
		int n=s.nextInt();
		if(n%2 == 0)
			{obj3.write(String.valueOf(n));
			obj3.write(" ");}
		else
 			{obj2.write(String.valueOf(n));
			obj3.write(" ");}
		
		}
		
		obj2.close();
		obj3.close();

	  }
	catch(Exception e)
	{
		System.out.println("Exception occured"+e);

	}

	}

}