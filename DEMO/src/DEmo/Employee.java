package DEmo;

public class Employee 
{

	public Employee(int empID, String empName, String empComp) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpComp = empComp;
	}
	public int getEmpID() 
	{
		return EmpID;
	}
	public void setEmpID(int empID) 
	{
		EmpID = empID;
	}
	public String getEmpName() 
	{
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpComp() {
		return EmpComp;
	}
	public void setEmpComp(String empComp) {
		EmpComp = empComp;
	}
	int EmpID;

	
	public void gedDetails()
	{
		System.out.println("Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpComp=" + EmpComp + "]");
	}
	String EmpName,EmpComp;
	
	
	
	
	

}
