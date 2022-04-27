package com.yash.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.student;

public class studentDAO {
	
	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	
	public int insert(student stud) {
		String query= "insert into studinfo values"+"('"+stud.getSid()+"','"+stud.getFirstname()+"','"+stud.getLastname()+"','"+stud.getFathername()+"',"
				+ "'"+stud.getMothername()+"','"+stud.getGender()+"','"+stud.getClassname()+"','"+stud.getAdd1()+"','"+stud.getAdd2()+"','"+stud.getParent_mail()+"'"
						+ ",'"+stud.getDob()+"','"+stud.getDate_of_admission()+"','"+stud.getParent_no()+"','"+stud.getCityId()+"')";
	int no=jt.update(query);
	return no;
	}
	
	public int update(student stud)
	{
	String query="update studinfo set firstname='"+stud.getFirstname()+"', lastname='"+stud.getLastname()+"', fathername='"+stud.getFathername()+"', mothername='"+stud.getMothername()+"',"
			+ "mothername='"+stud.getMothername()+"',gender='"+stud.getGender()+"', classname='"+stud.getClassname()+"',add1='"+stud.getAdd1()+"',add2='"+stud.getAdd2()+"',parent_mail='"+stud.getParent_mail()+"', dob='"+stud.getDob()+"', date_of_admission='"+stud.getDate_of_admission()+"', parent_no='"+stud.getParent_no()+"', cityid='"+stud.getCityId()+"' where sid='"+stud.getSid()+"'";
	
	int no;
	no =jt.update(query);
	return no;

	}
	public int delete(int sid)
	{
	String query ="delete from studinfo where sid="+sid;
	return jt.update(query);
	}
	
	public List<student> getAllstudentByRowMapper()
	{
		return jt.query("select * from studinfo", new RowMapper<student>() {
			public student mapRow(ResultSet rs,int rowno) throws SQLException
			{
				student s = new student();
				s.setSid(rs.getInt("sid"));
				s.setFirstname(rs.getString("firstname"));
				s.setLastname(rs.getString("lastname"));
				s.setFathername(rs.getString("fathername"));
				s.setMothername(rs.getString("mothername"));
				s.setGender(rs.getString("gender"));
				s.setClassname(rs.getString("classname"));
				s.setAdd1(rs.getString("add1"));
				s.setAdd2(rs.getString("add2"));
				s.setParent_mail(rs.getString("parent_mail"));
				s.setDob(rs.getString("dob"));
				s.setDate_of_admission(rs.getString("date_of_admission"));
				s.setParent_no(rs.getString("parent_no"));
				s.setCityId(rs.getInt("cityid"));
				return s;				
			}			
		});
		
	}


}
