
public class EnggStudent extends Student {
private String stream;
private String collegeName;
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public EnggStudent()
{}
 
public EnggStudent(int rollno, String name,String stream, String collegeName) {
	super(rollno, name);
	this.stream = stream;
	this.collegeName = collegeName; 
}
@Override
public String toString() {
	return "EnggStudent [stream=" + stream + ", collegeName=" + collegeName + "]";
}

@Override
	public boolean equals(Object obj) {
		EnggStudent student=(EnggStudent) obj;
		if(this.getRollno()==student.getRollno() && this.getName().equals(student.getName())  && this.getStream().equals(student.getStream()) && this.getCollegeName().equals(student.getCollegeName())  )
			return true;
		
		return false;
	}

}
