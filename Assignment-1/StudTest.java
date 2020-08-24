 
 
public class StudTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManipulation stud = new StudentManipulation(); 
		
		Student[] students = stud.createStudents();
		
		for(Student s : students){
			s.display();
		}
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Total marks of student "+(i+1)+" is "+stud.total(students[i]));
		}
		
		
		Student s=stud.findMax(students);
		System.out.println("Student with maximum Marks:");
 		s.display();
	}

}

 

	  
		 