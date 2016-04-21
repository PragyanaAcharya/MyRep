package com.testapp.controller;

/**
 * @author d.kumar.samantaray
 *
 */
import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.testapp.service.TestAppService;

@Controller
public class TestAppController {

	@Autowired
    TestAppService maeAppService;

	@RequestMapping("/")
	public String getUserPage(HttpSession session){
		System.out.println("Hi it's in getUserPage method !");
		/*session.setAttribute("title", "Spring security test Application");
		session.setAttribute("message", "Welcome to Spring Security App Page");*/
		maeAppService.getUserService();
		return "usersearch";
	}
	
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public String getAdminPage(){
		System.out.println("Hi it's in getAdminPage method !");
		return "admin";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,HttpSession session) {
		System.out.println("Hi it's in login method !");
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}
	
	@PreAuthorize("isAuthenticated()")
	@RequestMapping("/searchByJobId")
	public String searchByJobId(String jobId,HttpSession httpSession,Principal principal){
		/*if (principal == null) return "admin";*/
        
		// TODO Auto-generated method stub
		return "searchByJobId";
	}
	
	@RequestMapping("/searchByBrand")
	public String searchByBrand(String brandName){
		// TODO Auto-generated method stub
		return "searchByBrand";
	}
	
	@RequestMapping("/searchByStatus")
	public String searchByStatus(String status){
		// TODO Auto-generated method stub
		return "searchByStatus";
	}
	
	@RequestMapping("/searchByChampion")
	public String searchByChampion(String champion){
		// TODO Auto-generated method stub
		return "searchByChampion";
	}
	
	@RequestMapping("/searchByOriginatingCountry")
	public String searchByOriginatingCountry(String orgCountry){
		// TODO Auto-generated method stub
		return "searchByOrgCountry";
	}
	
	@RequestMapping("/searchByDateRange")
	public String searchByDateRange(String orgCountry){
		// TODO Auto-generated method stub
		return "searchByDateRange";
	}
}
