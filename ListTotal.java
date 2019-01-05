import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ListTotal
{
	public static int go(List<Integer>ray)
	{
		int sum = 0;
		for (int item : ray)
		{
			sum += item;
		}
		return sum;
	}
	public static void main (String args [])
	{
		ListTotal lt = new ListTotal();
		System.out.println(lt.go(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345)));
	} 
}