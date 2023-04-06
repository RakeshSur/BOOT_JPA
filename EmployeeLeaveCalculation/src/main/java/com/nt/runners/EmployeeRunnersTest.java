package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Component
public class EmployeeRunnersTest implements CommandLineRunner {
	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			/*
			 // To save Employee
			 Employee emp1=new Employee("Rakesh", 65.0); Employee emp2=new
			 Employee("Suresh", 65.0);
			 System.out.println(service.saveEmployee(List.of(emp1,emp2)));
			 //code for leave apply by employee
			int count=service.remaingLeaveAfterLeaveApply("Rakesh", 5.0);
			System.out.println("Leave calculated After Employee Apply for Leave for Employee  :: "+count);
			*/
			//remaining leave
			System.out.println("Employee remaing Leave for id 1 is:: "+service.empRemaingLeave(1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
