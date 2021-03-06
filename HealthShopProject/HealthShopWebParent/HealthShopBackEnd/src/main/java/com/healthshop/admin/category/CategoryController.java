package com.healthshop.admin.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.healthshop.common.entity.Category;



@Controller
public class CategoryController {
   
	@Autowired
	private CategoryService service;
	
	@GetMapping("/categories")
	public String listAll(Model model) {
		List<Category> listCategory = service.listAll();
		
		
		model.addAttribute("listCategory",listCategory);
		
		return "categories";
		
	}
	
}