import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class MadLib
{

	List<String> nouns = new ArrayList<>(Arrays.asList("tomato","Olivia","soccer","NASA","debate","TV","crockpot","mitten","dog","kitten","schoology","tosspot"));
	List<String> verbs = new ArrayList<>(Arrays.asList("dies","runs","leaps","drinks","talks","flys","rollerblades","skips","debates","sins","sighs","destroys"));
	List<String> adjectives = new ArrayList<>(Arrays.asList("happy","gay","depressed","savage","annoying","stupid","american","real","parsimonious","lazy","orange","thirsty","confused"));

	public void go()
	{
		Scanner kb = new Scanner(System.in);
		String choice = "";
		do
		{
			Collections.shuffle(nouns);
			Collections.shuffle(verbs);
			Collections.shuffle(adjectives);
			String madN = nouns.get(0);
			String madV = verbs.get(0);
			String madA = adjectives.get(0);
			String madN2 = nouns.get(1);
			String madV2 = verbs.get(1);
			String madA2 = adjectives.get(1);
			out.println("the very " + madA + " " + madN + " " + madV + " then " + madV2 + " for a nice, " + madA2 + " time with " + madN2);
			out.println("the very attractive Olivia Feldman debated and won cuz she smart and funny");
			out.println("Olivia is very " + madA + " and " + madV + " while she " + madV2 + " " + madA2 + "ily");
			out.println("Do you want to MadLib again? Please type yes or no");
			choice = kb.next();

		}
		while (choice.toUpperCase().equals("YES"));

	}

	public static void main (String args[])
	{
		MadLib ml = new MadLib();
		ml.go();
	}
}