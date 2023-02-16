package com.example.product;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    int insertProduct(Product product);
    List<Product> readProduct();

    int deleteProduct(int productId);

    Product readProductDetail(int productId);

   // String searchProduct ( Product product );

    int heartCount(@Param("userId") int userId, @Param("productId") int productId);

    int insertHeart( Product product);

    int deleteHeart (int id);

    List<Product> readHeart(@Param("userId") int userId, @Param("productId") int productId);
}
