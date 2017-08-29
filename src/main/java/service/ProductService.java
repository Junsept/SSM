package service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.ProductMapper;
import pojo.Product;
@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;
    
    public List<Product> list(){
        return productMapper.listProduct();
    };
}
