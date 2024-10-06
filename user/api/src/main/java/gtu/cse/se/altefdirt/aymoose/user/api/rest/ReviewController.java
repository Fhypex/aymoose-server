package gtu.cse.se.altefdirt.aymoose.review.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import gtu.cse.se.altefdirt.aymoose.shared.domain.Secret;

@RestController
public class ReviewController {
    
    @GetMapping("/review")
    public String hello() {
        Secret secret = new Secret(1);
        return "Review";
    }
}
