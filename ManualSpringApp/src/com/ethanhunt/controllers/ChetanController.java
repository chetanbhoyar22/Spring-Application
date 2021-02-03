package com.ethanhunt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChetanController 
{
  @RequestMapping("/")
  public String welcome()
  {
	  return "index";
  }
}
