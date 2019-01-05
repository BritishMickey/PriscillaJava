import static java.lang.System.*;
import java.lang.Math;
import java.util.Arrays;

public class ArrayTools
{
	public static int sumSection(int [] numArray, int start, int stop)
	{
		int sum = 0;
		for(int i = start; i<stop; i++)
		{
			sum = sum + numArray[i];
		}
		return sum;
	}
	public static int countVal(int [] numArray, int val)
	{
		int count = 0;
		for (int i = 0; i<numArray.length; i++)
		{
			if(numArray[i]==val)
			{
				count = count + 1;
			}
		}
		return count;
	}

	public static void main (String args[])
	{
		int [] theRay = {2,4,6,8,10,12,8,16,20,8,4,6,2,2};
		System.out.println("Original array: " + Arrays.toString(theRay));
		System.out.println("Sum of 0-3: " + ArrayTools.sumSection(theRay,0,3));
		System.out.println("Count of 2s : " + ArrayTools.countVal(theRay, 2));
	}
}