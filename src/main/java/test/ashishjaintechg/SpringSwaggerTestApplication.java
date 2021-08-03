package test.ashishjaintechg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@RequestMapping("/greetingsApi")
public class SpringSwaggerTestApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello";
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringSwaggerTestApplication.class, args);
	}

}
