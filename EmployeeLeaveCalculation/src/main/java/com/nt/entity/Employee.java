package com.nt.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "EMPLOYEE_LEAVE_CALC")
@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	@NonNull
	@Column(length = 20)
	private String name;
	@NonNull
	@Column(length = 20)
	private Double pl;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pl=" + pl + "]";
	}
	

}
