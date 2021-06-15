package com.healthshop;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.healthshop.common.entity.Product;
import com.healthshop.product.ProductService;

@Controller
public class MainController {
	   @Autowired
	   private ProductService service;
       @GetMapping("")
       public String viewHomePage (Model model) {
    	   

   		List<Product> listProducts = service.listAll();
		
		
   		model.addAttribute("listProducts",listProducts);
   		
   		return "index";
       }
}
