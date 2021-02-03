package com.ethan.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ethan.models.AccountServices;
import com.ethan.models.UserServices;

@Controller
public class HomeController 
{

	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public String checkUser(HttpServletRequest request)
	{
		String id,ps,st;
		id=request.getParameter("userid");
		ps=request.getParameter("pass");
		UserServices us=new UserServices();
		us.setUserid(id);
		us.setPswd(ps);
		st=us.authenticateUser();
		HttpSession ses=request.getSession(true);
		ses.setAttribute("userid", id);
		
		if(st.equals("success"))
			return "User";
		else
			return "Failure";
			
		
	}
	
	@RequestMapping("/search")
	public String showResult(@RequestParam("ano") int acnumber,Model m)
	{
		AccountServices obj=new AccountServices();
		obj.setAccno(acnumber);
		String nm=obj.getAccnm();
		String ty=obj.getAcctype();
		double bal=obj.getBalance();
		
		m.addAttribute("name", nm);
		m.addAttribute("type", ty);
		m.addAttribute("bal", bal);
		m.addAttribute("msg", "JDBC searching done...");
	
		return "SearchResult";
	}
	
}
