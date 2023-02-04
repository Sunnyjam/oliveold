package com.example.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/insertUser")
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

    @GetMapping("")
    public User readUser() {
        return userService.readUser();
    }

    @GetMapping("/{userId}")
    public String userIdCheck(@PathVariable String userId) {
        return userService.userIdCheck(userId);
    }

    @GetMapping("/{email}")
    public String emailCheck(@PathVariable String email) {
        return userService.emailCheck(email);
    }
}
