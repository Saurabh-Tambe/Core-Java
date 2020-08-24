public class Student {
private int id;
private String name;
private int age;
private int std;
private int[] marks=new int[5];
private int total;

public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getStd() {
	return std;
}
public void setStd(int std) {
	this.std = std;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}


public void display()
{
	
System.out.println(id+"\t"+name+"\t"+age+"\t"+std+"\t"+marks[0]+"\t"+marks[1]+"\t"+marks[2]+"\t"+marks[3]+"\t"+marks[4]);	
}

 
 
 
 
public Student(int id, String name, int age, int std, int[] marks) {
	this.id=id;
	this.name=name;
	this.age=age;
	this.std=std;
	this.marks=marks; 
}
 

}
