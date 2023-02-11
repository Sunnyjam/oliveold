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
        //user 가 존재하면 "이미 존재하는 회원입니다.".eq
        //userId가 DB에서 없는 지 먼저 if로 체크하기
        String userID = userIdCheck(user.getUserId()); // DB
        String email = emailCheck(user.getEmail()); // DB

        if (user.getUserId().equals(userID) || user.getEmail().equals(email) || user.getUserPassword().length() >= 8) {
            return -1; // "이미 존재하는 회원입니다."
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
    public User login(@RequestBody User user) {
        // 조회를 했을 때 값이 없을 경우
        User login = userService.login(user);
        if (login == null) {
            return User.returnMessageUser("존재하지 않는 이메일 입니다");
        } else {
            return User.returnMessageUser("로그인 성공");
        }
    }
    @GetMapping("/{sessionId}")
    public String selectSession(@PathVariable String sessionId) {
        return userService.selectSession(sessionId);
    }

    @PutMapping("/updateUser")
    public int userUpdate(@RequestBody User user) {
        return userService.userUpdate(user);
    }
}
