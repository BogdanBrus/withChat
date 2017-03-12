package org.mvcedit;

import java.util.List;

import javax.inject.Inject;

import org.mvcedit.models.Partner;
import org.mvcedit.services.ServicePartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@Inject
	private ServicePartner servicePartner;
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String msg = "I am message from controller hello";
		return new ModelAndView("hello","message", msg);
	}
	
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		String msg = "I am message from controller hi";
		return new ModelAndView("hi","message", msg);
	}
	
	@RequestMapping( "/newWorld")
	public ModelAndView newWorld(){
		String msg = "I am message from controller newWorld";
		return new ModelAndView("newWorld","message", msg);
	}
	
	//for hibernate
	@RequestMapping("/all")
	public ModelAndView allList() {
		ModelAndView modelAndView = new ModelAndView();
		
		List<Partner> partners = servicePartner.getAllPartner();
		modelAndView.addObject("partners",partners);
		modelAndView.setViewName("all");
		return modelAndView;
	}
	
	
	
}
