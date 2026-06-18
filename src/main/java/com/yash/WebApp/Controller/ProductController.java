package com.yash.WebApp.Controller;

import com.yash.WebApp.Model.Product;
import com.yash.WebApp.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }  //idhar mana constructor ka use kiya ha for di


    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductsById(@PathVariable int prodId){
        return productService.getProductsById(prodId);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        productService.addProduct(prod);

    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        productService.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }

}
