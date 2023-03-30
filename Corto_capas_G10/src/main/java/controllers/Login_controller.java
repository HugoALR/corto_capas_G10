package controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class Login_controller {

	 @GetMapping("/")
	   public String Login() {
	      return "Login";
	   }
}
