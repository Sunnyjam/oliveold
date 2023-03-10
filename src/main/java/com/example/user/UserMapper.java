package com.example.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(User user);
    int deleteUser(int id);
    User readUser();
    String userIdCheck(String userId);
    String emailCheck(String email);
    User login(User user); // parameter type X
    String selectSession( String sessionId);

    int userUpdate(User user);

    User findPassWord( User user);





}
