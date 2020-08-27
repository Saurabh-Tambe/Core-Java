package com.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
import com.pojo.Person;

public class PersonImpl implements Persons{
Scanner sc=new Scanner(System.in);
	@Override
	public List<Person> getPersons() {
		List<Person> persons= new ArrayList<Person>();
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter ID");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			 
			String name=sc.next();
		 
			 
			persons.add(new Person(id,name));
		}
		return persons;
		 
	 
	}

	@Override
	public Person findById(int id, List<Person> persons) {
		Person p = null;
		for (Person obj : persons) {
			if (obj.getId() == id) {
				p = obj;
				break;
			}
		}
		return p;
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		return false;
	}

 

	@Override
	public void displayPersons(List<Person>persons) {
		
		for (Person b: persons) {
			   System.out.println(b);
			   b.toString();
		   }
		 
		
	}

	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		persons.add(new Person(person.getId(),person.getName()));
		return persons;
	}

	@Override
	public Person updatePerson(int id, String name, List<Person> persons) {
		Person p4 = findById(id,persons);
		if (p4 != null) {
			p4.setName(name);
		}
		return p4;
	}

}
