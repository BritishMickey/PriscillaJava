import static java.lang.System.*;

public class RayTotal{

	public static int go(int[]ray)
	{
		int total = 0;
		for (int i=0; i<ray.length; i++)
		{
			total = total + ray[i];
		}
		return total;
	}

	public static void main (String args[])
	{
		RayTotal rt = new RayTotal();

		System.out.println(rt.go(new int[]{-99,1,2,3,4,5,6,7,8,9,12345}));
		System.out.println(rt.go(new int[]{10,9,8,7,6,5,4,3,2,1,-99}));
		System.out.println(rt.go(new int[]{10,20,30, 40, 50, -11818,40,30,20,10}));
	}
}