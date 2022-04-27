package com.yash.model;

public class student {
	int sid, cityid;
    String firstname, lastname, fathername, mothername, 
    gender, classname, add1, add2, cityname, parent_mail, dob, date_of_admission, parent_no;
    
    public student() {
		super();
		
	}

	public student(int sid, int cityId, String firstname, String lastname, String fathername, String mothername,
			String gender, String classname, String add1, String add2, String cityname, String parent_mail, String dob,
			String date_of_admission, String parent_no) {
		super();
		this.sid = sid;
		this.cityid = cityId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.gender = gender;
		this.classname = classname;
		this.add1 = add1;
		this.add2 = add2;
		this.cityname = cityname;
		this.parent_mail = parent_mail;
		this.dob = dob;
		this.date_of_admission = date_of_admission;
		this.parent_no = parent_no;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCityId() {
		return cityid;
	}

	public void setCityId(int cityId) {
		this.cityid = cityId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getParent_mail() {
		return parent_mail;
	}

	public void setParent_mail(String parent_mail) {
		this.parent_mail = parent_mail;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDate_of_admission() {
		return date_of_admission;
	}

	public void setDate_of_admission(String date_of_admission) {
		this.date_of_admission = date_of_admission;
	}

	public String getParent_no() {
		return parent_no;
	}

	public void setParent_no(String parent_no) {
		this.parent_no = parent_no;
	}

	
}















/*
 * phoneno_parent_:- it is compulsory, email_parent,
 * 
 * [Yesterday 18:03] Vimal Jawla sid, firstname, lastname, fathername,
 * mothername, classname, section, dob, date_of_admission, gender, add1, add2,
 * city, phoneno_student:- it will be optional, phoneno_parent_:- it is
 * compulsory, email_parent,
 * 
 * [Yesterday 18:03] Vimal Jawla you can make city as foreign key means cityid
 * will be foreign key in student table and city table will have two column
 * cityid and cityname
 */