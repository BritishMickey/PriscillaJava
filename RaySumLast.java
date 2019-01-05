import static java.lang.System.*;

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		int none = -1;
		int len = ray.length;
		for (int i=0; i<ray.length; i++)
		{
			if (ray[i]>ray[len-1])
			{
				sum = sum + ray[i];
			}
			else if (ray[i]<=ray[len-1])
			{
				sum = sum;
			}
		}
		if (sum==0)
		{
			return none;
		}
		else
		{
			return sum;
		}
	}

	public static void main(String args[])
	{
		RaySumLast sl = new RaySumLast();

		System.out.println(sl.go(new int[]{-99,1,2,3,4,5,6,7,8,9,10,5}));
		System.out.println(sl.go(new int[]{10,9,8,7,6,5,4,3,2,1,-99}));
		System.out.println(sl.go(new int[]{10,20,30, 40, 50, -11818,40,30,20,10}));
		System.out.println(sl.go(new int[]{32767}));
		System.out.println(sl.go(new int[]{255,255}));
		System.out.println(sl.go(new int[]{9,10,-88,100,-55,2}));
	}
}