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

    private String userId;
    private String userName;
    private String userPassword;
    private int id;
    private String email;

    private String message;

    public User(String message) {
        this.message = message;
    }

    public static User returnMessageUser(String message) {
        return new User(message);
    }
}
