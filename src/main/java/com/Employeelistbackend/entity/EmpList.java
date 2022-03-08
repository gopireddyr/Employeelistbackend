package com.Employeelistbackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class EmpList {
	@Id
	private int id;
	private String EmpFirstName;
	private String EmpLastName;
	private String EmpEmailID;
	
	
	
	public EmpList() {
		super();
	}
	

	
	public EmpList(int id, String empFirstName, String empLastName, String empEmailID) {
		super();
		this.id = id;
		EmpFirstName = empFirstName;
		EmpLastName = empLastName;
		EmpEmailID = empEmailID;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpFirstName() {
		return EmpFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		EmpFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return EmpLastName;
	}
	public void setEmpLastName(String empLastName) {
		EmpLastName = empLastName;
	}
	public String getEmpEmailID() {
		return EmpEmailID;
	}
	public void setEmpEmailID(String empEmailID) {
		EmpEmailID = empEmailID;
	}
	
	
}
