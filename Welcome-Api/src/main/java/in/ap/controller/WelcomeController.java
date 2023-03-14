package in.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.ap.config.fienClient;
import in.ap.helper.Pet;
import in.ap.helper.Response;

@RestController
public class WelcomeController {
	
	@Autowired
	private fienClient fienClient;
	
	@GetMapping("/welcome")
	public Response getWelcome() {
		String s="Good evening ,";
		
		String str = fienClient.greetInvokde();
		
		String url="https://hqa6gzkmwj.execute-api.ap-northeast-1.amazonaws.com/dev/pets/1";
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Pet> entity = restTemplate.getForEntity(url, Pet.class);
		Pet pet = entity.getBody();
		
		Response response=new Response();
		response.setWelcome(s);
		response.setGreet(str);
		response.setPet(pet);
		
		return response;
		
		
	}

}
