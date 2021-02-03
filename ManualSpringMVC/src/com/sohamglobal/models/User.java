package com.sohamglobal.models;

import java.sql.*;

public class User 
{
	private String userid;
	private String pass;
	private String usernm;
	private String usertype;
	
	public User()
	{
		userid="";
		pass="";
		usernm="";
		usertype="";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsernm() {
		return usernm;
	}

	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	public String registerUser()
	{
		String regstatus="";
		Connection con;
		PreparedStatement pst;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chetan?user=root&password=12345");
			pst=con.prepareStatement("insert into users values(?,?,?,default,default);");
			pst.setNString(1, userid);
			pst.setNString(2, pass);
			pst.setNString(3, usernm);
			
			pst.executeUpdate();
			con.close();
			regstatus="success";
			
		}
		catch(Exception e)
		{
			regstatus="failed";
			System.out.println(e);
		}
		return(regstatus);
	}

}
