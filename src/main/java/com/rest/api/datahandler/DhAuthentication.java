package com.rest.api.datahandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rest.api.object.Company;
import com.rest.api.object.File;
import com.rest.api.object.User;
import com.rest.api.object.WebAccount;

@Repository
public class DhAuthentication implements DhAuthenticationIface{
	@Inject
	private SqlSession sql;
	
	@Override
	public WebAccount DH_Login(String Name, String NRIC) {
		
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("Name",Name);
		data.put("NRIC",NRIC);
		
		return sql.selectOne("Login._00001", data);
	}
	
	@Override
	public List<Company> DH_GetCompanyList(String Name, String UEN, String TypeOfWork){
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("Name",Name);
		data.put("UEN",UEN);
		data.put("TypeOfWork",TypeOfWork);
		return sql.selectList("Login._00002", data);
	}
	
	@Override
	public int DH_DelCompany(String UEN) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("UEN",UEN);
		return sql.delete("Login._0003", data);
	}
	
	@Override
	public int DH_AddCompany(String Name,String UEN,String TypeOfWork) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("Name",Name);
		data.put("UEN",UEN);
		data.put("TypeOfWork",TypeOfWork);
		return sql.delete("Login._0005", data);
	}
	
	@Override
	public List<User> DH_GetUserList(List<String> CompanyList, String NRIC, String Name) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("CompanyList",CompanyList);
		data.put("NRIC",NRIC);
		data.put("Name",Name);
		return sql.selectList("Login._0006", data);
	}
	
	@Override
	public int DH_DelUser(String PassNo) {
		sql.delete("Login._0015",PassNo);
		return sql.delete("Login._0007", PassNo);
	}
	
	@Override
	public int DH_AddUser(User user) {
		
		return sql.insert("Login._0008",user);
	}
	
	@Override
	public int DH_EditUser(User user) {
		return sql.update("Login._0010", user);
	}
	
	@Override
	public User DH_GetUserInformation(String PassNo) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("PassNo",PassNo);
		return sql.selectOne("Login._0011", data);
	}
	
	@Override
	public int DH_AddImage(String NRIC, byte[] Image) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("NRIC",NRIC);
		data.put("Picture",Image);
		return sql.update("Login._0009",data);
	}
	
	@Override
	public int DH_FileUpload(String Category, String FileName, byte[] Data, String PassNo) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("Category",Category);
		data.put("FileName",FileName);
		data.put("Data", Data);
		data.put("User", PassNo);
		return sql.insert("Login._0012",data);
	}
	
	@Override
	public List<File> DH_FileList(String NRIC) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("NRIC",NRIC);
		
		return sql.selectList("Login._0013",data);
	}
	
	@Override
	public File DH_FileDown(String Idx) {
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("Idx",Idx);
		
		return sql.selectOne("Login._0014",data);
	}
}
