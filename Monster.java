//(c) A+ Computer Science
//www.apluscompsci.com
//Names - Priscilla Bunday, Meili Gong, Steven Wang

import static java.lang.System.*;

public class Monster
{
	private String name;
	private int howBig;	

	public Monster()
	{
	}

	public Monster(String n, int size)
	{
    name = n;
    howBig = size;
	}

	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster other)
	{
		return howBig>other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		//call isBigger() use !
		return howBig<other.getHowBig();
	}

	public boolean namesTheSame(Monster other)
	{
		return name.equals(other.getName());
	}

  public String toString()
	{
		return name + " " + howBig;
	}

}
	