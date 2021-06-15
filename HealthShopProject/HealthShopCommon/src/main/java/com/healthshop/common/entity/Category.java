package com.healthshop.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "categories")
public class Category {
	  @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)	  
      private Integer Id;
	  
	  @Column(length = 128, nullable = false, unique =true)
      private String name;

	  public Integer getId() {
			return Id;
      }
	
	  public void setId(Integer id) {
			Id = id;
	  }
	
	  public String getName() {
			return name;
	  }
	
	  public void setName(String name) {
			this.name = name;
	  }
		  
	  
}
