
public class SalariedEmp extends Employee{
private long salary;
private double incentives;
private double ta; 
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public double getIncentives() {
	return incentives;
}
public void setIncentives(double incentives) {
	this.incentives = incentives;
}
public double getTa() {
	return ta;
}
public void setTa(double ta) {
	this.ta = ta;
}
public SalariedEmp()
{
}
public SalariedEmp(int empID, String empName, long salary, double incentives, double ta) {
	super(empID, empName);
	this.salary = salary;
	this.incentives = incentives;
	this.ta = ta;
}

public void display()
{
super.display();
System.out.println("Salary:"+salary+"\t"+"Incentives:"+incentives+"\t"+"TA:"+ta);
}

public long totalSal()
{
  
return (long)(salary+incentives+ta);

}
}
