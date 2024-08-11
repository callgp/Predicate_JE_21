package com.pridicate.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArrayListCount {
   
	public static void main(String[] args) {
		
	
	List<Integer> list=new ArrayList<>();
	
	list.add(10);
	list.add(5);
	list.add(61);
	list.add(2);
	list.add(55);
	
	Predicate<Integer> predicate= num -> num>10;
	
	for(Integer number : list) {
		
		if(predicate.test(number)) {
			System.out.println(number);
		}
	}
	}
}
