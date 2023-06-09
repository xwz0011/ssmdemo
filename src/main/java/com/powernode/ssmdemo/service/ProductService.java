package com.powernode.ssmdemo.service;


import com.powernode.ssmdemo.bean.Product;

import java.util.ArrayList;

public interface ProductService {
    Double findTurnover();

    ArrayList<Product> findAllProducts();

    ArrayList<Product> findProductsByName(String name);

    int insertProduct(Product product);

}
