package com.rest.api.controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.rest.api.object.Company;
import com.rest.api.object.Employee;
import com.rest.api.object.EmployeeShoutCut;
import com.rest.api.object.Resource;
import com.rest.api.service.DataService;

@Controller
public class AjaxController {
	@Inject
	DataService dService;
	
	@RequestMapping(value = "/inform/getCompany", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetCompany(@RequestParam(defaultValue="")String Name,
			@RequestParam(defaultValue="")String UEN,
			@RequestParam(defaultValue="")String TypeOfWork,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.GetCompany(Name,UEN,TypeOfWork);
		return r;
	}
	
	@RequestMapping(value = "/inform/getEmployeeOmit", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetEmployeeOmit(@RequestParam(defaultValue="")String Name,
			@RequestParam(defaultValue="")String NRIC,
			@RequestParam(value="CompanyList[]")int[] CompanyList,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.GetEmployeeOmit(Name, NRIC, CompanyList);
		return r;
	}
	
	@RequestMapping(value = "/inform/getEmployee", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetEmployee(@RequestParam(defaultValue="")int PassNo,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.GetEmployee(PassNo);
		return r;
	}
	
	@RequestMapping(value = "/inform/getTypeOfWork", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetTypeOfWork(HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.GetTypeOfWork();
		return r;
	}
	
	@RequestMapping(value = "/inform/getCompanyRole", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetCompanyRole(HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.GetCompanyRole();
		return r;
	}
	
	@RequestMapping(value = "/inform/getCategory", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetCategory(HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.GetCategory();
		return r;
	}
	
	@RequestMapping(value = "/inform/getAdditionalCourse", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetAdditionalCourse(HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.GetAdditionalCourse();
		return r;
	}
	
	@RequestMapping(value = "/error/requireLogin", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> RequireLogin(HttpServletRequest req) throws Exception{
		Map<String, Object> r = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("msg", "session expired");
		
		ArrayList<Map<String, Object>> dataArray = new ArrayList<Map<String, Object>>();
		dataArray.add(data);
		
		r.put("code", -1);
		r.put("data",dataArray);
		return r;
	}
	
	@RequestMapping(value = "/update/CreateCompany", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> CreateCompany(Company company,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.CreateCompany(company);
		return r;
	}
	
	@RequestMapping(value = "/update/deleteCompany", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> DeleteCompany(@RequestParam(defaultValue="0")int Nonce,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.DeleteCompany(Nonce);
		return r;
	}
	
	@RequestMapping(value = "/update/modifyCompany", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> ModifyCompany(Company company,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.ModifyCompany(company);
		return r;
	}
	
	@RequestMapping(value = "/update/createEmployee", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> CreateEmployee(Employee employee,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.CreateEmployee(employee);
		return r;
	}
	
	@RequestMapping(value = "/update/modifyEmployee", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> ModifyEmployee(Employee employee,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.EditUser(employee);
		return r;
	}
	
	@RequestMapping(value = "/update/deleteEmployee", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> DeleteEmployee(@RequestParam(defaultValue="")int PassNo,
			HttpServletRequest req) throws Exception{
		Map<String, Object> r = dService.DeleteUser(PassNo);
		return r;
	}
	
	@RequestMapping(value = "/upload/imgUpload", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> AddImage(@RequestParam(defaultValue="")String NRIC, 
			@RequestParam(defaultValue="")String imgdata) throws Exception{
		
		Map<String, Object> r = dService.AddImage(NRIC, imgdata);
		return r;
	}
	
	@RequestMapping(value = "/upload/uploadFile", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> FileUpload(@RequestParam(defaultValue="")String NRIC, 
			@RequestParam(defaultValue="")MultipartFile File) throws Exception{
		
		byte[] Data = null;
		
		if(!File.isEmpty()) {
			Data = File.getBytes();
		}
		
		Map<String, Object> r = dService.FileUpload(NRIC, File.getContentType(), File.getOriginalFilename(), Data);
		return r;
	}
	
	@RequestMapping(value = "/download/resource", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<byte[]> FileDownload(@RequestParam(defaultValue="")int Idx) throws Exception{
		Resource r = (Resource)dService.GetResource(Idx);
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.parseMediaType(r.getContentType()));
		headers.set("Content-Disposition", "attachment;filename=" + r.getName() + ";");
		return new ResponseEntity<byte[]>(r.getData(),headers,HttpStatus.OK);
	}

	@RequestMapping(value = "/inform/profileimg", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetProfileImg(@RequestParam(defaultValue="")int PassNo) throws Exception{
		
		Map<String, Object> r = dService.GetMyProfileImg(PassNo);
		return r;
	}
	
	@RequestMapping(value = "/inform/document", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetDocument(@RequestParam(defaultValue="")int PassNo) throws Exception{
		
		Map<String, Object> r = dService.GetMyDocument(PassNo);
		return r;
	}
	
	@RequestMapping(value = "/inform/epass", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> GetEpassInfo(@RequestParam(defaultValue="")int PassNo) throws Exception{
		
		Map<String, Object> r = dService.GetEpassInfo(PassNo);
		return r;
	}
	
	@RequestMapping(value = "/update/deleteUserPhoto", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> DeleteUserPhoto(@RequestParam(defaultValue="")int PassNo) throws Exception{
		
		Map<String, Object> r = dService.DeleteUserPhoto(PassNo);
		return r;
	}
	
	@RequestMapping(value = "/update/deleteUserDocument", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> DeleteUserDocument(@RequestParam(defaultValue="")int PassNo) throws Exception{
		
		Map<String, Object> r = dService.DeleteUserDocument(PassNo);
		return r;
	}
	
	@RequestMapping(value = "/update/modifyUserPhoto", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> ModifyUserPhoto(@RequestParam(defaultValue="")String NRIC,
			@RequestParam(defaultValue="")String imgdata) throws Exception{
		
		Map<String, Object> r = dService.ModifyImage(NRIC, imgdata);
		return r;
	}
	
	@RequestMapping(value = "/update/createEmployeeBulk", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> ModifyUserPhoto(EmployeeShoutCut employee) throws Exception{
		Map<String, Object> r = dService.CreateEmployeeBulk(employee);
		return r;
	}
}
