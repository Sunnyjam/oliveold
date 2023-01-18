package com.example.controller;

import com.example.product.Product;
import com.example.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestBoardApiController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public List<Product> openProductList() throws Exception {
        return productService.readProduct();
    }

    @RequestMapping(value = "/api/insertProduct" , method = RequestMethod.POST)
    public void insertProduct(@RequestBody Product product) throws Exception {
       productService.insertProduct(product, null);
    }

    @RequestMapping(value = "/api/{productId" , method = RequestMethod.DELETE)
    public String deleteProduct (@PathVariable("productId") int productId) throws Exception {
        productService.deleteProduct(productId);
        return "redirect:/product";
    }
}
