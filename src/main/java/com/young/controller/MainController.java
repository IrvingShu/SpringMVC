package com.young.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.young.DAO.UserDAO;
import com.young.model.User;


@Controller
@RequestMapping("/")

public class MainController {

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	private UserDAO userDAO;

	@RequestMapping("login")
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
       //return new ModelAndView("redirect:info");
	    User user = userDAO.selectByUserName(username);
	    System.out.println(password);
	    System.out.println(user.getPassword());
	    
	    if(password.equals(user.getPassword()))
	    {	
	    	user.display();
	    	return "redirect:info";
	    }
	    else{
	    	return "index";
	    }
	   //return "info";
	}
	
	
	@RequestMapping("info")
	//@ResponseBody
	public Map<String, String> info()
	{	
		
		List<User> users;
		users = userDAO.selectAll();
		Map<String, String> map = new HashMap<String, String>();	
      
		for(User u: users){
        	map.put("key",u.getUsername());
        }
		return map;
	}
	
	/*
	@RequestMapping("info")
	public String info(HttpServletRequest request, HttpServletResponse response)
	{
		List<User> users;
		users = userDAO.selectAll();
		String result =  "{\"name\":\""+users.get(0).getUsername()+"\",\"id\":\""+users.get(0).getId()+"\"}";
        //for(User u: users){
        //	u.display();
        // 	result = "{\"name\":\""+u.getUsername()+"\",\"id\":\""+u.getId()+"\"}";//user
        //}
        response.setContentType("application/json");
        try { 
            PrintWriter out = response.getWriter(); 
            out.write(result);//��ҳ���ϴ���json���� 
       } catch (IOException e) { 
            e.printStackTrace(); 
       } 
        	
		return "redirect:info.jsp";
	}*/
	
	
	
}
