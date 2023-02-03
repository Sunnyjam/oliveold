package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {
    @Autowired
    UserService userService;
    //CRUD
    //C create insert POST
    //R read GET
    //U update PUT
    //D delete DELETE

    @PostMapping("")
    public int insertUser(@RequestBody UserDTO userDTO) {
        return userService.insertUserDTO(userDTO);
    }

    @DeleteMapping("{id}")
    public int deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

    @GetMapping("")
    public UserDTO readUser() {
        return userService.readUser();
    }

    @GetMapping("/{userId}")
    public String userIdCheck(@PathVariable String userId) {
        return userService.userIdCheck(userId);
    }


}
