package com.elo7.java8;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest {

	private ProductService subject;

	@Before
	public void setup() {
		this.subject = new ProductService();
	}

	@Test
	public void consultaProdutoTest() {
		Product product = subject.getProduct(1);
		assertNotNull(product);
	}

}
