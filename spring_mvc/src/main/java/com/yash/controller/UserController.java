package com.yash.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

	@RequestMapping("/userhome")
	  public String uh()
	  {
		  return "userhome";	  
	  }
	  // we can have multiple controller but url should be different for each methods.
	  @GetMapping("/userreg")
	  public String userRegistrationForm(Model m)
	  {	  
		  User objU = new User();
		  m.addAttribute("obju", objU);
		return "usersignup"; //signup, register, all are same  
	  }
	  @PostMapping("/usersbt")
	  public String saveUser(@ModelAttribute("obju") User objuser, Model m)
	  {
		 /* System.out.println(objuser.getFirstName());
		  System.out.println(objuser.getLastName());
		  System.out.println(objuser.getEmail());
		  System.out.println(objuser.getGen());
		  System.out.println(objuser.getCityname());
		  System.out.println(objuser.getTerms_condition());
		  */	  
		  m.addAttribute("objUser", objuser);	  
		  return "user_saved";
	
	
}}
