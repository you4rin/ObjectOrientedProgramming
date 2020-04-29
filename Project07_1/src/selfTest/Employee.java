package selfTest;

public class Employee {

	private String name;
	private int employeeNum;
	private String department = "No Dept";
	
	public Employee(String name, int employeeNum) {
		this.name = name;
		this.employeeNum = employeeNum;
	}
	
	public Employee(String name, int employeeNum, String department) {
		this.name = name;
		this.employeeNum = employeeNum;
		this.department = department;
	}
	
	public String getDepartment() {
		/* Write the code */
		return department;
	}
	
	public String getName() {
		/* Write the code */
		return name;
	}

	public void setDepartment(String department) {
		/* Write the code */
		this.department=department;
	}
	
	public void setName(String name) {
		/* Write the code */
		this.name=name;
	}
	
	public boolean equals(Employee anotherEmp) {
		/* Write the code */
		if(anotherEmp==null)return false;
		if(name.equals(anotherEmp.name)&&employeeNum==anotherEmp.employeeNum)return true;
		return false;
	}
	
	public String toString() {
		/* Write the code */
		return "Name : "+name+"\nEmp# : "+employeeNum;
	}
}
