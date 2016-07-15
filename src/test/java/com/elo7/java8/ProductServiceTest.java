package com.elo7.java8;

import static org.junit.Assert.assertEquals;
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
	public void shouldNotReturnNullProduct() {
		Product product = subject.getProduct(1l);
		assertNotNull(product);
	}

	@Test
	public void shouldReturnProductWithId1() {
		Product product = subject.getProduct(1l);
		assertEquals(1l, product.getId());
	}
}
