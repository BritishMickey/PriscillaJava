import java.util.Arrays;
import static java.lang.System.*;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
		setList(line);
	}
	public void setList(String line)
	{
		wordRay = line.split(" ");
	}
	public void sort()
	{
		Arrays.sort(wordRay);
	}
	public String toString()
	{
		String output = "";
		for (int i=0; i<wordRay.length; i++)
		{
			output += "word " + i + " :: " + wordRay[i]+"\n";
		}
		return output + "\n\n";
	}

	public static void main(String args[])
	{
		WordSort ws = new WordSort("abc ABC 12321 fred alexander");
		ws.sort();
		System.out.println( ws );

		ws = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		ws.sort();
		System.out.println( ws );

		ws = new WordSort("b x 4 r s y $");
		ws.sort();
		System.out.println( ws );

		ws = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		ws.sort();
		System.out.println( ws );

		ws = new WordSort("ayy bro me come you kool duude sue gay 217 payton ofeldman she pretty");
		ws.sort();
		System.out.println( ws );
	}
}