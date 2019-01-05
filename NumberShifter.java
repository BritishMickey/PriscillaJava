import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		return null;
	}	
	public static void shiftEm(int[] array)
	{
		System.out.println(Arrays.toString(array));
		for (int i = 0; i<array.length-1; i++)
		{
			int upper = i;
			for (int j=i+1; j<array.length; j++)
				{
					if (array[j]==7)
					upper = j;
				}
			
			if (upper != i)
				{
					int temp = array[upper];
					array[upper] = array[i];
					array[i] = temp;
				}
			}
		
		System.out.println(Arrays.toString(array));
		System.out.println();
	}
	public static void main(String args[]) throws IOException
	{
		NumberShifter ns = new NumberShifter();
		int[]array = {1,10,9,2,5,8,6,7,9,7,8,6,7,3,5,4};
		NumberShifter.shiftEm(array);
	}
}