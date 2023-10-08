package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
@Service
public interface ProductService {
	
	public Product saveProduct(Product product);
	
	
	public List<Product> getAllproduct();
	
	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);
	
	public Product editProduct(Product product,Integer id);
	

}
