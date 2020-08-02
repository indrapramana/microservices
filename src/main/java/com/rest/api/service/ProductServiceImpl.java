package com.rest.api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.model.Product;
import com.rest.api.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void createProduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void updateProduct(Long id, Product product) {
		
	}

	@Override
	public void deleteProduct(Long id) {

	}

	@Override
	public Collection<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
