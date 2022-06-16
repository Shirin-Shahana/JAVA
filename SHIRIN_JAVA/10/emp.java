import java.util.*;
class Employee
{
	Scanner sc=new Scanner(System.in);
	int eNo,eSalary;
	String eName;
	Employee(int eno,String ename,int esalary)
	{
	this.eNo=eno;
	this.eName=ename;
	this.eSalary=esalary;

	}
	
	void display()
	{
	System.out.println("");
	System.out.println("empno:"+eNo);
	System.out.println("empName:"+eName);
	System.out.println("empsalary:"+eSalary);
	}
	
	
}


class emp
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n,i,count=0;
	int eno,esalary;
	String ename;
	System.out.print("Enter number of employee:");
	n=sc.nextInt();
	Employee e1[]=new Employee[n];
	System.out.println("enter details:");
	System.out.println("eno     ename        salary");
	for(i=0;i<n;i++)
	{
	eno=sc.nextInt();
	ename=sc.next();
	esalary=sc.nextInt();
	e1[i]=new Employee(eno,ename,esalary);
	}
	System.out.println("Display:");
	for(i=0;i<n;i++)
	{
		e1[i].display();	
	}
	System.out.println("Enter empid to display the details:");
	eno=sc.nextInt();

	int a[] =new int[n];
	for(i=0;i<n;i++)
	{
	
	if(e1[i].eNo==eno)
	{
		count=1;
		
		e1[i].display();
		continue;
	}
	

	}
	if(count==0)
	System.out.println("not present");
	
}	
	


}