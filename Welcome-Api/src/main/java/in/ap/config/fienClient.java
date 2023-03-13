package in.ap.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-API")
public interface fienClient {
	
	@GetMapping("/greet")
	public String greetInvokde();

}
