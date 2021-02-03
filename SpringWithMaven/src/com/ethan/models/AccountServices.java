package com.ethan.models;
import java.sql.*;

public class AccountServices 
{
	private int accno;
	private String accnm;
	private String acctype;
	private double balance;
	
	public AccountServices()
	{
		accno=0;
		accnm="Not Found";
		acctype="Not Found";
		balance=0.0;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
		searchData();
	}

	public String getAccnm() {
		return accnm;
	}

	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	private void searchData()
	{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chetan?user=root&password=12345");
			pst=con.prepareStatement("select * from accounts where id=?;");
			pst.setInt(1,accno);
			rs=pst.executeQuery();
			if(rs.next())
			{
				accnm=rs.getNString("accnm");
				acctype=rs.getNString("acctype");
				balance=rs.getDouble("balance");
			}
			con.close();
		}
		catch(Exception e)
		{
			accnm="Error";
			acctype="Error";
		}
	}

}
