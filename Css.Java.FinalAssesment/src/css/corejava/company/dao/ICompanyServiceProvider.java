package css.corejava.company.dao;


import css.corejava.company.dto.Employee;
import css.corejava.company.exceptions.InvalidIdException;
import css.corejava.company.exceptions.InvalidInputException;

public interface ICompanyServiceProvider {
	public Employee findEmployee(String empId) throws InvalidIdException;
	public Employee recruitEmployee(String firstName, String lastName, String DOB, String phoneNo, String email,double salary);
	public boolean releaseEmployee(String empId) throws InvalidIdException;
	public boolean updateEmployeePhoneNo(String empId,String PhoneNo) throws InvalidIdException,InvalidInputException;
	public boolean updateEmployee(String empId ,Employee emp) throws InvalidIdException,InvalidInputException;

}
