//string manipulaton

import java.util.Scanner;
public class string
{
	public static void main(String args[]){
	String s1,s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string1:");
	s1=sc.next();
	System.out.println("Enter string2:");
	s2=sc.next();
	System.out.println("1.Uppercase:"+s1.toUpperCase());
	System.out.println("2.Lowercase:"+s1.toLowerCase());
	System.out.println("3.Substring:"+s1.substring(2,5));
	System.out.println("4.String length:"+s1.length());
	System.out.println("5.index of:"+s1.indexOf('h'));
	System.out.println("6.replace:"+s2.replace('s','z'));
	System.out.println("7.concat:"+s1.concat(s2));
	System.out.println("8.compare:"+s1.compareTo(s2));
	System.out.println("9.equals:"+s1.equals(s2));
	System.out.println("10.contains:"+s2.contains("ahana"));
	System.out.println("11.charat:"+s1.charAt(0));
	System.out.println("");
	System.out.println("");
}
}