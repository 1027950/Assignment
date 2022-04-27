package com.yash;

import java.util.List;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.studentDAO;

import com.yash.model.student;

public class studMain {

	public static void main(String[] args) {
		
       ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
       studentDAO sd=(studentDAO) ac.getBean("edao");
       int ch;
       Scanner sc=new Scanner(System.in);
       while(true)
  	 {
  		 System.out.println(" 1 Insert\n 2 Update\n 3 Delete \n 4: To fetch all records");
  		 ch=sc.nextInt();
  		 sc.nextLine();
  	switch(ch)
  	{
  	case 1:
  		 String fn=""; String ln=""; String father=""; String mn=""; String g="";
  		 String cn=""; String ad1=""; String ad2=""; String pm=""; String dob="";
  		 String doa=""; String pn=""; int si, ci; 
  		 while(true) {
  			 student stud=new student();
  			
  			 System.out.println("Enter sid");
 			 si=sc.nextInt();
  			 sc.nextLine();
  			 System.out.println("Enter fisrtname and lastname ");
  			 fn=sc.nextLine();
  			 ln=sc.nextLine();
  			System.out.println("Enter Fathername and Mothername");
 			 father=sc.nextLine();
 			 mn=sc.nextLine();
 			System.out.println("Enter gender and classname of the student ");
			 g=sc.nextLine();
			 cn=sc.nextLine();
			 System.out.println("Enter AddressLine 1 and Address line 2 ");
 			 ad1=sc.nextLine();
 			 ad2=sc.nextLine();
 			System.out.println("Enter Parent mail");
			 pm=sc.nextLine();
			 System.out.println("Enter Date of birth and Date of admission ");
 			 dob=sc.nextLine();
 			 doa=sc.nextLine();
 			System.out.println("Enter Parent MobileNo and City id ");
			 pn=sc.nextLine();
			 ci=sc.nextInt();
			 sc.nextLine();
			 
			 stud.setSid(si);
			 stud.setFirstname(fn);
			 stud.setLastname(ln);
			 stud.setFathername(father);
			 stud.setMothername(mn);
			 stud.setGender(g);
			 stud.setClassname(cn);
			 stud.setAdd1(ad1);
			 stud.setAdd2(ad2);
			 stud.setParent_mail(pm);
			 stud.setDob(dob);
			 stud.setDate_of_admission(doa);
 			 stud.setParent_no(pn);
 			 stud.setCityId(ci);
 			 
 			System.out.println("Total record saved:- "+sd.insert(stud));
			System.out.println("want to do more 1 for yes 0 for no");
			ch=sc.nextInt();
			sc.nextLine();
			if(ch==0)
				 break;
  		 }
			
  		 case 2:
  			 
  			 student stud=new student();
  			 
			 System.out.println("Which record do you want to update : ");	
			 System.out.println("Enter sid");
 			 si=sc.nextInt();
  			 sc.nextLine();
  			 System.out.println("Enter fisrtname and lastname ");
  			 fn=sc.nextLine();
  			 ln=sc.nextLine();
  			System.out.println("Enter Fathername and Mothername");
 			 father=sc.nextLine();
 			 mn=sc.nextLine();
 			System.out.println("Enter gender and classname of the student ");
			 g=sc.nextLine();
			 cn=sc.nextLine();
			 System.out.println("Enter AddressLine 1 and Address line 2 ");
 			 ad1=sc.nextLine();
 			 ad2=sc.nextLine();
 			System.out.println("Enter Parent mail");
			 pm=sc.nextLine();
			 System.out.println("Enter Date of birth and Date of admission ");
 			 dob=sc.nextLine();
 			 doa=sc.nextLine();
 			System.out.println("Enter Parent MobileNo and City id ");
			 pn=sc.nextLine();
			 ci=sc.nextInt();
			 sc.nextLine();
			 
			 stud.setSid(si);
			 stud.setFirstname(fn);
			 stud.setLastname(ln);
			 stud.setFathername(father);
			 stud.setMothername(mn);
			 stud.setGender(g);
			 stud.setClassname(cn);
			 stud.setAdd1(ad1);
			 stud.setAdd2(ad2);
			 stud.setParent_mail(pm);
			 stud.setDob(dob);
			 stud.setDate_of_admission(doa);
 			 stud.setParent_no(pn);
 			 stud.setCityId(ci);
 			System.out.println("Record updated successfully..."+sd.update(stud));
			
			break;
			
  		case 3:
			 System.out.println("Enter sid to delete record: ");
			 si=sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("Record deleted successfully..."+sd.delete(si));
			 
			 break;
			 
  		case 4:
  			List<student> list=sd.getAllstudentByRowMapper();
  			 System.out.println("Sid\t Firstname\t Lastname\t Fathername\t Mothername\t Gender\t Classname\t AddressLine1\t AddressLine2\t Parent Mail\t Date_of_birth\t Date_of_admission\t Parent_no \t CityId");
  			 for(student s: list)
  			 {
  				System.out.println(s.getSid()+"\t" + s.getFirstname()+"\t"+s.getLastname()+"\t"+s.getFathername()+"\t"+s.getMothername()+"\t"+s.getGender()+"\t"+s.getClassname()+"\t"+s.getAdd1()+"\t"+s.getAdd2()+"\t"+s.getParent_mail()+"\t"+s.getDob()+"\t"+s.getDate_of_admission()+"\t"+s.getParent_no()+"\t"+s.getCityId());
  			 }
		 }
		
  		 }

}
  	}
	
