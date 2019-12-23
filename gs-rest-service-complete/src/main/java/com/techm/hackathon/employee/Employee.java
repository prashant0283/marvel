package com.techm.hackathon.employee;

public class Employee {

	private String name;
	private String empId;
	private String emailId;
	private String project;
	private String manager;
	private String ibu;
	private String extension;
	private String phoneNumber;
	
	public Employee() {
		
	}

	public Employee(String name, String empId, String emailId, String project, String manager, String ibu,
			String extension, String phoneNumber) {
		super();
		this.name = name;
		this.empId = empId;
		this.emailId = emailId;
		this.project = project;
		this.manager = manager;
		this.ibu = ibu;
		this.extension = extension;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getIbu() {
		return ibu;
	}

	public void setIbu(String ibu) {
		this.ibu = ibu;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
