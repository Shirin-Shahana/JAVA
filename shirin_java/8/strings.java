import java.util.*;
class strings
{
	public static void main(String args[])
	{
	int i,j,n;
	String temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=sc.nextInt();
	String a[]=new String[n];
	System.out.println("Enter character");
	for(i=0;i<n;i++)
		 a[i]=sc.next();
	System.out.println("before sorting:");
	for(i=0;i<n;i++)
		System.out.println(a[i]);
	
	
	for(i=0;i<n;i++)
	{
	for(j=i+1;j<n;j++)
	{	if(a[i].compareTo(a[j])>0)
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	}
	}
	System.out.println("after sorting:");
	for(i=0;i<n;i++)
		System.out.println(a[i]);
}

}