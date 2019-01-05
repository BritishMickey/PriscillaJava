import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ListOddToEven
{
	public static int go(List<Integer>ray)
	{
		int distance = 0;
		for (int i=0; i<ray.size(); i++)
		{
			if (ray.get(i)%2 != 0)
			{
				for (int j=ray.size()-1; j>i; j--)
				{
					if (ray.get(j)%2 == 0)
					{
						distance = j-i;
						return distance;
					}
				}
				return -1;
			}
		}
		return -1;
	}
	public static void main (String args [])
	{
		ListOddToEven lo = new ListOddToEven();
		System.out.println(lo.go(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11)));
	}
}	