package com.osr.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/***
 * @Component -> @Controller -> @RestController( @Controller + @ResponseBody)
 * 
 * @author VDEEPA3
 *
 */
import com.osr.ws.service.DetailsService;
@Controller
public class BillionariesController {

	@Autowired
	DetailsService service;
	
    @GetMapping("/riches/details/all")
    public String greeting(Model model) {
    	
        model.addAttribute("billions", service.findAll());
        
        System.out.println(service.findAll());
        
        return "landingPage";
    }
    
}