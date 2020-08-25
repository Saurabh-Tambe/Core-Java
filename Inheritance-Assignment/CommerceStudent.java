
public class CommerceStudent extends Student {
private String major_sub;
private String collegeName;
public String getMajor_sub() {
	return major_sub;
}
public void setMajor_sub(String major_sub) {
	this.major_sub = major_sub;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public CommerceStudent()
{}
 

public CommerceStudent(int rollno, String name,String major_sub, String collegeName) {
	super(rollno, name);
	this.major_sub = major_sub;
	this.collegeName = collegeName;

 }
@Override
public String toString() {
	return "CommerceStudent [major_sub=" + major_sub + ", collegeName=" + collegeName + "]";
}

@Override
public boolean equals(Object obj) {
	CommerceStudent student=(CommerceStudent) obj;
	if(this.getRollno()==student.getRollno() && 
			this.getName().equals(student.getName()) && 
			this.getMajor_sub().equals(student.getMajor_sub()) && 
			this.getCollegeName().equals(student.getCollegeName())  )
		return true;
	
	return false;
}

}
