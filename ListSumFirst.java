import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListSumFirst
{
	public static int go(List<Integer>ray)
	{
		int sum = 0;
		for (int item : ray)
		{
			if (item>ray.get(0))
			{
				sum += item;
			}
		}
		return sum;
	}
	public static void main (String args [])
	{
		ListSumFirst lsf = new ListSumFirst();
		System.out.println(lsf.go(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5)));
	}
}