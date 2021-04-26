package com.rest.api.service;

import java.util.Map;

import com.rest.api.object.File;
import com.rest.api.object.User;
import com.rest.api.object.WebAccount;

public interface SrvAuthenticationIface {
	public WebAccount Login(String Name, String NRIC);
	public Map<String, Object> GetCompanyList(String Name,String UEN,String TypeOfWork);
	public Map<String, Object> DelCompany(String UEN);
	public Map<String, Object> AddCompany(String Name,String UEN,String TypeOfWork);
	public Map<String, Object> GetUserList(String Companys, String NRIC, String Name);
	public Map<String, Object> DelUser(String PassNo);
	public Map<String, Object> AddUser(User user);
	public Map<String, Object> AddImage(String PassNo, String Image);
	public Map<String, Object> EditUser(User user);
	public User getUserInformation(String PassNo);
	public Map<String, Object> FileUpload(String Category, String FileName, byte[] Data, String PassNo);
	public Map<String, Object> FileList(String NRIC);
	public File FileDown(String Idx);
}
