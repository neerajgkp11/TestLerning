package test;

public class Employee {

	int empId;
	String name;
	String org;
	public Employee(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		empId=i;
		name=string;
		org=string2;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmployeeObject";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}
