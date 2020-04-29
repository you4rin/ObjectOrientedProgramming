package selfTest;

public class Manager extends Employee{

	private int officeNum;
	private String team;
	
	public Manager(String name,int employeeNum,int officeNum,String team) {
		/* Write the code */
		super(name,employeeNum);
		this.officeNum=officeNum;
		this.team=team;
	}
	
	public String toString() {
		return ("Name : " + getName() + "\nLocation : " + getDepartment() + ", " + officeNum);
	}
	
	public boolean equals(Object obj) {
		/* Write the code */
		if(!super.equals(obj))return false;
		Manager newMan=(Manager)obj;
		return officeNum==newMan.officeNum&&team.equals(newMan.team);
	}
}
