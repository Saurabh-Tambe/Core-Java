
public class TestStudents {
public static boolean search(Student[] students,Student student)
{
	for(Student s:students)
	{
		if(s.getClass()== student.getClass())
		{
			if(s.equals(student)) 
			return true;
		}
	}
	 return false;

}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student[] students=new Student[7];
		
		students[0]=new EnggStudent(12,"Sai","Computer","COEP");
		students[1]=new EnggStudent(13,"Sam","ENTC","COEP");
		students[2]=new EnggStudent(14,"Sachin","Civil","COEP");
		
		students[3]=new BscStudent(15,"Priya","Physics","SCK");
		students[4]=new BscStudent(16,"Sunil","Chemistry","SCK");
		
		students[5]=new CommerceStudent(17,"Prem","Accounting","SCCOA");
        students[6]=new CommerceStudent(18,"Vinay","Accounting","SCCOA");
        
        Student s1=new CommerceStudent(18,"Vinay","Accounting","SCCOA");
        if(search(students, s1))
        {
        	System.out.println("Student Found!!");
        }
        else
        {
        	System.out.println("Student Not Found!!");

        }
        
        Student s2=new EnggStudent(14,"Vinay","Civil","COEP");
        if(search(students, s2))
        {
        	System.out.println("Student Found!!");
        }
        else
        {
        	System.out.println("Student Not Found!!");

        }

	}

}
