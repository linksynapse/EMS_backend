package com.rest.api.object;

import java.util.Base64;

public class User {
	String PassNo;
	String Name;
	String MobileNumber;
	String Occupation;
	String Email;
	String NRIC;
	String Category;
	String Company;
	String DateOfSIC;
	String Nationality;
	String CompanyRole;
	String CSOC;
	String ExpireDate;
	String Remark;
	String AdditionalCourse;
	String DateOfCourseFrom;
	String DateOfCourseTo;
	byte[] Picture;
	public String getPicture() {
		if(Picture == null) {
			return "";
		}
		return Base64.getEncoder().encodeToString(Picture);
	}
	public void setPicture(byte[] picture) {
		Picture = picture;
	}
	public String getPassNo() {
		return PassNo;
	}
	public void setPassNo(String passNo) {
		PassNo = passNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
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
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getDateOfSIC() {
		if(DateOfSIC == "") {
			return null;
		}else {
			return DateOfSIC;
		}
	}
	public void setDateOfSIC(String dateOfSIC) {
		if(dateOfSIC == "") {
			DateOfSIC = null;
		}else {
			DateOfSIC = dateOfSIC;
		}
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getCompanyRole() {
		return CompanyRole;
	}
	public void setCompanyRole(String companyRole) {
		CompanyRole = companyRole;
	}
	public String getCSOC() {
		return CSOC;
	}
	public void setCSOC(String cSOC) {
		CSOC = cSOC;
	}
	public String getExpireDate() {
		if(ExpireDate == "") {
			return null;
		}else {
			return ExpireDate;
		}
	}
	public void setExpireDate(String expireDate) {
		if(expireDate == "") {
			ExpireDate = null;
		}else {
			ExpireDate = expireDate;
		}
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getAdditionalCourse() {
		return AdditionalCourse;
	}
	public void setAdditionalCourse(String additionalCourse) {
		AdditionalCourse = additionalCourse;
	}
	public String getDateOfCourseFrom() {
		if(DateOfCourseFrom == "") {
			return null;
		}else {
			return DateOfCourseFrom;
		}
	}
	public void setDateOfCourseFrom(String dateOfCourseFrom) {
		if(dateOfCourseFrom == "") {
			DateOfCourseFrom = null;
		}else {
			DateOfCourseFrom = dateOfCourseFrom;
		}
	}
	public String getDateOfCourseTo() {
		if(DateOfCourseTo == "") {
			return null;
		}else {
			return DateOfCourseTo;
		}
	}
	public void setDateOfCourseTo(String dateOfCourseTo) {
		if(dateOfCourseTo == "") {
			DateOfCourseTo = null;
		}else {
			DateOfCourseTo = dateOfCourseTo;
		}
	}
}
