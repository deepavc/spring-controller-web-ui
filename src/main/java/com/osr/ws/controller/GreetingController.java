package com.osr.ws.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.osr.ws.dto.Greeting;
/***
 * @Component -> @Controller -> @RestController( @Controller + @ResponseBody)
 * 
 * @author VDEEPA3
 *
 */
@Controller
public class GreetingController {

	AtomicLong counter = new AtomicLong();
	
    @GetMapping("/details/all")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "landingPage";
    }
    
    @RequestMapping("/welcome")
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format("Welcome %s to Project Wood", name));
    }
    
    
}