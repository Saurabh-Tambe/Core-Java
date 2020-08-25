
public class BscStudent extends Student {
private String specialization;
private String collegeName;
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public BscStudent()
{}

 
public BscStudent(int rollno, String name,String specialization, String collegeName) {
	super(rollno, name);
	this.specialization = specialization;
	this.collegeName = collegeName;
}
@Override
public String toString() {
	return "BscStudent [specialization=" + specialization + ", collegeName=" + collegeName + "]";
}

@Override
public boolean equals(Object obj) {
	BscStudent student=(BscStudent) obj;
	if(this.getRollno()==student.getRollno() && this.getName().equals(student.getName()) && this.getSpecialization().equals(student.getSpecialization()) && this.getCollegeName().equals(student.getCollegeName())  )
		return true;
	
	return false;
}
}
