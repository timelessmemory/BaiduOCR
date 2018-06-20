package org.ocr.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.ocr.service.IUserService;
import org.ocr.utils.AuthService;
import org.ocr.utils.IdentificationOcr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userServiceImpl;
	
	@RequestMapping("/view/{ftl}")
	public String forward(@PathVariable("ftl") String ftl, HttpSession session){
		return ftl;
	}
	
	@RequestMapping("/login")
	public String login(String name,String code,HttpSession session,String checkcode,Model model){
		if ("".equals(name) || name == null || "".equals(code) || code == null) {
			return "/error" ;
		}
		
		HashMap map = userServiceImpl.check(name, code);
		if (map==null) {
			model.addAttribute("error","验证失败");
		}else{
			model.addAttribute("user", map);
		}
		return "/success" ;
	}
	
	@RequestMapping("/upload")
	@ResponseBody
	public HashMap<String, Object> upload(@RequestParam(value = "imgFile", required = false) MultipartFile imgFile, HttpServletRequest request) throws IllegalStateException, IOException, ServletException {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
	    if (imgFile != null) {
	        if (imgFile.isEmpty()) {
	        	resultMap.put("res","fail" );
	        	return resultMap;
	        } else{
	            String res = IdentificationOcr.identify(imgFile.getBytes(), AuthService.getAuth());
//	            String res = IdentificationOcr.identify(imgFile.getBytes(), "24.de24132f751871ee0c94d575c7c1eddf.2592000.1528605855.282335-11076831");
	            System.out.println(res);
	            JSONObject jsonObject = new JSONObject(res);
	            JSONObject words_resultObject = jsonObject.getJSONObject("words_result");
	            
	            JSONObject iden_resObject = words_resultObject.getJSONObject("公民身份号码");
	            String code = iden_resObject.getString("words");
	            
	            boolean isexist = userServiceImpl.isAdd(code);
	            
	            if (isexist) {
	            	resultMap.put("res","exist");
	            	return resultMap;
	            }
	            
	            JSONObject address_resObject = words_resultObject.getJSONObject("住址");
	            String address = address_resObject.getString("words");
	            
	            JSONObject birth_resObject = words_resultObject.getJSONObject("出生");
	            String birth = birth_resObject.getString("words");
	            
	            JSONObject name_resObject = words_resultObject.getJSONObject("姓名");
	            String name = name_resObject.getString("words");
	            
	            JSONObject gender_resObject = words_resultObject.getJSONObject("性别");
	            String gender = gender_resObject.getString("words");
	            
	            JSONObject nation_resObject = words_resultObject.getJSONObject("民族");
	            String nation = nation_resObject.getString("words");
	            
	            userServiceImpl.add(name, code, gender, nation, birth, address);
	            resultMap.put("res","success");
	            return resultMap;
	        }
	    }
	    
	    resultMap.put("res","fail");
	
    	return resultMap;
	}
}
