package com.example.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(UserDTO userDTO);

    int deleteUser(int id);

    UserDTO readUser();

    String userIdCheck(String userId);

    String emailCheck(String email);
}
