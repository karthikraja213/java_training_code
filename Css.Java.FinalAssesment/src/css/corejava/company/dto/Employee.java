package css.corejava.company.dto;

public class Employee extends Person {
	public String employeeId;
	public double salary;
	static int lastAssigned=1200;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, String DOB, String phoneNo, String email,double salary) {
		super(firstName, lastName, DOB, phoneNo, email);
		this.salary=salary;
		setEmployeeId();
		
	}

	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId() {
		this.employeeId = String.valueOf(lastAssigned++);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString() +", employeeId=" + employeeId + ", salary=" + salary + "]";
	}

}
