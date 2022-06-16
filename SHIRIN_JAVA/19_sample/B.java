class A extends Thread
{
public void run()
{
	for(int i=0;i<5;i++)
	System.out.println("class A extends thread");

}
}


class B extends A
{
	public static void main(String args[]){

		A obj=new A();
		obj.start();
		for(int i=0;i<5;i++)
	System.out.println("class B derive A It is a sample program");
}

}