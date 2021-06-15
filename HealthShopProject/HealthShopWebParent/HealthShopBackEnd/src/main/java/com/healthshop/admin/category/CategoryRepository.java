package com.healthshop.admin.category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthshop.common.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
