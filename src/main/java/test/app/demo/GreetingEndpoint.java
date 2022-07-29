package test.app.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingEndpoint {

    @GetMapping
    public String getGreeting() {
        return "Hi! I'm spring boot";
    }
}
