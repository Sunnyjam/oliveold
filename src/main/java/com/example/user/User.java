package com.example.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    public static int UserResponse;
    private String userId;
    private String userName;
    private String userPassword;
    private int id;
    private String email;

    public static User returnMessageUser(String message) {
        return new User();
    }
}
