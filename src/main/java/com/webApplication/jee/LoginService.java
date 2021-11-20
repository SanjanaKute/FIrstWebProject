package com.webApplication.jee;

public class LoginService
{
	public boolean validateUser(String user,String password)
	{
		return user.equalsIgnoreCase("sanjana")&&password.equals("hii");
	}

}
