package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.model.author;

@Component
public class AuthorDAO 
{
	@Autowired
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int addAuthor(author objA)
	{
	if(jt!=null)
	{
	int rcount;
	rcount= jt.update("insert into author (auid, author_name, email) values(?,?,?)", 
			objA.getAuid(), objA.getAuthor_name(), objA.getEmail());
	return rcount;
	}
	return 0;
    }

	public int editAuthor(author objA)
	{
	int rcount;
	rcount= jt.update("update author set author_name=?, email=? where auid=?",objA.getAuthor_name(),objA.getEmail(),objA.getAuid());
	return rcount;
    }
	
	
	public int deleteAuthor(author objA)
	{
		int rcount;
		rcount= jt.update("delete from author where auid=?",objA.getAuid());
		return rcount;
	}
	public List<author> getAllAuthor()
	{
		return jt.query("select * from author", new RowMapper<author>() {
			public author mapRow(ResultSet rs,int rowno) throws SQLException
			{
				author obju = new author();
				obju.setAuid(rs.getInt("auid"));
				obju.setAuthor_name(rs.getString("author_name"));
				obju.setEmail(rs.getString("email"));				 
				return obju;
			}
		});		
	}

}
