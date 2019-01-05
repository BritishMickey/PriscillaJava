import java.util.Scanner;

public class WordPrinter
{
	public static void printWord(String word, int times)
	{
		for(int i = 0; i<times; i++)
		{
			System.out.println(word);
		}
	}

	public static void main (String args[])
	{
		Scanner kb = new Scanner(System.in);
		String choice = "";
		do
		{
			System.out.println("\nEnter the word to display :: ");
			String word = kb.next();

			System.out.println("Enter the times to display :: ");
			int times = kb.nextInt();

			printWord(word,times);

			System.out.println("\nDo you want to enter more sample input? ");
			choice = kb.next();
		}
		while(choice.equals("Y")||choice.equals("y"));
	}
}