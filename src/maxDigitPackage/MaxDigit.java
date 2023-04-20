package maxDigitPackage;

import java.util.ArrayList;

public class MaxDigit {
	public static void main(String[] args) {
		int maxDigit = 9;
		fun(maxDigit);
	}

	private static ArrayList<Integer> fun(int maxDigit) {
		if (maxDigit > 9 || maxDigit < 0) {
				maxDigit=0;
		}
		ArrayList<Integer> numbers = new ArrayList<>();

		for (Integer i = 1; i <= maxDigit; i++) {
			for (Integer j = 0; j <= maxDigit; j++) {
				for (Integer k = 0; k <= maxDigit; k++) {
					for (Integer l = 0; l <= maxDigit; l++) {
						if (i + j + k + l == 21) {
							numbers.add(Integer.parseInt("" + i + j + k + l));
						}
					}
				}
			}
		}
		System.out.println(numbers.size());
		System.out.println(numbers);

		return numbers;
	}

}