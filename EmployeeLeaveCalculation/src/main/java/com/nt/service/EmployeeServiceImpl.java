package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service("eService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeRepository empRepo;



	@Override
	public String saveEmployee(List<Employee> list) {
		List<Employee>emp=empRepo.saveAll(list);
		int size=emp.size();
		
		
		return size+" no of employee saved";
	}
	@Override
	public int remaingLeaveAfterLeaveApply(String name, double noOfDays) {
		int count=empRepo.employeeLeaveAfterApply(name, noOfDays);
		return count;
	}
	@Override
	public int empRemaingLeave(int eno) {
		// TODO Auto-generated method stub
		return empRepo.employeeRemaingLeave(eno);
	}

}
