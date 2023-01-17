package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insertUserDTO(UserDTO userDTO) {
        return userMapper.insertUser(userDTO);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public UserDTO readUser() {
        return userMapper.readUser();
    }
}
