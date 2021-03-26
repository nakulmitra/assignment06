package com.nagarro.management.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.nagarro.management.dao.UserDao;
import com.nagarro.management.model.Employee;
import com.nagarro.management.model.User;

import antlr.collections.List;

@Controller
public class MainController {
	
	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	public RedirectView home(@ModelAttribute("user") User user, HttpServletRequest request) {
		UserDao dao = new UserDao();
		
		String userId = user.getUserid();
		String pass = user.getPass();
		
		String ans = dao.authenticationUser(userId, pass);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContentType() + "/" + ans);
		
		return redirectView;
	}
	
	@RequestMapping(value = "/add-employee", method = RequestMethod.POST)
	public RedirectView addEmployee(@ModelAttribute("user") User user, HttpServletRequest request) {
		UserDao dao = new UserDao();
		
		dao.createUser(user);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContentType() + "/all-employee");
		
		return redirectView;
	}	
	
	@RequestMapping(value = "/all-employee", method = RequestMethod.POST)
	public RedirectView allEmployee(HttpServletRequest request) {
		UserDao dao = new UserDao();
		
		java.util.List<Employee> emp = new ArrayList<Employee>();
		emp = dao.allEmployee();
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContentType() + "/all-employee");
		
		return redirectView;
	}	
}
