package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("UPDATE Employee SET pl=pl-:noOfDays where name=:ename")
	@Modifying
	@Transactional
	public int employeeLeaveAfterApply(String ename,double noOfDays);
	
	
	  @Query("SELECT pl FROM Employee WHERE id=?1")
	  public int employeeRemaingLeave(int eno);
	 

}
