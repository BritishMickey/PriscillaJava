import java.util.Arrays;

public class MemoryLocation {


	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = a;
		int[] c = new int[3];

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());


		a[0] = 5;

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		a = new int[5];

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());

	}
}