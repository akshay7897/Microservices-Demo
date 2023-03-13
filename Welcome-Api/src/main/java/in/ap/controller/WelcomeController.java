package in.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ap.config.fienClient;

@RestController
public class WelcomeController {
	
	@Autowired
	private fienClient fienClient;
	
	@GetMapping("/welcome")
	public String getWelcome() {
		String s="Good evening ,";
		
		String str = fienClient.greetInvokde();
		
		return s+","+str;
		
		
	}

}
