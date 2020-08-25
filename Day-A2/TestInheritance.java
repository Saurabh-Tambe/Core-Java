
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	WageEmp w=new WageEmp();
		//w.display();
		
	//	WageEmp w1=new WageEmp(2,"ABC",400,4);
	//	w1.display();
		
		SalariedEmp s1=new SalariedEmp(2,"SACHIN",20000,15,500);
		s1.display();
		//s1.totalSal();
		System.out.println("Total Salary:"+ s1.totalSal());

		
	}

}
