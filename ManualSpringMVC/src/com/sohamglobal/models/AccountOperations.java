package com.sohamglobal.models;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.sql.*;

@Service
public class AccountOperations 
{
	private ArrayList<Account> list;
	
	public AccountOperations()
	{
		list=new ArrayList<Account>();
	}
	
	public ArrayList<Account> getList() {
		retrieveData();
		return list;
	}
	
	private void retrieveData()
	{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		Account ac;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chetan?user=root&password=12345");
			pst=con.prepareStatement("select * from accounts;");
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				ac=new Account();
				ac.setAccno(rs.getInt(1));
				ac.setAccnm(rs.getNString(2));
				ac.setAcctype(rs.getNString(3));
				ac.setBalance(rs.getDouble(4));
				list.add(ac);
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

public String addNewAccount(Account obj)
{
	Connection con;
	PreparedStatement pst;
	String accstatus="";
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chetan?user=root&password=12345");
		pst=con.prepareStatement("insert into accounts values(?,?,?,?);");
		pst.setInt(1, obj.getAccno());
		pst.setNString(2, obj.getAccnm());
		pst.setNString(3, obj.getAcctype());
		pst.setDouble(4, obj.getBalance());
		pst.executeUpdate();
		con.close();
		accstatus="done";

	}
	catch(Exception e)
	{
		accstatus="failed";
		System.out.println(e);
	}

	
	return accstatus;
}
	

}
