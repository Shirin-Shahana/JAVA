/* Write a program to write to a file, then read from the file and display the contents on the
console. */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class filing
{
	public static void main(String args[])
	{
		
		
	
	try{
		
		FileWriter fw=new FileWriter("file1.txt");
		fw.write("Good Morning \n Good Evening");
		fw.write("\nMorning \nEvening");
		fw.close();
		System.out.println("Successfully Written");
		

		File obj1=new File("file1.txt");
		Scanner s=new Scanner(obj1);
		while(s.hasNextLine()){
		String data=s.nextLine();
		System.out.println(data);
		}
		s.close();

	  }
	catch(Exception e)
	{
		System.out.println("Exception occured"+e);

	}


	}


}