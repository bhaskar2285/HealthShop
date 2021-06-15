package com.healthshop.admin.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthshop.common.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
