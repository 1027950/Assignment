package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.model.Book;

@Component
public class BookDAO
{
	@Autowired
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public List<Book> getAllBooks()
	{
		return jt.query("select * from booktitle", new RowMapper<Book>() {
			public Book mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Book obju = new Book();
				obju.setBtid(rs.getInt("btid"));
				obju.setTitle(rs.getString("title"));
				obju.setAuid1(rs.getInt("auid1"));	
				obju.setAuid(rs.getInt("auid"));	
				obju.setAuid3(rs.getInt("auid3"));	
				obju.setPubid(rs.getInt("pubid"));	
				obju.setPrice(rs.getInt("price"));	
				return obju;
			}
		});		
	}

}
