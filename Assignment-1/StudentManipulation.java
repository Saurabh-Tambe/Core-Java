 public class StudentManipulation {


		public Student[] createStudents() {

			Student students[] = new Student[5];
			students[0] = new Student(12,"Viru", 18,10, new int[] { 86, 85, 85, 88, 20, 90 });
			students[1] = new Student(23,"Sachin", 18,10, new int[] { 85, 78, 59, 45, 45, 90 });
			students[2] = new Student(33,"Ram", 18,10, new int[] { 59, 89, 59, 88, 45, 90 });
			students[3] = new Student(44,"Sam", 18,10, new int[] { 56, 78, 59, 48, 45, 45 });
			students[4] = new Student(66,"Sai", 18,10, new int[] { 20, 60, 85, 30, 89, 90 });

			
			return students;
		}
	
	public Student findMax(Student[] students){
			
		int max = 0;
		Student student=null;

		for(Student s1 : students){
			
			if(total(s1)> max){
				max = total(s1);
				student=s1;

			}
		}
	 

		return student;
		
	}
	
	 
	 
	
	public int total(Student student)
	{
		int result=0;
		int marks[]=student.getMarks();
		for(int i=0;i<marks.length;i++)
		{
			result+=marks[i];
		}
		return result;
	}
}