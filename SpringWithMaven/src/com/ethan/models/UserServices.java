package com.ethan.models;

public class UserServices 
{
	private String userid;
	private String pswd;
	
	public UserServices()
	{
		userid="";
		pswd="";
	}
	
	
	
	public void setUserid(String userid) {
		this.userid = userid;
	}



	public void setPswd(String pswd) {
		this.pswd = pswd;
	}



	public String authenticateUser()
	{
		String stat="";
		if(pswd.equals("chetan"))
			stat="success";
		else
			stat="failed";
		
		return(stat);
	}

}
