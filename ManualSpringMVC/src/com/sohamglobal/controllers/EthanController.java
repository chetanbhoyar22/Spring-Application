package com.sohamglobal.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sohamglobal.models.Account;
import com.sohamglobal.models.AccountOperations;
import com.sohamglobal.models.User;

@Controller
public class EthanController 
{
	@Autowired
	private AccountOperations ao;
	
	@RequestMapping("/")
	public String welcome()
	{
		return "index";
	}
	
	@RequestMapping("/check")
	public ModelAndView checkUser(String userid,String pass)
	{
		ModelAndView mv=new ModelAndView();
		if(pass.equals("springmvc"))
			mv.setViewName("Admin");
		else
			mv.setViewName("Failure");
		
		return(mv);
	}
	
	@RequestMapping("/register")
	public String newuserregistration()
	{
		return "NewUser";
	}
	
	@RequestMapping("/adduser")
	public ModelAndView addNewUser(User u)
	{
		String stat=u.registerUser();
		ModelAndView mv=new ModelAndView();
		if(stat.equals("success"))
			mv.setViewName("RegSuccess");
		else
			mv.setViewName("Failure");
			
		return(mv);
	}
	
	@RequestMapping("/acreport")
	public ModelAndView showReport()
	{
		ModelAndView mv=new ModelAndView();
		//AccountOperations ao=new AccountOperations();
		ArrayList<Account> lst=ao.getList();
		mv.addObject("datalist", lst);
		mv.setViewName("Report");
		return mv;
	}

	@RequestMapping("/newaccount")
	public String openNewAccount()
	{
		return "NewAccount";
	}
	
	
	@RequestMapping("/createaccount")
	public ModelAndView createAccount(Account ac)
	{
		ModelAndView mv=new ModelAndView();
		//AccountOperations ao=new AccountOperations();
		String stat=ao.addNewAccount(ac);
		if(stat.equals("done"))
			mv.setViewName("RegSuccess");
		else
			mv.setViewName("Failure");
		
		return(mv);
	}
}







