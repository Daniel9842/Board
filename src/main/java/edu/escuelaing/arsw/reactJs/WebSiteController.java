package edu.escuelaing.arsw.reactJs;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebSiteController {
	@Resource
	private HttpServletRequest request;
 
	public static void main(String[] args) {
		SpringApplication.run(WebSiteController.class, args);
	}
}
