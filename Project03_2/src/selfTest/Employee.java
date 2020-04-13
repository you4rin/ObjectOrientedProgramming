package selfTest;

public class Employee {

	/* Write the code */
	private String name,position="Engineer";
	private int age,salary=15000,vacationDays=20;
	
	public Employee() {
		/* Do Nothing*/
	}
	
	public Employee(String name,int age) {
		/* Write the code */
		this.name=name;
		this.age=age;
	}
	
	public Employee(String name,int age,String position,int salary) {
		/* Write the code */
		this.name=name;
		this.age=age;
		this.position=position;
		setSalary(salary);
	}
	
	public Employee(String name,int age,String position,int salary,int vacationDays) {
		/* Write the code */
		this.name=name;
		this.age=age;
		this.position=position;
		setSalary(salary);
		this.vacationDays=vacationDays;
	}
	
	public void setSalary(int salary) {
		/* Write the code */
		this.salary=salary;
	}
	
	public void outInfo() {
		/* Write the code */
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("position: "+position);
		System.out.println("salary: "+salary);
		System.out.println("vacationDays: "+vacationDays);
		System.out.println();
	}
	
	public String vacation(int vacationDays) {
		/* Write the code */
		if(this.vacationDays<vacationDays)return "Impossible";
		this.vacationDays-=vacationDays;
		return "Possible";
	}
	
	public boolean equals(Employee other) {
		/* Write the code */
		if(name.equals(other.name)&&age==other.age&&position.equals(other.position))return true;
		return false;
	}
	
}
