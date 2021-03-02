package myprogrammes;

public class LCM {

	public static void main(String[] args) {
		int[] i = {2,-4,6};
		System.out.println(lcmOfArray(i));
	}

	public static long lcmOfArray(int[] elementArray) {
		long lcm = 1;
		int divisor = 2;
		while (true) {
			int counter = 0;
			boolean divisible = false;
			for (int i = 0; i < elementArray.length; i++) {
				if (elementArray[i] == 0) {
					return 0;
				} else if (elementArray[i] < 0) {
					elementArray[i] = elementArray[i] * (-1);
				}
				if (elementArray[i] == 1) {
					counter++;
				}
				if (elementArray[i] % divisor == 0) {
					divisible = true;
					elementArray[i] = elementArray[i] / divisor;
				}
			}
			if (divisible) {
				lcm = lcm * divisor;
			} else {
				divisor++;
			}
			if (counter == elementArray.length) {
				return lcm;
			}

		}

	}

}
