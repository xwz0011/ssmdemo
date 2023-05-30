package com.powernode.ssmdemo.mapper;

import com.powernode.ssm.bean.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ProductMapper {

    Double selectTurnover(String date);

    ArrayList<Product> findAllProducts();

    ArrayList<Product> findProductsByName(String name);

    int insertProduct(Product product);
}
