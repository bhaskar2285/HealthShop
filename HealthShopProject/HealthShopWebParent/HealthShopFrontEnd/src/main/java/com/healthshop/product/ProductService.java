package com.healthshop.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthshop.common.entity.Product;


@Service
public class ProductService {
    @Autowired 
	private ProductRepository repo;
    
    public List<Product> listAll(){
    	return (List<Product>) repo.findAll();
    	
    }
}
