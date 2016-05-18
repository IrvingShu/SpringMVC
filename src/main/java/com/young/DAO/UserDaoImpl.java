package com.young.DAO;

import java.util.List;
import com.young.model.*;

public interface UserDaoImpl {
	public List<User> selectAll();
	public User selectByUserName(String username);
	
}
