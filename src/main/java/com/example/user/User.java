package com.example.user;


import lombok.*;

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
}
