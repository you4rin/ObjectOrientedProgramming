package selfTest;

public class Engineer extends Employee{
	private String workZone;
	private String project;
	
	public Engineer(String name,int employeeNum,String workZone,String project) {
		/* Write the code */
		super(name,employeeNum);
		this.workZone=workZone;
		this.project=project;
	}
	
	public boolean equals(Object obj) {
		/* Write the code */
		if(!super.equals(obj))return false;
		Engineer newEng=(Engineer)obj;
		return workZone.equals(newEng.workZone);
	}
	
	public String toString() {
		/* Write the code */
		return "Name : "+getName()+"\nEmp# : "+getEmployeeNum()+"\nlocation : "+getDepartment()+", "+workZone;
	}
}
