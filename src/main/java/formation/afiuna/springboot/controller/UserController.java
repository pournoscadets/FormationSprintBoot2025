package formation.afiuna.springboot.controller;

import formation.afiuna.springboot.entity.User;
import formation.afiuna.springboot.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/users", produces = "application/json")
    public ResponseEntity<List<User>> findAllUser() {
        List<User> listUser = this.userService.findAll();
        return new ResponseEntity<>(listUser, HttpStatus.OK);
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = this.userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }


}
