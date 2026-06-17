package com.yash.WebApp.Service;

import com.yash.WebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;



@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(23, 10000, "mobile"), new Product(24,12,"cleaner"));

    public List<Product> getproducts() {
        return products;

    }

    public Object getProductsById(int prodId) {
        for (Product p : products) {
            if (p.getProdId() == prodId) return p;

        }
        return null;


    }
}
