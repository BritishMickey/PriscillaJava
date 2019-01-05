public class DigitMath {
	public static int countDigits(int number){
		int count = 0;
		while (number > 0){
			count = count + 1;
			number = number / 10;
		}
		// System.out.println("This is countDigits " + count);
		return count;
	}

	public static int sumDigits(int number){
		int sum = 0;
		while (number > 0){
			sum = sum + number%10;
			number = number/10;
		}
		// System.out.println("This is sumDigits " + sum);
		return sum;
	}
	
	public static double go(int number){
		return (double)sumDigits(number)/countDigits(number);
	}

	public static void main(String args[]){
		int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222};

		DigitMath s1 = new DigitMath();
		DigitMath s2 = new DigitMath();

		DigitMath[] digitMathList = {s1, s2};
		// "For each" loop
		// When you want to iterate through every element of a list 

		//for (int i = 0; i < cases.length; i++){
		//	System.out.println(s.go(cases[i]));
		//}

		for (DigitMath thingInList: digitMathList){
			for (int val: cases){
				System.out.println(thingInList.sumDigits(val));
			}
		}

		/*

		for (int val: cases){
			// System.out.println(s.go(val));

			if (val > 1000){
				System.out.println("Using S1 for " + val);
				System.out.println(digitMathList[0].go(val));
			}
			else {
				System.out.println("Using S2 for " + val);
				System.out.println(digitMathList[1].go(val));
			}

		}

		*/
	}
}
