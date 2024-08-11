package com.pridicate.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArrayListCount {
   
	public static void main(String[] args) {
		
	
	List<Country> list=new ArrayList<>();
	
	list.add(new Country("Zimbavwe", 11111));
	list.add(new Country("Zombia", 11113));
	list.add(new Country("Norway", 11115));
	list.add(new Country("Sweden", 11119));
	
	Predicate<Country> predicate= c->c.getName().startsWith("Z");
	
	for(Country cntry : list) {
		
		if(predicate.test(cntry)) {
			System.out.println(cntry);
		}
	}
	}
}
