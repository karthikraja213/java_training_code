package css.corejava.company.dto;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
	private String lastName;
	LocalDate DOB;
	private int age;
	private String phoneNo;
	private String email;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Person(String firstName, String lastName,String DOB , String phoneNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.DOB=LocalDate.parse(DOB);
		Age();
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	



	public LocalDate getDOB() {
		return DOB;
	}



	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}



	public int getAge() {
		return age;
	}
	 
	public void setAge(int age) {
		this.age=age;
	}


	
	public void Age() {
		Period diff=Period.between(DOB,LocalDate.now());
		this.age = diff.getYears();
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName +", DOB=" + DOB + ", age=" + age + ", phoneNo=" + phoneNo
				+ ", email=" + email + "";
	}
	
	
	
}

