package com.webApplication.jee;

public class UserValidationService {
	public boolean isUserValid(String user, String password)
	{
		if(user.equals("sanjana") && password.equals("hii"))
			return true;
		else
		{
			return false;
		}
	}

}
