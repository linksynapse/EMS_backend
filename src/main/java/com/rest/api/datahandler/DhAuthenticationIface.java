package com.rest.api.datahandler;

import java.util.List;

import com.rest.api.object.Company;
import com.rest.api.object.File;
import com.rest.api.object.User;
import com.rest.api.object.WebAccount;

public interface DhAuthenticationIface {
	public WebAccount DH_Login(String Name, String NRIC);
	public List<Company> DH_GetCompanyList(String Name, String UEN, String TypeOfWork);
	public int DH_DelCompany(String UEN);
	public int DH_AddCompany(String Name,String UEN,String TypeOfWork);
	public List<User> DH_GetUserList(List<String> CompanyList, String NRIC, String Name);
	public int DH_DelUser(String PassNo);
	public int DH_AddUser(User user);
	public int DH_AddImage(String PassNo, byte[] Image);
	public int DH_EditUser(User user);
	public User DH_GetUserInformation(String PassNo);
	public int DH_FileUpload(String Category, String FileName, byte[] Data, String PassNo);
	public List<File> DH_FileList(String NRIC);
	public File DH_FileDown(String Idx);
}
