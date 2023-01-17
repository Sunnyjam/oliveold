package com.example.user;

import com.example.product.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(UserDTO userDTO);

    int deleteUser(int id);

    UserDTO readUser();
}
