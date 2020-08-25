
public class WageEmp extends Employee{

	 private int wages;
	 private int no_hr;
	 
	public int getWages() {
		return wages;
	}
	public void setWages(int wages) {
		this.wages = wages;
	}
	public int getNo_hr() {
		return no_hr;
	}
	public void setNo_hr(int no_hr) {
		this.no_hr = no_hr;
	}
	public WageEmp(int empID, String empName, int wages, int no_hr) {
		super(empID,empName);
		this.wages = wages;
		this.no_hr = no_hr;
	}
	public WageEmp()
	{
		super();
		System.out.println("Wage Emp");
		this.wages = 200;
		this.no_hr = 2;
	}
	
	public void display(){
		
		System.out.println("");
		super.display();
		System.out.println("Wages:"+wages+"\t"+"No.of Hours:"+no_hr);
		
	}
}
