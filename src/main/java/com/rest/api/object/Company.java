package com.rest.api.object;

public class Company {
	String CompanyName;
	String UEN;
	String TypeOfWork;
	int EmployeeOnProject;
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getUEN() {
		return UEN;
	}
	public void setUEN(String uEN) {
		UEN = uEN;
	}
	public String getTypeOfWork() {
		return TypeOfWork;
	}
	public void setTypeOfWork(String typeOfWork) {
		TypeOfWork = typeOfWork;
	}
	public int getEmployeeOnProject() {
		return EmployeeOnProject;
	}
	public void setEmployeeOnProject(int employeeOnProject) {
		EmployeeOnProject = employeeOnProject;
	}
}
