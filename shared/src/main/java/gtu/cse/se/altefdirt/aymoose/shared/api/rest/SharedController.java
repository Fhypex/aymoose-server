package gtu.cse.se.altefdirt.aymoose.shared.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SharedController {
    
    @GetMapping("/shared")
    public String shared() {
        return "Shared";
    }
}
