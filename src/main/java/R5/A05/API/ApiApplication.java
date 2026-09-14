package R5.A05.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	 @GetMapping ("/bonjour")
    public String hello(@RequestParam(value = "name", defaultValue = "le monde") String name) {
      return String.format("Bonjour %s!", name);
    }

}
