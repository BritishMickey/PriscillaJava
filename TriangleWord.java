import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	public static void printTriangle(String word)
	{
		String real = "";
		String second = "";
		for (int i = 0; i<word.length(); i++)
		{
			for (int j = 0; j<=i; j++)
			{
				out.print(word.substring(0, i+1));
			}
			out.println();
		}
	}

	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		String choice = "";

		do
		{
			out.print("Enter a word : ");
			String word = kb.next();

			printTriangle(word);

			out.println("Do you want to play again?");

			choice = kb.next();
		}
		while (choice.equals("yes")||choice.equals("Yes"));
	}
}
