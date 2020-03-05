package com.cts.SpringTest;

public class Employee {
	private int id;
	private String name;
	private String add;
	
	
	
	public Employee(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}



	public void e1()
	{
		System.out.println("Hi this is Employee"+id);
		System.out.println("Hi this is Employee"+name);
		System.out.println("Hi this is Employee"+add);
		
	}

}
