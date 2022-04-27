package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.model.Book;
import com.yash.model.publisher;
@Component
public class publisherDAO 
{
	@Autowired
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int addpublisher(publisher objP)
	{
	if(jt!=null)
	{
	int rcount;
	rcount= jt.update("insert into publisher (pubid, publisher_name, email, address) values(?,?,?,?)", 
			objP.getPubid(), objP.getPublisher_name(), objP.getEmail(), objP.getAddress());
	return rcount;
	}
	return 0;
    }

	public int editPublisher(publisher objP)
	{
	int rcount;
	rcount= jt.update("update publisher set publisher_name=?, email=?, address=? where pubid=?",
			objP.getPublisher_name(), objP.getEmail(), objP.getAddress(),objP.getPubid());
	return rcount;
    }
	
	
	public int deletePublisher(publisher objP)
	{
		int rcount;
		rcount= jt.update("delete from publisher where pubid=?",objP.getPubid());
		return rcount;
	}
	public List<publisher> getAllPublisher()
	{
		return jt.query("select * from publisher", new RowMapper<publisher>() {
			public publisher mapRow(ResultSet rs,int rowno) throws SQLException
			{
				publisher obju = new publisher();
				obju.setPubid(rs.getInt("pubid"));
				obju.setPublisher_name(rs.getString("Publisher_name"));
				obju.setEmail(rs.getString("email"));	
				obju.setAddress(rs.getString("address"));
				return obju;
			}
		});		
	}

	

}

