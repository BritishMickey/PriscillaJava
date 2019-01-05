import static java.lang.System.*;

public class BiggestDouble
{
	private double one, two, three, four;
	private double Biggest;
	public BiggestDouble()
	{
		this(0,0,0,0);
	}
	public BiggestDouble(double a, double b, double c, double d)
	{
		//this(a,b,c,d);
		one = a;
		two = b;
		three = c;
		four = d;
	}
	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}
	public double getBiggest()
	{
		if (one>two&&one>three&&one>four){
				Biggest = one;
		}
		else if(two>one&&two>three&&two>four){
					Biggest = two;
		}
		else if (three>one&&three>two&&three>four){
					Biggest = three;
		}
		else if (four>one&&four>two&&four>three){
					Biggest = four;
		}
		return Biggest;
	}
	public String toString()
	{
		return "";
	}

	public static void main (String args[])
	{
	BiggestDouble run = new BiggestDouble();
	//BiggestDouble run = new BiggestDouble();
	run.setDoubles(15.2, 6.7, 7.8, 15.7);
	System.out.print(run);
	System.out.println("biggest = " + run.getBiggest());
	run.setDoubles(2.5, 5.4, 3.6, 1.0);
	System.out.print(run);
	System.out.println("biggest = " + run.getBiggest());
	}
}