package com.yash.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	@RequestMapping("/m1")
    public static String show() {
	return "index";	
	}
	
	/*@RequestMapping("/m2")
	public static String redirect() {
		return "show";
	}
	@RequestMapping("/m3")
	public static String disp() {
		return "final";
	}
		@RequestMapping("/getParaSubmit")
		 public String getPSubmit(HttpServletRequest req,Model m )
		 {
			 String un = req.getParameter("unp");
			 String pass = req.getParameter("passp");
			 m.addAttribute("un", un);
			 return "getdemopage";
		 }
		 @RequestMapping(value="/postSubmit", method=RequestMethod.POST)
		 public String postSubmit(String unpost,String passpost, Model m)
		 {
			 m.addAttribute("un",unpost);
			 m.addAttribute("msg", "data is hidden");
			 return "postpage";
		 }*/
		 
		 @RequestMapping(value="/item", method=RequestMethod.POST)
		 public String postSubmit(String in,int ip, int q, int d, Model m)
		 {
			 m.addAttribute("a",in);
			 m.addAttribute("b",ip);
			 m.addAttribute("c",q);
			 m.addAttribute("d",d);
			 return "post";
		 }
	}
