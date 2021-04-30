package com.rest.api.object;

public class Employee {
	int PassNo;
	int CompanyRole;
	String Name;
	String Mobile;
	String Occupation;
	String Email;
	String NRIC;
	int Category;
	int Company;
	String Nationality;
	String DateOfSIC;
	int CSOC;
	String CSOC_ExpireDate;
	String Remark;
	int AdditionalCourse;
	String AdditionalCourseFrom;
	String AdditionalCourseTo;
	public int getPassNo() {
		return PassNo;
	}
	public void setPassNo(int passNo) {
		PassNo = passNo;
	}
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
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNRIC() {
		return NRIC;
	}
	public void setNRIC(String nRIC) {
		NRIC = nRIC;
	}
	public int getCategory() {
		return Category;
	}
	public void setCategory(int category) {
		Category = category;
	}
	public int getCompany() {
		return Company;
	}
	public void setCompany(int company) {
		Company = company;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getDateOfSIC() {
		if(DateOfSIC == "") {
			return null;
		}
		return DateOfSIC;
	}
	public void setDateOfSIC(String dateOfSIC) {
		if(dateOfSIC == "") {
			DateOfSIC = null;
		}else {
			DateOfSIC = dateOfSIC;
		}
	}
	public int getCSOC() {
		return CSOC;
	}
	public void setCSOC(int cSOC) {
		CSOC = cSOC;
	}
	public String getCSOC_ExpireDate() {
		if(CSOC_ExpireDate == "") {
			return null;
		}
		return CSOC_ExpireDate;
	}
	public void setCSOC_ExpireDate(String cSOC_ExpireDate) {
		if(cSOC_ExpireDate == "") {
			CSOC_ExpireDate = null;
		}else {
			CSOC_ExpireDate = cSOC_ExpireDate;
		}
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public int getAdditionalCourse() {
		return AdditionalCourse;
	}
	public void setAdditionalCourse(int additionalCourse) {
		AdditionalCourse = additionalCourse;
	}
	public String getAdditionalCourseFrom() {
		if(AdditionalCourseFrom == "") {
			return null;
		}
		return AdditionalCourseFrom;
	}
	public void setAdditionalCourseFrom(String additionalCourseFrom) {
		if(additionalCourseFrom == "") {
			AdditionalCourseFrom = null;
		}else {
			AdditionalCourseFrom = additionalCourseFrom;
		}
	}
	public String getAdditionalCourseTo() {
		if(AdditionalCourseTo == "") {
			return null;
		}
		return AdditionalCourseTo;
	}
	public void setAdditionalCourseTo(String additionalCourseTo) {
		if(additionalCourseTo == "") {
			AdditionalCourseTo = null;
		}else {
			AdditionalCourseTo = additionalCourseTo;
		}
	}
}
