package com.rest.api.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.rest.api.datahandler.DataHandler;
import com.rest.api.object.Company;
import com.rest.api.object.Employee;
import com.rest.api.object.EmployeeOmit;
import com.rest.api.object.EmployeeShow;
import com.rest.api.object.EpassCard;
import com.rest.api.object.Resource;
import com.rest.api.object.keyDict;

@Repository
public class DataService implements DataServiceIface{

	@Inject
	DataHandler dHandler;
	
	@Override
	public Map<String, Object> GetCompany(String Name, String UEN, String TypeOfWork) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		List<Company> vo = dHandler.GetCompany(Name, UEN, TypeOfWork);
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetEmployee(int PassNo) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		List<Employee> vo = dHandler.GetEmployee(PassNo);
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetEmployeeOmit(String Name, String NRIC, int[] CompanyList) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		List<EmployeeOmit> vo = dHandler.GetEmployeeOmit(Name, NRIC, CompanyList);
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}

	@Override
	public Map<String, Object> GetTypeOfWork() throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		List<keyDict> vo = dHandler.GetTypeOfWork();
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetAdditionalCourse() throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		List<keyDict> vo = dHandler.GetAdditionalCourse();
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetCompanyRole() throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		List<keyDict> vo = dHandler.GetCompanyRole();
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetCategory() throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		List<keyDict> vo = dHandler.GetCategory();
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> DeleteCompany(int Nonce) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		int vo = dHandler.DeleteCompany(Nonce);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> CreateCompany(Company company) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		int vo = dHandler.CreateCompany(company);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> ModifyCompany(Company company) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		int vo = dHandler.ModifyCompany(company);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
		

	public static String formatDate(String inDate) {
		SimpleDateFormat inSDF = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat outSDF = new SimpleDateFormat("yyyy-mm-dd");
		
	    String outDate = "";
	    
	    if (inDate != null) {
	        try {
	            Date date = inSDF.parse(inDate);
	            outDate = outSDF.format(date);
	        } catch (ParseException ex){
	        	return inDate;
	        }
	    }
	    return outDate;
	}
	
	public static String ReverseformatDate(String inDate) {
		SimpleDateFormat outSDF = new SimpleDateFormat("dd/mm/yyyy");
		SimpleDateFormat inSDF = new SimpleDateFormat("yyyy-mm-dd");
		
	    String outDate = "";
	    
	    if (inDate != null) {
	        try {
	            Date date = inSDF.parse(inDate);
	            outDate = outSDF.format(date);
	        } catch (ParseException ex){
	        	return inDate;
	        }
	    }
	    return outDate;
	}
	
	@Override
	public Map<String, Object> CreateEmployee(Employee employee) throws Exception{
		employee.setDateOfSIC(formatDate(employee.getDateOfSIC()));
		employee.setCSOC_ExpireDate(formatDate(employee.getCSOC_ExpireDate()));
		employee.setAdditionalCourseFrom(formatDate(employee.getAdditionalCourseFrom()));
		employee.setAdditionalCourseTo(formatDate(employee.getAdditionalCourseTo()));
		
		Map<String, Object> r = new HashMap<String, Object>();
		int vo = dHandler.CreateEmployee(employee);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> AddImage(String NRIC, String Image) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		
		byte[] DeCode = Base64.getDecoder().decode(Image);
		int vo = dHandler.AddFile(NRIC,"NRIC.jpg","image/jpeg",DeCode,1);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> FileUpload(String NRIC, String ContentType, String FileName, byte[] Data) throws Exception {
		Map<String, Object> r = new HashMap<String, Object>();
		
		int vo = dHandler.AddFile(NRIC,FileName,ContentType,Data,0);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> DeleteUser(int PassNo) throws Exception {
		Map<String, Object> r = new HashMap<String, Object>();
		
		int vo = dHandler.DeleteFile(PassNo);
		vo = dHandler.DeleteUser(PassNo);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}

	@Override
	public Resource GetResource(int Idx) throws Exception{
		return dHandler.GetResource(Idx);
	}
	
	@Override
	public Map<String, Object> GetMyProfileImg(int PassNo) throws Exception {
		Map<String, Object> r = new HashMap<String, Object>();
		
		List<keyDict> vo = dHandler.GetMyProfileImg(PassNo);
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetMyDocument(int PassNo) throws Exception {
		Map<String, Object> r = new HashMap<String, Object>();
		
		List<keyDict> vo = dHandler.GetMyDocument(PassNo);
		
		if(vo != null) {
			r.put("return", 0);
			r.put("data", vo);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> GetEpassInfo(int PassNo) throws Exception {
		Map<String, Object> r = new HashMap<String, Object>();
		
		EpassCard vo = dHandler.GetEpassInfo(PassNo);
		vo.setDateOfSIC(ReverseformatDate(vo.getDateOfSIC()));
		
		if(vo != null) {
			ArrayList<EpassCard> dataArray = new ArrayList<EpassCard>();
			dataArray.add(vo);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public Map<String, Object> DeleteUserPhoto(int PassNo) throws Exception {
		Map<String, Object> r = new HashMap<String, Object>();
		
		int vo = dHandler.DeleteUserPhoto(PassNo);
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("rows", vo);
			
		ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
		dataArray.add(data);
			
		r.put("return", 0);
		r.put("data", dataArray);
		
		return r;
	}
	
	@Override
	public Map<String, Object> DeleteUserDocument(int PassNo) throws Exception {
		Map<String, Object> r = new HashMap<String, Object>();
		
		int vo = dHandler.DeleteDocument(PassNo);
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("rows", vo);
			
		ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
		dataArray.add(data);
			
		r.put("return", 0);
		r.put("data", dataArray);
		
		return r;
	}
	
	@Override
	public Map<String, Object> EditUser(Employee employee) throws Exception {
		employee.setDateOfSIC(formatDate(employee.getDateOfSIC()));
		employee.setCSOC_ExpireDate(formatDate(employee.getCSOC_ExpireDate()));
		employee.setAdditionalCourseFrom(formatDate(employee.getAdditionalCourseFrom()));
		employee.setAdditionalCourseTo(formatDate(employee.getAdditionalCourseTo()));
		
		Map<String, Object> r = new HashMap<String, Object>();
		
		int vo = dHandler.EditUser(employee);
		
		if(vo != 0) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("rows", vo);
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", 0);
			r.put("data", dataArray);
		} else {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("msg", "no record");
			
			ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
			dataArray.add(data);
			
			r.put("return", -1);
			r.put("data", dataArray);
		}
		
		return r;
	}
	
	@Override
	public EmployeeShow GetUserInfo(int n) throws Exception{
		return dHandler.GetUserInfo(n);
	}
}
