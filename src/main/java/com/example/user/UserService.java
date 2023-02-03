package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insertUserDTO(UserDTO userDTO) {
        // todo
        // user 조회 하는 mapper 호출
        // user 가 존재하면 "이미 존재하는 회원입니다"
        String userId = userIdCheck(userDTO.getUserId()); // testid
        String email = emailCheck(userDTO.getEmail());
        // userid 가 DB에서 없는지 먼저 if로 체크

        if (userId.equals(userDTO.getUserId()) || email.equals(userDTO.getEmail())) {
            return -1; // 이미 존재하는 회원입니다
        } else {
            return userMapper.insertUser(userDTO);
        }
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public UserDTO readUser() {
        return userMapper.readUser();
    }

    public String userIdCheck(String userId) {
        return userMapper.userIdCheck(userId);
    }

    public String emailCheck(String email) {
        return userMapper.emailCheck(email);
    }

}

