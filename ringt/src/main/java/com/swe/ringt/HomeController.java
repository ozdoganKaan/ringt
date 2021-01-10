package com.swe.ringt;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swe.entity.Ringtone;
import com.swe.service.RingtoneService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private RingtoneService ringtoneService; 
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Model model) {
	
		/*
		Ringtone ringtone=new Ringtone();
		
		ringtone.setName("þarký1");
		
		
		ringtoneService.create(ringtone);
		
		
		
		*/
		
		
		return "login";
		
		
	}@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
	
		/*
		Ringtone ringtone=new Ringtone();
		
		ringtone.setName("þarký1");
		
		
		ringtoneService.create(ringtone);
		
		
		
		*/
		
		
		return "register";
	}
	
}
