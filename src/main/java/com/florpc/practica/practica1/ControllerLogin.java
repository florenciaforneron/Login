package com.florpc.practica.practica1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Controller
public class ControllerLogin {

	 @GetMapping("/login")
	    public String findUsers(Model model) {
	        model.addAttribute("login", new Login());
	        return "login";
	    }
	
	    @PostMapping("/login")
	    public String createUser(@ModelAttribute Login login) {
	        return "okLogin";
	    }
	    
	    @DeleteMapping("/login")
	    public String deleteUser(@ModelAttribute Login login) {
	    	return "usuarios";
	    }
	    
	    @PutMapping("/login")
	    public String updateUser(@ModelAttribute Login login) {
	    	return "usuarios";
	    }
	
	

}
