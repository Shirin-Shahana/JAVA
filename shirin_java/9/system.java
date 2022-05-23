import java.util.Scanner;
class CPU
{
	Scanner sc=new Scanner(System.in);
	int price;
	
	void getprice()
	{
	System.out.println("Enter price:");
	price=sc.nextInt();
	}
	class PROCESSOR		
	{
	Scanner sc=new Scanner(System.in);
	int core;
	String manufacturer;
	void getprocessor()
	{
	System.out.println("Enter no. of cores");
	core=sc.nextInt();
	System.out.println("Enter manufacturer:");
	manufacturer=sc.next();
	
	}
	void putprocessor()
	{
	System.out.println("no. of cores:"+core);
	System.out.println("manufacturer:"+manufacturer);
	}
	
	}

	static class RAM
	{
	int memory;
	String manufacturer;
	Scanner sc=new Scanner(System.in);
	void getram()
	{
	System.out.println("Enter memory");
	memory=sc.nextInt();
	System.out.println("Enter manufacturer:");
	manufacturer=sc.next();
	}
	void putram()
	{
	System.out.println("memory:"+memory+"GB");
	System.out.println("manufacturer:"+manufacturer);
	}
	}
	


}

class system
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	CPU c=new CPU();
	CPU.PROCESSOR p=c.new PROCESSOR();
	CPU.RAM r=new CPU.RAM();
	c.getprice();
	p.getprocessor();
	r.getram();

	System.out.println("DISPLAY:");

	p.putprocessor();
	r.putram();
	
	}


}