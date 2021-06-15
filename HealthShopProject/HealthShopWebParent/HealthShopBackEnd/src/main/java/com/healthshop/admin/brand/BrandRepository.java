package com.healthshop.admin.brand;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthshop.common.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
