import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
	password = "HeyO";
	}

public void check()
{
Scanner keyboard = new Scanner(System.in);
do{
	out.print("Enter a password :: ");
password = keyboard.next();

if(!password.equals("HeyO"))
	out.println("INVALID");
else
out.println("VALID");
}
while(!password.equals("HeyO"));
}


public static void main (String args[])
{
PasswordCheck test = new PasswordCheck();
test.check();	
}
}