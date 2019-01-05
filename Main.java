//(c) A+ Computer Science
//www.apluscompsci.com
//Names - Priscilla Bunday, Meili Gong, Steven Wang


import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size

		//instantiate monster one
		
		//ask for name and size
		
		//instantiate monster two

int size;
		String name;
		out.print("Enter 1st monster's name : ");
		name = keyboard.next();
		out.print("Enter 1st monster's size : ");	
		size=keyboard.nextInt();	
		Monster mOne = new Monster(name, size);

		out.print("Enter 2nd monster's name : ");
		name = keyboard.next();
		out.print("Enter 2nd monster's size : ");	
		size=keyboard.nextInt();	
		Monster mTwo = new Monster(name, size);	

    //FIX THINGS HERE
		
		if(mOne.isBigger(mTwo)==true)
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		if(mOne.isSmaller(mTwo)==true)
		{
			System.out.println("Monster one is smaller than Monster two.");
		}
		if(mOne.namesTheSame(mTwo)==true)
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
    else
		{
			System.out.println("Monster one has a different name as Monster two.");
		}




	}
}