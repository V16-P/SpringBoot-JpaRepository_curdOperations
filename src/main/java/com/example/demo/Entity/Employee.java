package com.example.demo.Entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="Emp_Id")
	  private Integer Emp_Id;
	@Column(name="Emp_First_Name")
	  private String Emp_First_Name;
	@Column(name="Emp_Last_Name")
	  private String Emp_Last_Name;
	@Column(name="Emp_Email")
	  private String Emp_Email;
	@Column(name="Emp_Mobile_No")
	  private BigInteger Emp_Mobile_No;
	@Column(name="Emp_salary")
	  private Integer Emp_salary;
	  
	  
	   
	



	public Employee() {
		super();
	}



	public Employee(Integer emp_Id, String emp_First_Name, String emp_Last_Name, String emp_Email,
			BigInteger emp_Mobile_No, Integer emp_salary) {
		super();
		Emp_Id = emp_Id;
		Emp_First_Name = emp_First_Name;
		Emp_Last_Name = emp_Last_Name;
		Emp_Email = emp_Email;
		Emp_Mobile_No = emp_Mobile_No;
		Emp_salary = emp_salary;
	}



	public Integer getEmp_Id() {
		return Emp_Id;
	}



	public void setEmp_Id(Integer emp_Id) {
		Emp_Id = emp_Id;
	}



	public String getEmp_First_Name() {
		return Emp_First_Name;
	}



	public void setEmp_First_Name(String emp_First_Name) {
		Emp_First_Name = emp_First_Name;
	}



	public String getEmp_Last_Name() {
		return Emp_Last_Name;
	}



	public void setEmp_Last_Name(String emp_Last_Name) {
		Emp_Last_Name = emp_Last_Name;
	}



	public String getEmp_Email() {
		return Emp_Email;
	}



	public void setEmp_Email(String emp_Email) {
		Emp_Email = emp_Email;
	}



	public BigInteger getEmp_Mobile_No() {
		return Emp_Mobile_No;
	}



	public void setEmp_Mobile_No(BigInteger emp_Mobile_No) {
		Emp_Mobile_No = emp_Mobile_No;
	}



	public Integer getEmp_salary() {
		return Emp_salary;
	}



	public void setEmp_salary(Integer emp_salary) {
		Emp_salary = emp_salary;
	}



	@Override
	public String toString() {
		return "Employee [Emp_Id=" + Emp_Id + ", Emp_First_Name=" + Emp_First_Name + ", Emp_Last_Name=" + Emp_Last_Name
				+ ", Emp_Email=" + Emp_Email + ", Emp_Mobile_No=" + Emp_Mobile_No + ", Emp_salary=" + Emp_salary + "]";
	}



	
	  
	  
	  
	  
	  
}
