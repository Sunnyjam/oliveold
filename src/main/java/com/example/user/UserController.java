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
        //user 가 존재하며누"이미 존재하는 회원입니다.
        //userId가 DB에서 없는 지 먼저 if로 체크하기
        String userID = userIdCheck(user.getUserId());
        String email = emailCheck(user.getEmail());

        if (userID.equals(user.getUserId())) {
            return -1;
            //int라 "이미 존재하는 회원입니다" 작성이 안됨 = -1
        } else if (email.equals(user.getEmail())) {
            return -2;
            //"이미 존재하는 email 입니다 = -2
        }
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

    @PostMapping("/insertPassword")
    public String insertPassword(@RequestBody String userPassword) {
        if ( String userPassword < 8){
            return "8자리 이상 비밀번호를 입력하세요.";
        }
        return userService.insertPassword(userPassword);
    }
}
