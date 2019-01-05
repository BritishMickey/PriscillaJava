import static java.lang.System.*;
import java.util.Scanner;

public class TriangleTwo
{
	private int size;
	private String letter;

	public TriangleTwo()
	{
		size = 0;
		letter = "";
	}	

	public TriangleTwo(int count, String let)
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
		for (int i=size; i>0; i--)
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
		Scanner kb = new Scanner(System.in);
		String choice = "";
			do{
				out.print("Enter the size of the triangle : ");
				int big = kb.nextInt();
				out.print("Enter a letter : ");
				String value = kb.next();
				System.out.println();

				TriangleTwo test = new TriangleTwo(big, value);
				out.println(test);

				System.out.print("Do you want to enter more data?");
				choice = kb.next();
				System.out.println();
			}while (choice.equals("Y")||choice.equals("y"));
	}

}