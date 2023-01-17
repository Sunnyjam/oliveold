//package com.example.user;
//
//
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class UserRepository {
//    static public ArrayList<UserDTO> users;
//
//    static {
//       users = new ArrayList<>();
//       users.add(new UserDTO("kang", "test1", "1234"));
//       users.add(new UserDTO("park", "test2", "1234"));
//       users.add(new UserDTO("kim", "test3", "1234"));
//    }
//
//    public UserDTO insertUser(UserDTO user) {
//        users.add(user);
//        return user;
//    }
//    //전체 Id조회
//    public List<UserDTO> getAllUsers() {
//        return users;
//    }
//    //필요한 Id조회
//    public UserDTO getUserByUserId(String userId) {
//        return users.stream()
//                //userDTO에 대한 Id값을 꺼내오는 코드
//                .filter(userDTO -> userDTO.getUserId().equals(userId))
//                .findAny()
//                //없으면, 빈값
//                .orElse(new UserDTO("", "", ""));
//        // userId에 맞는 값이 있으면 그 값을 return, 없으면 new UserDTO("", "", "")을 return
//    }
//    //Pw 변경
//    public void updateUserPw(String userId, UserDTO user) {
//        users.stream()
//                .filter(userDTO -> userDTO.getUserId().equals(userId))
//                .findAny()
//                .orElse( new UserDTO("", "", ""))
//                .setUserPw(user.getUserPw());
//    }
//    //Id 삭제
//    public void deleteUser(String userId) {
//        users.removeIf(userDTO -> userDTO.getUserId().equals(userId));
//    }
//}
