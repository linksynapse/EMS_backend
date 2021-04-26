package com.rest.api.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.rest.api.datahandler.DhAuthentication;
import com.rest.api.object.File;
import com.rest.api.object.User;
import com.rest.api.object.WebAccount;

@Repository
public class SrvAuthentication implements SrvAuthenticationIface{
	
	@Inject
	DhAuthentication obj;
	
	
	@Override
	public WebAccount Login(String Name, String NRIC){
		WebAccount r = obj.DH_Login(Name, NRIC);
		return r;
	}
	
	@Override
	public Map<String, Object> GetCompanyList(String Name,String UEN,String TypeOfWork){
		Map<String, Object> r = new HashMap<String, Object>();
		r.put("Code", 0);
		r.put("Data", obj.DH_GetCompanyList(Name, UEN, TypeOfWork));
		return r;
	}
	
	@Override
	public Map<String, Object> DelCompany(String UEN){
		Map<String, Object> r = new HashMap<String, Object>();
		try {
			r.put("Code", obj.DH_DelCompany(UEN));
			return r;
		}catch(Exception e){
			r.put("Code", 0);
			return r;
		}finally {
			
		}
		
	}
	
	@Override
	public Map<String, Object> AddCompany(String Name,String UEN,String TypeOfWork){
		Map<String, Object> r = new HashMap<String, Object>();
		try {
			r.put("Code", obj.DH_AddCompany(Name, UEN, TypeOfWork));
			return r;
		}catch(Exception e){
			r.put("Code", 0);
			return r;
		}finally {
			
		}
		
	}
	
	@Override
	public User getUserInformation(String PassNo) {
		return obj.DH_GetUserInformation(PassNo);
	}
	
	@Override
	public Map<String, Object> GetUserList(String Companys, String NRIC, String Name) {
		
		String[] SplitCompany = Companys.split(":");
		List<String> CompanyList = new ArrayList<String>();
		
		for(String x: SplitCompany) {
			CompanyList.add(x);
		}
		
		Map<String, Object> r = new HashMap<String, Object>();
		r.put("Code", 0);
		r.put("Data",obj.DH_GetUserList(CompanyList, NRIC, Name));
		return r;
	}
	
	@Override
	public Map<String, Object> DelUser(String PassNo){
		Map<String, Object> r = new HashMap<String, Object>();
		try {
			r.put("Code", obj.DH_DelUser(PassNo));
			return r;
		}catch(Exception e){
			r.put("Code", 0);
			return r;
		}
	}
	
	@Override
	public Map<String, Object> AddUser(User user){
		
		if(user.getExpireDate() == "") {
			user.setExpireDate(null);
		}
		
		if(user.getDateOfCourseFrom() == "") {
			user.setDateOfCourseFrom(null);
		}
		
		if(user.getDateOfCourseTo() == "") {
			user.setDateOfCourseTo(null);
		}
		
		Map<String, Object> r = new HashMap<String, Object>();
		try {
			r.put("Code", obj.DH_AddUser(user));
			return r;
		}catch(Exception e){
			r.put("Code", 0);
			return r;
		}
	}
	
	@Override
	public Map<String, Object> EditUser(User user){
		Map<String, Object> r = new HashMap<String, Object>();
		try {
			r.put("Code", obj.DH_EditUser(user));
			return r;
		}catch(Exception e){
			r.put("Code", 0);
			return r;
		}
	}
	
	@Override
	public Map<String, Object> AddImage(String NRIC, String Image) {
		Map<String, Object> r = new HashMap<String, Object>();
		
		byte[] DeCode = Base64.getDecoder().decode(Image);
		
		try {
			r.put("Code", obj.DH_AddImage(NRIC, DeCode));
			return r;
		}catch(Exception e){
			r.put("Code", 0);
			return r;
		}
	}
	
	@Override
	public Map<String, Object> FileUpload(String Category, String FileName, byte[] Data, String PassNo) {
		Map<String, Object> r = new HashMap<String, Object>();
		
		try {
			r.put("Code", obj.DH_FileUpload(Category, FileName, Data, PassNo));
			return r;
		}catch(Exception e){
			r.put("Code", 0);
			return r;
		}
	}
	
	@Override
	public Map<String, Object> FileList(String NRIC){
		Map<String, Object> r = new HashMap<String, Object>();
		
		try {
			r.put("Code", 0);
			r.put("Data", obj.DH_FileList(NRIC));
			return r;
		}catch(Exception e){
			r.put("Code", -1);
			return r;
		}
	}
	
	@Override
	public File FileDown(String Idx){
		return obj.DH_FileDown(Idx);
	}
}
