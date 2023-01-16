package docker.learning.learningdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningdockerApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(){
		return("Welcome Page get api");
	}

}
