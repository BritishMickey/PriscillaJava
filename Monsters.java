import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster [] myMonsters;
	private int height;
	private int weight;
	private int age;

	public Monsters(int h, int w, int a)
	{
		height = h;
		weight = w;
		age = a;
	}


	public boolean isBigger(Monster other)
	{
		if(height>other.height)
			return true;
		if(height<other.height)
			return false;
		if(weight>other.weight)
			return true;
		if(weight<other.weight)
			return false;
		if(age>other.age)
			return true;
		return false;
	}
	
	public String toString()
	{
		return "" + height + " " + weight + " " + age;
	}

	public Monsters()
	{
		setMonsters(0);
	}

	public Monsters(int size)
	{
		setMonsters(size);
	}

	public void setMonsters(int size)
	{
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		if(spot<myMonsters.length)
			myMonsters[spot] = m;
	}

	public Monster get(int spot)
	{
		return myMonsters[spot];
	}

	public String getLargest()
	{
		Monster big = myMonsters[0];
		for(int i=1; i<myMonsters.length; i++)
		{
			if(!big.isBigger(myMonsters[i]))
				big = myMonsters[i];
		}
		return myMonsters[myMonsters.length-1];
	}

	public Monster getSmallest()
	{
		Monster small = myMonsters[0];
		for(int i=1; i<myMonsters.length; i++)
		{
			if(small.isBigger(myMonsters[i]))
				small = myMonsters[i];
		}
		return myMonsters[0];
	}

	public String toString()
	{
		return "" + Arrays.toString(myMonsters);
	}

	public static void main(String args [])
	{
		Scannner kb = new Scanner(System.in);

		out.print("How many monsters are there in the herd? :: ");
		int size = kb.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size; i++)
		{
			out.print("\nEnter the height :: ");
			int height = kb.nextInt();
			out.print("Enter the weight :: ");
			int weight = kb.nextInt();
			out.print("Enter the age :: ");
			int age = kb.nextInt();
			herd.add(i, new Monster(height, weight, age));
			out.print("\n");
		}

		System.out.println("HERD :: " + herd);
		System.out.println("SMALLEST :: " + herd.getSmallest());
		System.out.println("LARGEST :: " + herd.getLargest());
	}
}