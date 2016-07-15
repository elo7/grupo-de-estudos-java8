package com.elo7.java8;

import java.util.Collections;
import java.util.List;

public class ProductService {

	public Product getProduct(long id) {
		return new Product(1l);
	}

	public List<Product> getProducts() {
		return Collections.emptyList() ;
	}

}
