package css.corejava.company.main;

import css.corejava.company.dto.Department;
import css.corejava.company.dto.Employee;
import css.corejava.company.exceptions.InvalidIdException;
import css.corejava.company.exceptions.InvalidInputException;

public class Main {

	public static void main(String[] args) throws InvalidIdException, InvalidInputException {
		
		Department dept=new Department();

		Employee emp1=new Employee("karthik","raja","1998-10-01","9182233444","karthik@gmail.com",21000.0);
		Employee emp2=new Employee("sam","immanuel","1999-01-17","9582233434","sam@gmail.com",27000.0);
		Employee emp3=new Employee("pam","halpert","1996-02-28","9282233465","pam@gmail.com",21000.0);
		Employee emp4=new Employee("ashish","nehra","1997-05-01","9582233478","ash@gmail.com",20000.0);
		Employee emp5=new Employee("arun","ram","1998-08-12","7782233452","arun@gmail.com",26000.0);
		Employee emp6=new Employee("skylar","evans","1998-02-21","9962233498","skylar@gmail.com",27000.0);
		dept.employees.add(emp1);
		dept.employees.add(emp2);
		dept.employees.add(emp3);
		dept.employees.add(emp4);
		dept.employees.add(emp5);
		dept.employees.add(emp6);
		for(Employee i: dept.employees)
		{
			System.out.println(i);
		}

		System.out.println("==================================================================================");
		
		//recruit employee
		System.out.println(dept.recruitEmployee("santhosh","kumar","1999-05-14","9102233444","santy@gmail.com",22500.0));
		
		System.out.println("==================================================================================");
		
		//find employees
		System.out.println(dept.findEmployee("1204"));
		
		System.out.println("==================================================================================");
		
		//release employees
		System.out.println(dept.releaseEmployee("1203"));
		
		System.out.println("==================================================================================");
		
		//update Employee Phone no
		System.out.println(dept.updateEmployeePhoneNo("1200","9284622761"));
		
		System.out.println("==================================================================================");
		
		//update Employee details
		Employee updatedEmployee=new Employee("sanjay","ramaswamy","1993-12-02","9182233234","sanjayrsw@gmail.com",25000.0);
		System.out.println(dept.updateEmployee("1201", updatedEmployee));
		
		
		System.out.println("==================================================================================");
		
		//display employees
		for(Employee i: dept.employees) 
		{
			System.out.println(i);
		}
		
		
		}
	}


