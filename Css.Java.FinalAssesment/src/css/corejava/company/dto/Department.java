package css.corejava.company.dto;

import java.util.ArrayList;

import css.corejava.company.dao.ICompanyServiceProvider;
import css.corejava.company.exceptions.InvalidIdException;
import css.corejava.company.exceptions.InvalidInputException;

public class Department implements ICompanyServiceProvider {
	public ArrayList<Employee> employees= new ArrayList<Employee>();



	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	

	@Override
	public String toString() {
		return "Department [employees=" + employees + "]";
	}

	@Override
	public Employee findEmployee(String empId) throws InvalidIdException {
		Employee test=null;
		for(Employee emp: employees) {
			if(emp.getEmployeeId().equals(empId)) {
				test=emp;
				break;
			}
		}
		if(test==null)
		{
			throw new InvalidIdException();
		}
		
		return test;
	}

	@Override
	public Employee recruitEmployee(String firstName, String lastName,String DOB, String phoneNo, String email, double salary) {
		
		Employee emp=new Employee(firstName,lastName,DOB,phoneNo,email,salary);
		employees.add(emp);
		return emp;
		
		
	}

	@Override
	public boolean releaseEmployee(String empId) throws InvalidIdException {
		boolean releaseEmployeeFlag=false;
		Employee emp=this.findEmployee(empId);
		if(emp!=null) {
			employees.remove(emp);
			releaseEmployeeFlag=true;
		}
		return releaseEmployeeFlag;
	}

	@Override
	public boolean updateEmployeePhoneNo(String EmpId,String PhoneNo) throws InvalidIdException, InvalidInputException {
		boolean updateFlag=false;
		Employee emp=this.findEmployee(EmpId);
		if(emp!=null) {
			if((PhoneNo.length())==10)
			{
				emp.setPhoneNo(PhoneNo);
				updateFlag=true;
			}
			else 
			{
				throw new InvalidInputException();
			}	
		}
		
		return updateFlag;
		}

	@Override
	public boolean updateEmployee(String empId, Employee updatedEmployee) throws InvalidIdException, InvalidInputException {
		boolean updateEmployeeFlag=false;
		Employee emp=this.findEmployee(empId);
		if(emp!=null) {
			if(((updatedEmployee.getPhoneNo()).length())==10){
		emp.setFirstName(updatedEmployee.getFirstName());
		emp.setLastName(updatedEmployee.getLastName());
		emp.setDOB(updatedEmployee.getDOB());
		emp.setAge(updatedEmployee.getAge());
		emp.setPhoneNo(updatedEmployee.getPhoneNo());
		emp.setEmail(updatedEmployee.getEmail());
		emp.setSalary(updatedEmployee.getSalary());
		updateEmployeeFlag=true;
		}
		else 
		{
			throw new InvalidInputException();
		}
		}
		
		return updateEmployeeFlag;
	}
	
	
	
}
