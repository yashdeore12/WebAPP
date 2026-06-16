package com.yash.WebApp.Controller;

import com.yash.WebApp.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/products")
    public Object getproducts(){
        return productService.getproducts();
    }
}
