package com.pridicate.ex;

import java.util.function.Predicate;

public class PredicateBooleanEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predicate= (str)->str.length()==5;
		System.out.println(predicate.test("aaaaa"));

	}

}
