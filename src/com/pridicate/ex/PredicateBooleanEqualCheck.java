package com.pridicate.ex;

import java.util.function.Predicate;

public class PredicateBooleanEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate= (num)->num==2020;
		System.out.println(predicate.test(2030));

	}

}
