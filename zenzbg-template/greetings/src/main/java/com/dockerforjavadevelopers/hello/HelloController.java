package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
		System.out.println("This is simple Spring Boot project");
        return "Hello World. Docker deployments on web app\n";
    }
    
}
