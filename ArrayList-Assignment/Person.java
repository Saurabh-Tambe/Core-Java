package com.pojo;

 
public class Person {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}
public Person()
{}

public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
 
 
 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	Person person=(Person) obj;
	
		return person.getId()==this.getId();
	}
}


