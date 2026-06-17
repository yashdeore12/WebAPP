package com.yash.WebApp.Service;

import com.yash.WebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class ProductService {

    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(23, 10000, "mobile"),
                    new Product(24, 12, "cleaner")
            )
    );

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public List<Product> getproducts() {
        return products;

    }

    public Object getProductsById(int prodId) {
        for (Product p : products) {
            if (p.getProdId() == prodId) return p;

        }
        return new Product(prodId, 0, "no item");


    }
}
