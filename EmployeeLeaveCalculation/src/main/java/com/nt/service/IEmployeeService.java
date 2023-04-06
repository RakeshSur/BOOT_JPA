package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeService {
	public String saveEmployee(List<Employee> list);
	public int remaingLeaveAfterLeaveApply(String name,double noOfDays);
	public int empRemaingLeave(int eno);

}
