package com.yash.WebApp.Service;

import com.yash.WebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;



@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(23, 24, "mobile"), new Product(26,12,"cleaner"));

    public List<Product> getproducts() {
        return products;

    }

}
