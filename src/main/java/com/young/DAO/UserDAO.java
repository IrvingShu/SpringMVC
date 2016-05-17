package com.young.DAO;

import java.util.List;

import com.young.model.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class UserDAO implements UserDaoImpl {
	private JdbcTemplate jdbcTemplateObject;
	private DataSource datasource;
	
    public void setDatasource(DataSource ds) {  
        this.datasource = ds;  
        this.jdbcTemplateObject = new JdbcTemplate(datasource);       
    } 
		
	public List<User> selectAll()
	{
		List<User> users = null;
		String sql = "select * from user";
		System.out.println("selectstart");
		users = jdbcTemplateObject.query(sql, new UserMapper()); 
		System.out.println("selectend");
	    return users;  
	}
	
	public User selectByUserName(String username)
	{
		
		String sql = "select * from user where name = ?";
		return jdbcTemplateObject.queryForObject(sql, new Object[]{username}, new UserMapper());
		
	}
		
		
}
