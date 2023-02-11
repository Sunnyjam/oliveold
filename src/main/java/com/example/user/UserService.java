package com.example.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public User readUser() {
        return userMapper.readUser();
    }

    public String userIdCheck(String userId) {
        return userMapper.userIdCheck(userId);
    }
    public String emailCheck(String email) {
        return userMapper.emailCheck(email);
    }

    public User login(User user) {
        return userMapper.login(user);
    }
    public String selectSession(String sessionId) {
        return userMapper.selectSession(sessionId);
    }

    public int userUpdate(User user) {
        return userMapper.userUpdate(user);
    }
}
