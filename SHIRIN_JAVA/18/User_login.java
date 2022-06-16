import java.util.Scanner;
class  invaliduser extends Exception
{
	public invaliduser(String str)
	{
	super(str);
	}
} 


class authenticate
{
Scanner sc=new Scanner(System.in);
String usr="root",pswd="12345";
String usrn,pswdn;
void get() throws invaliduser
{
System.out.println("Enter the username:");
usrn=sc.next();
System.out.println("Enter the password:");
pswdn=sc.next();
if(usrn.equals(usr) && pswdn.equals(pswd))
{
System.out.println("Login successfull");
}
else
{
throw new invaliduser("Invalid username or password");
}
}
}

class User_login
{
public static void main(String args[])
{
authenticate c=new authenticate();
try
{
c.get();
}
catch(invaliduser u)
{
System.out.println("Exception occured\n"+u);	
}
}
}