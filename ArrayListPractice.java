import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.lang.System.*;

public class ArrayListPractice
{
	public Boolean hasMoreVowelsThanConsonants(String word)
	{
		int vo = 0;
		int co = 0;
		for (int i=0; i<word.length(); i++)
		{
			if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				vo = vo+1;
			}
				co = co+1;
		}
		if (vo>co)
		{
			return true;
		}
		return false;
	}

	public void stringRemoverMachine(List<String> words)
	{
		for (int i=words.size()-1; i>=0; i--)
		{
			if (!hasMoreVowelsThanConsonants(words.get(i)))
			{
				words.remove(i);
			}
		}
	}

	public static void main(String args[])
	{
		ArrayListPractice alp = new ArrayListPractice;
		alp.stringRemoverMachine();
	}
}