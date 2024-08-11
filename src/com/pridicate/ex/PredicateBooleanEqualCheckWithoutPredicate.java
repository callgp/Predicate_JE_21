package com.pridicate.ex;

import java.util.function.Predicate;

public class PredicateBooleanEqualCheckWithoutPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Predicate<Integer> predicate= (num)->num==2020;
		System.out.println(checkNumber(2030));
		System.out.println(checkNumber2(2030));

	}

	private static boolean checkNumber(int num) {
		if (num == 2020) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean checkNumber2(int num) {
		return num == 2020;
	}

}
