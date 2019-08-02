package com.jspiders.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping(value="/admissionForm",method=RequestMethod.GET)
	public ModelAndView admissionForm()
	{
		ModelAndView modelandview = new ModelAndView("AdmissionForm");
		return modelandview;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName")String name,@RequestParam("studentHobby")String hobby)
	{
		Student s1= new Student();
		s1.setName(name);
		s1.setHobby(hobby);
		ModelAndView modelandview = new ModelAndView("AdmissionSuccess");
		modelandview.addObject(s1);
		modelandview.addObject("msg", "Details submitted by you :: Name "+name +", Hobby : "+hobby);
		return modelandview;
	}
	
	
	
}
