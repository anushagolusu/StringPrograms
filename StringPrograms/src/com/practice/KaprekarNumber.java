package com.practice;

public class KaprekarNumber {
	static String isKaprekarNumber(int input) {

		if (input == 0) {
			return "-2";
		}

		if (input < 0) {
			return "-1";
		}

		if (input == 1) {
			return "true";
		}

		int sq_n = input * input;
		int count_digits = 0;
		while (sq_n != 0) {
			count_digits++;
			sq_n /= 10;
		}
		sq_n = input * input;
		for (int r_digits = 1; r_digits < count_digits; r_digits++) {
			int eq_parts = (int) Math.pow(10, r_digits);
			if (eq_parts == input)
				continue;
			int sum = sq_n / eq_parts + sq_n % eq_parts;
			if (sum == input)
				return "true";
		}
		return "false";

	}

	public static void main(String[] args) {
		int input = 12;
		System.out.println("Result:"+isKaprekarNumber(input));
		
        }
}
