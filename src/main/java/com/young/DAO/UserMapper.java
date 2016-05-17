package com.young.DAO;

import org.springframework.jdbc.core.RowMapper;
import com.young.model.*;
import java.sql.ResultSet;  
import java.sql.SQLException; 

public class UserMapper implements RowMapper<User>{
    public User mapRow(ResultSet rs, int rownum) throws SQLException {  
        User user = new User();  
        user.setId(rs.getString("id"));  
        user.setUsername(rs.getString("name"));  
        user.setPassword(rs.getString("password"));    
        return user;       
    }  
	
}
