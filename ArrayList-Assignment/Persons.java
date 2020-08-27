package com.io;
import java.util.List;

import com.pojo.Person;
public interface Persons {
	public List<Person> getPersons(); //get data about persons from user
	public   Person findById(int id, List<Person>persons);//find the person by id
	public   boolean removePerson(int id,List<Person>persons);//remove person by id
	public   Person updatePerson(int id,String name,List<Person>persons); //update by id
	public void displayPersons(List<Person>persons); //display data 
	public   List<Person> addPerson(List<Person> persons, Person person); //add person to list 
}
