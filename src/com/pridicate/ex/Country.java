package com.pridicate.ex;

public class Country {

	private String name;
	private int population;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	@Override
	public String toString() {
		return "County [name=" + name + ", population=" + population + "]";
	}
}
