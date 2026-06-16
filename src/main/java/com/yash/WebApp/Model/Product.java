package com.yash.WebApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int ProdId;
    private int ProdPrice;
    private String Name;

}
