package com.rest.api.datahandler;

import java.util.List;

import com.rest.api.object.Company;
import com.rest.api.object.Employee;
import com.rest.api.object.EmployeeOmit;
import com.rest.api.object.EmployeeShow;
import com.rest.api.object.EpassCard;
import com.rest.api.object.Resource;
import com.rest.api.object.keyDict;

public interface DataHandlerIface {
	List<Company> GetCompany(String Name, String UEN, String TypeOfWork) throws Exception;
	List<Employee> GetEmployee(int PassNo) throws Exception;
	List<keyDict> GetTypeOfWork() throws Exception;
	List<keyDict> GetAdditionalCourse() throws Exception;
	List<keyDict> GetCompanyRole() throws Exception;
	int DeleteCompany(int Nonce) throws Exception;
	int CreateCompany(Company company) throws Exception;
	int ModifyCompany(Company company) throws Exception;
	List<EmployeeOmit> GetEmployeeOmit(String Name, String NRIC, int[] CompanyList) throws Exception;
	List<keyDict> GetCategory() throws Exception;
	int CreateEmployee(Employee employee) throws Exception;
	int AddFile(String NRIC, String FileName, String ContentType, byte[] Image, int Category);
	int DeleteFile(int PassNo) throws Exception;
	int DeleteUser(int PassNo) throws Exception;
	Resource GetResource(int Idx) throws Exception;
	List<keyDict> GetMyProfileImg(int PassNo) throws Exception;
	List<keyDict> GetMyDocument(int PassNo) throws Exception;
	EpassCard GetEpassInfo(int PassNo) throws Exception;
	int DeleteUserPhoto(int PassNo) throws Exception;
	int EditUser(Employee employee) throws Exception;
	EmployeeShow GetUserInfo(int PassNo) throws Exception;
	int DeleteDocument(int PassNo) throws Exception;
	int DeleteUserPhotoByNRIC(String NRIC) throws Exception;
}
