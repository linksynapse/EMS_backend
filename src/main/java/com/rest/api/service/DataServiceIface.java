package com.rest.api.service;

import java.util.Map;

import com.rest.api.object.Account;
import com.rest.api.object.Company;
import com.rest.api.object.Employee;
import com.rest.api.object.Resource;

public interface DataServiceIface {
	Map<String, Object> GetCompany(String Name, String UEN, String TypeOfWork) throws Exception;
	Map<String, Object> GetEmployee(int PassNo) throws Exception;
	Map<String, Object> GetTypeOfWork() throws Exception;
	Map<String, Object> GetAdditionalCourse() throws Exception;
	Map<String, Object> GetCompanyRole() throws Exception;
	Map<String, Object> DeleteCompany(int Nonce) throws Exception;
	Map<String, Object> CreateCompany(Company company) throws Exception;
	Map<String, Object> ModifyCompany(Company company) throws Exception;
	Map<String, Object> GetEmployeeOmit(String Name, String NRIC, int[] CompanyList) throws Exception;
	Map<String, Object> GetCategory() throws Exception;
	Map<String, Object> CreateEmployee(Employee employee) throws Exception;
	Map<String, Object> AddImage(String NRIC, String Image) throws Exception;
	Map<String, Object> FileUpload(String NRIC, String ContentType, String FileName, byte[] Data) throws Exception;
	Map<String, Object> DeleteUser(int PassNo) throws Exception;
	Resource GetResource(int Idx) throws Exception;
	Map<String, Object> GetMyDocument(int PassNo) throws Exception;
	Map<String, Object> GetMyProfileImg(int PassNo) throws Exception;
	Map<String, Object> GetEpassInfo(int PassNo) throws Exception;
	Map<String, Object> DeleteUserPhoto(int PassNo) throws Exception;
	Map<String, Object> EditUser(Employee employee) throws Exception;
}
