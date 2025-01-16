package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.Controller.Employee_Controller;
//import com.example.demo.Entity.Employee;

@SpringBootApplication
public class DemoApplication {
//public class DemoApplication implements CommandLineRunner {
//	@Autowired
//	 private Employee_Controller employee_Controller;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Employee emp = new Employee();
//		emp.setEmp_Email("dgdhj");
//		emp.setEmp_First_Name("vhggh");
//		//emp.setEmp_Id(2);
//		emp.setEmp_Last_Name("vjkvfkjfd");
//		emp.setEmp_Mobile_No(null);
//		emp.setEmp_salary(6476);
//		System.out.println(emp);
//		employee_Controller.saveEmps(emp);
//		
//	}
	
	

}
