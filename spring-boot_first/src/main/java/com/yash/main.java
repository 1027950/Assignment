package com.yash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.dao.AuthorDAO;
import com.yash.dao.BookDAO;
import com.yash.dao.publisherDAO;
import com.yash.model.Book;
import com.yash.model.author;
import com.yash.model.publisher;
@Controller
public class main
{
	@Autowired
	AuthorDAO adao;
	
	@Autowired
	publisherDAO pdao;
	
	@Autowired
	BookDAO bdao;
	
	
    @RequestMapping("/")
    public String first() 
    {
    	return "index";
    }
    
    @RequestMapping("/login")
	public String m1()
	{
		return "login";
	}
	@RequestMapping("/signup")
	public String m2()
	{
		return "signup";
	}
	
	@RequestMapping(value="/saveauthor", method=RequestMethod.POST)
	public ModelAndView saveauthor(@ModelAttribute author objA)
	{
		ModelAndView objMV=new ModelAndView();
		if(adao.addAuthor(objA)==1)
		{
		objMV.setViewName("authorsuccess");
		objMV.addObject("author", objA);
		return objMV;
		}
		else
		{
			objMV.setViewName("signup");
			return objMV;
		}
	}
	
	@RequestMapping("/edit")
	public String m3()
	{
		return "edit";
	}
	
	@RequestMapping(value="/editauthor", method=RequestMethod.POST)
	public ModelAndView editauthor(@ModelAttribute author objA)
	{
		ModelAndView objMV=new ModelAndView();
		if(adao.editAuthor(objA)==1)
		{
		objMV.setViewName("editauthor");
		objMV.addObject("author", objA);
		return objMV;
		}
		else
		{
			objMV.setViewName("signup");
			return objMV;
		}
	}
	
	@RequestMapping("/delauthor")
	public String m4()
	{
		return "delete";
	}
	
	@RequestMapping(value="/deleteauthor", method=RequestMethod.POST)
	public ModelAndView deleteauthor(@ModelAttribute author objA)
	{
		ModelAndView objMV=new ModelAndView();
		if(adao.deleteAuthor(objA)==1)
		{
		objMV.setViewName("deleteauthor");
		objMV.addObject("author", objA);
		return objMV;
		}
		else
		{
			objMV.setViewName("signup");
			return objMV;
		}
	}
	
	@RequestMapping(value="/showallauthor")
	public ModelAndView userlist()
	{
		List<author> alist=adao.getAllAuthor();
 		ModelAndView objmv = new ModelAndView();
 		
		objmv.addObject("alist",alist);
		
		objmv.setViewName("authorlist");
		return objmv;
	}

	
//=============publisher==============
	
	@RequestMapping("/signup_publisher")
	public String m5()
	{
		return "signup_publisher";
	}
	
	@RequestMapping(value="/savepublisher", method=RequestMethod.POST)
	public ModelAndView savepublisher(@ModelAttribute publisher objP)
	{
		ModelAndView objMV=new ModelAndView();
		if(pdao.addpublisher(objP)==1)
		{
		objMV.setViewName("publishersuccess");
		objMV.addObject("publisher", objP);
		return objMV;
		}
		else
		{
			objMV.setViewName("signup_publisher");
			return objMV;
		}
	}
	
	@RequestMapping("/editPub")
	public String m6()
	{
		return "editPub";
	}
	
	@RequestMapping(value="/editpublisher", method=RequestMethod.POST)
	public ModelAndView editpub(@ModelAttribute publisher objP)
	{
		ModelAndView objMV=new ModelAndView();
		if(pdao.editPublisher(objP)==1)
		{
		objMV.setViewName("editpublisher");
		objMV.addObject("publisher", objP);
		return objMV;
		}
		else
		{
			objMV.setViewName("signup_publisher");
			return objMV;
		}
	}
	
	@RequestMapping("/delpub")
	public String m7()
	{
		return "deletepub";
	}
	
	@RequestMapping(value="/deletepublisher", method=RequestMethod.POST)
	public ModelAndView deletepublisher(@ModelAttribute publisher objP)
	{
		ModelAndView objMV=new ModelAndView();
		if(pdao.deletePublisher(objP)==1)
		{
		objMV.setViewName("deletepublisher");
		objMV.addObject("publisher", objP);
		return objMV;
		}
		else
		{
			objMV.setViewName("signup_publisher");
			return objMV;
		}
	}
	
	@RequestMapping(value="/showallpublisher")
	public ModelAndView publist()
	{
		List<publisher> plist=pdao.getAllPublisher();
 		ModelAndView objmv = new ModelAndView();
 		
		objmv.addObject("plist",plist);
		
		objmv.setViewName("publisherlist");
		return objmv;
	}
	
	@RequestMapping(value="/showallbooks")
	public ModelAndView booklist()
	{
		List<Book> plist=bdao.getAllBooks();
 		ModelAndView objmv = new ModelAndView();
 		
		objmv.addObject("plist",plist);
		
		objmv.setViewName("booklist");
		return objmv;
	}
	
	

	
	
}
