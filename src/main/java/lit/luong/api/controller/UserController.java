package lit.luong.api.controller;

import lit.luong.api.entity.User;
import lit.luong.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> index() {
        return userService.getUsers();
    }

    @PostMapping("/user")
    public User store(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
