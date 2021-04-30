package com.rest.api.object;

public class EpassCard {
	String Name;
	String NRIC;
	String Occupation;
	String Company;
	String DateOfSIC;
	int Category;
	int PassNo;
	int Profile;
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
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getDateOfSIC() {
		return DateOfSIC;
	}
	public void setDateOfSIC(String dateOfSIC) {
		DateOfSIC = dateOfSIC;
	}
	public int getCategory() {
		return Category;
	}
	public void setCategory(int category) {
		Category = category;
	}
	public int getPassNo() {
		return PassNo;
	}
	public void setPassNo(int passNo) {
		PassNo = passNo;
	}
	public int getProfile() {
		return Profile;
	}
	public void setProfile(int profile) {
		Profile = profile;
	}
}
