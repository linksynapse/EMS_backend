package com.rest.api.object;

public class WebAccount{
	String Name;
	String NRIC;
	int CompanyRole;
	public int getCompanyRole() {
		return CompanyRole;
	}
	public void setCompanyRole(int companyRole) {
		CompanyRole = companyRole;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNRIC() {
		return NRIC;
	}
	public void setNRIC(String nRIC) {
		NRIC = nRIC;
	}
}