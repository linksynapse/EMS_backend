package com.rest.api.datahandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.rest.api.object.Account;
import com.rest.api.object.Company;
import com.rest.api.object.Employee;
import com.rest.api.object.EmployeeOmit;
import com.rest.api.object.EmployeeShoutCut;
import com.rest.api.object.EmployeeShow;
import com.rest.api.object.EpassCard;
import com.rest.api.object.Resource;
import com.rest.api.object.keyDict;

@Repository
public class DataHandler implements DataHandlerIface{

	@Inject
	private SqlSession sql;
	
	@Override
	public List<Company> GetCompany(String Name, String UEN, String TypeOfWork) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("Name", Name);
		p.put("UEN", UEN);
		p.put("TypeOfWork", TypeOfWork);
		
		return sql.selectList("Data._0001", p);
	}
	
	@Override
	public List<Employee> GetEmployee(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("PassNo", PassNo);
		
		return sql.selectList("Data._0002", p);
	}
	
	@Override
	public List<EmployeeOmit> GetEmployeeOmit(String Name, String NRIC, int[] CompanyList) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("Name", Name);
		p.put("NRIC", NRIC);
		p.put("CompanyList", CompanyList);
		
		return sql.selectList("Data._0009", p);
	}
	
	@Override
	public List<keyDict> GetTypeOfWork() throws Exception{
		return sql.selectList("Data._0003");
	}
	
	@Override
	public List<keyDict> GetAdditionalCourse() throws Exception{
		return sql.selectList("Data._0004");
	}
	
	@Override
	public List<keyDict> GetCompanyRole() throws Exception{
		return sql.selectList("Data._0005");
	}
	
	@Override
	public List<keyDict> GetCategory() throws Exception{
		return sql.selectList("Data._0010");
	}
	
	@Override
	public int DeleteCompany(int Nonce) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("Nonce", Nonce);
		return sql.delete("Data._0006", p);
	}
	
	@Override
	public int CreateCompany(Company company) throws Exception{
		return sql.insert("Data._0007",company);
	}
	
	@Override
	public int ModifyCompany(Company company) throws Exception{
		return sql.update("Data._0008", company);
	}
	
	@Override
	public int CreateEmployee(Employee employee) throws Exception{
		return sql.insert("Data._0011", employee);
	}
	
	@Override
	public int AddFile(String NRIC, String FileName, String ContentType, byte[] Image, int Category) {
		Map<String, Object> p = new HashMap<String,Object>();
		p.put("NRIC",NRIC);
		p.put("FileName",FileName);
		p.put("ContentType",ContentType);
		p.put("Data",Image);
		p.put("Category",Category);
		return sql.update("Data._0012",p);
	}
	
	@Override
	public int DeleteFile(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String,Object>();
		p.put("PassNo",PassNo);
		return sql.delete("Data._0013", p);
	}

	@Override
	public int DeleteUser(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String,Object>();
		p.put("PassNo",PassNo);
		return sql.delete("Data._0014", p);
	}

	@Override
	public Resource GetResource(int Idx) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("Idx", Idx);
		
		return sql.selectOne("Data._0015",p);
	}
	
	@Override
	public List<keyDict> GetMyProfileImg(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("PassNo", PassNo);
		return sql.selectList("Data._0016",p);
	}
	
	@Override
	public List<keyDict> GetMyDocument(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("PassNo", PassNo);
		return sql.selectList("Data._0017",p);
	}
	
	@Override
	public EpassCard GetEpassInfo(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("PassNo", PassNo);
		return sql.selectOne("Data._0018",p);
	}
	
	@Override
	public int DeleteUserPhoto(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("PassNo", PassNo);
		return sql.delete("Data._0019",p);
	}
	
	@Override
	public int EditUser(Employee employee) throws Exception{
		return sql.insert("Data._0020",employee);
	}
	
	@Override
	public EmployeeShow GetUserInfo(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("PassNo", PassNo);
		return sql.selectOne("Data._0021", p);
	}
	
	@Override
	public int DeleteDocument(int PassNo) throws Exception{
		Map<String, Object> p = new HashMap<String,Object>();
		p.put("PassNo",PassNo);
		return sql.delete("Data._0022", p);
	}
	
	@Override
	public int DeleteUserPhotoByNRIC(String NRIC) throws Exception{
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("NRIC", NRIC);
		return sql.delete("Data._0023",p);
	}
	
	@Override
	public int CreateBulkEmployee(EmployeeShoutCut employee) {
		return sql.insert("Data._0024", employee);
	}
}
