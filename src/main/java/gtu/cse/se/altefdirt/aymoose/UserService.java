package gtu.cse.se.altefdirt.aymoose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User creatUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

    public User updateUser(UUID id, User updatedUser) {
        return userRepository.findById(id)
            .map(user -> {
                user.setEmail(updatedUser.getEmail());
                user.setUsername(updatedUser.getUsername());
                user.setAddress(updatedUser.getAddress());
                return userRepository.save(user);
                

            })
            .orElseGet(() -> {
                updatedUser.setId(id);
                return userRepository.save(updatedUser);
            });
    }
}

