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
        //user 조회하는 mapper 호출
        //user 가 존재하면 "이미 존재하는 회원입니다."
        //userId가 DB에서 없는 지 먼저 if로 체크하기
        String userID = userIdCheck(user.getUserId());
        String email = emailCheck(user.getEmail());
        String userPassword = String.valueOf(readUser());

        if (userID.equals(user.getUserId())) {
            return -1;}// "이미 존재하는 회원입니다."
        else if ( userID == null){
            return userService.insertUser(user);
            // "가입 가능한 회원입니다.
        } if (email.equals(user.getEmail())) {
            return -2; //"이미 존재하는 이메일 입니다."
        } else if ( email == null){
            return userService.insertUser(user);
            //"가입 가능한 이메일 입니다."
        } if (userPassword.length() < 8) {
            return -3; // "비밀번호는 8자리 이상이여야 합니다."
        } else {
            return userService.insertUser(user);
        }
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

    @PostMapping("/{login}")
    public User login(@RequestBody User user){
        return userService.login();
    }
    @GetMapping("/{sessionId}")
    public String selectSession(@PathVariable String sessionId) {
        return userService.selectSession(sessionId);
    }
}
