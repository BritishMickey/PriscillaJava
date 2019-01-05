import java.util.Scanner;
import java.lang.System.*;

public class LetterBoxes
{
	public static void printBox(String letter, int size)
	{
		for (int i = 0; i<size; i++)
		{
			for(int j = 0; j<size; j++)
			{
				System.out.print(letter);
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		String choice = "";

		do
		{
			Scanner kb = new Scanner(System.in);

			System.out.println("Enter a letter :: ");
			String letter = kb.next();

			System.out.println("Enter a number :: ");
			int size = kb.nextInt();

			printBox(letter, size);

			System.out.println("Do you want to play again? Type y if so");
			choice = kb.next();
		}
		while(choice.equals("y")||choice.equals("Y"));
	}
}