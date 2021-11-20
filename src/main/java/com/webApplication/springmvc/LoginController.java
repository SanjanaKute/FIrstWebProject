package com.webApplication.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webApplication.jee.LoginService;
import com.webApplication.jee.UserValidationService;

@Controller
public class LoginController {
	
	LoginService service=new LoginService();
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	
	public String showLoginPage() {
		return "login";
	}
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model)  
	{
	if(!service.validateUser(name, password))
			{
		model.put("ErrorMessage","Invalid Crendentials");
	return "login";
			}
	model.put("name", name); 
	model.put("password", password); 
	return "welcome";

	}
}