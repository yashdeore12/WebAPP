package com.yash.WebApp.Service;

import com.yash.WebApp.Model.Product;
import com.yash.WebApp.Repository.ProductRepo;
import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class ProductService {

// this is di
    private final ProductRepo Repo;

    public ProductService(ProductRepo Repo) {
        this.Repo = Repo;
    }


    // used to add product
    public void addProduct(Product prod) {
        Repo.save(prod);

    }
    //used to update product
    public void updateProduct(Product prod){
         Repo.save(prod);

    }

    //delete product
    public void deleteProduct(int prodId){
        Repo.deleteById(prodId);
    }


    //get product by id and all product
    public List<Product> getProducts() {
        return Repo.findAll();

    }
    public Product getProductsById(int prodId) {
        return Repo.findById(prodId).orElse(new Product());


    }

}
