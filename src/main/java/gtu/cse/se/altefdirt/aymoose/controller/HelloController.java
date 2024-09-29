
package gtu.cse.se.altefdirt.aymoose.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("")
    public String hello() {
        return "Hello, new user has been created! Daha da güzellesti, The better the newer. Vl4";
    }
}
