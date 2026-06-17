package com.yash.WebApp.Controller;

import com.yash.WebApp.Model.Product;
import com.yash.WebApp.Service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }  //idhar mana constructor ka use kiya ha for di


    @GetMapping("/products")
    public Object getproducts(){
        return productService.getproducts();
    }

    @GetMapping("/products/{prodId}")
    public Object getProductsById(@PathVariable int prodId){
        return productService.getProductsById(prodId);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        productService.addProduct(prod);

    }
}
