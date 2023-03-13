package in.ap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping("/greet")
	public String getGreet() {
		
		String s="Welcome Akshay Patil....!";
		
		return s;
		
	}

}
