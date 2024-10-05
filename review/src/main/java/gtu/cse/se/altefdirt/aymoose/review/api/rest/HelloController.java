package gtu.cse.se.altefdirt.aymoose.review.api.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/review")
    public String hello() {
        return "Review";
    }
}
