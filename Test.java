import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test{

	/*public static void main(String[] args) {
		try
	    {
			Scanner theFile = new Scanner(new File("stuff.dat"));  
			int cnt = theFile.nextInt();
			int sum = 0;

			for (int j = 1; j<=cnt; j++)
			{
				int num = theFile.nextInt();
				if(num%2==1)
					sum = sum + num;
			}
			out.println(sum);
	    }
	    catch (FileNotFoundException ex)  
	    {
	    	System.out.println("Error! Could not open: ");
	    }
	    
		
	}*/
/*public static String getLetters(int cnt, String letter)
{
String output = "";
for (int i = 0; i<cnt; i++)
{
output = output + letter;
}
return output;
}

public static String getLetterTriangle(int howMany, String letter)
{
String output = "";
for (int i = 1; i<=howMany; i++)
{
output = output + getLetters(i, letter);
output = output + "\n";
}
return output;
}*/
//part a:
/*public static int getPairValue(int [] array, int pos)
{
int value = 0;
for (int i = 0; i<1; i++)
{
value = array[pos] + array[pos+1];
}
return value;
}
//part b:
public static boolean isOdd(int num)
{
if (num%2==0)
{
return false;
}
return true;
}
//part c:
public static int getOddPairCount(int [] array)
{
int count = 0;
for (int i = 0; i<array.length-1; i++)
{
if (isOdd(getPairValue(array, i)))
{
count = count + 1;
}
}
return count;
}
//part d:
public static int[] getOddPairArray(int [] array)
{
int [] oddArray = new int [getOddPairCount(array)];
for (int i = 0; i<array.length-1; i++)
{
if (isOdd(getPairValue(array, i)))
{
for (int j=0; j<array.length-1; j++)
{
oddArray[j] = getPairValue(array, i); 
}
}
}
return oddArray;
}*/

public Boolean hasMoreVowelsThanConsonants(String word)
{
int vo = 0;
int co = 0;
for (int i=0; i<word.length(); i++)
{
if (word.charAt(i)==('a'||'e'||'i'||'o'||'u'))
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

public void stringRemoverMachine(String [] ray)
{
ArrayList<String> clean = new ArrayList<String>();
for (int i=0; i<ray.length; i++)
{
if (hasMoreVowelsThanConsonants(String ray(i)))
for (int j=0; j<ray.length; j++)
{
clean.add(j,"null");
clean.set(j,ray[i]);
}
}
}
	}
