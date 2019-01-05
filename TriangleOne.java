import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne
{
	private int size;
	private String letter;

	public TriangleOne()
	{
		size = 0;
		letter = "";
	}

	public TriangleOne(int count, String let)
	{
		setTriangle(count, let);
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = "";
		for (int i=1; i<=size; i++)
		{
			for (int j=0; j<i; j++)
				{
					output+=getLetter();
				}
				output+="\n";
			}
		return output;	
	}

	public static void main (String args[])
	{
		// This is the main function
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
			do{
				out.print("Enter the size of the triangle : ");
				int big = keyboard.nextInt();
				out.print("Enter a letter : ");
				String value = keyboard.next();
				System.out.println();

				TriangleOne test = new TriangleOne(big, value);
				out.println(test);

				System.out.print("Do you want to enter more data?");
				choice = keyboard.next();
				System.out.println();
			}while (choice.equals("Y")||choice.equals("y"));
	}

}