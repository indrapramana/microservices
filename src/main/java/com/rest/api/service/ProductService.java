package com.rest.api.service;

import java.util.Collection;

import com.rest.api.model.Product;

public interface ProductService {
	
	public abstract void createProduct(Product product);
	public abstract void updateProduct(Long id, Product product);
	public abstract void deleteProduct(Long id);
	public abstract Collection<Product> getProducts();

}
