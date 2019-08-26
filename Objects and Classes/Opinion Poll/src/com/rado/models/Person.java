package com.rado.models;

public class Person implements Comparable<Person> {
	private String _name;
	private int _age;
	
	public Person(String name, int age) {
		_name = name;
		_age = age;
	}

	public String getName() {
		return _name;
	}

	public int getAge() {
		return _age;
	}

	@Override
	public int compareTo(Person other) {
		return this.getName().compareTo(other.getName());
	}
	
}
