package gtu.cse.se.altefdirt.aymoose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.creatUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable UUID id, @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser);
    }
    
    @DeleteMapping("/{id}")
    public void deleteuser(@PathVariable UUID id) {
        userService.deleteUser(id);
    }


    
}


