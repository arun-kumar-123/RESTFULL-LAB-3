package com.example.lab1.productService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab1.product.Product;
import com.example.lab1.productDao.ProductDao;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;

	public Product save(Product product) {
		boolean result = productDao.create(product);

		if (result) {
			return product;
		} else
			return null;
	}

	public List<Product> reterive() {
		// TODO Auto-generated method stub
		return productDao.reterive();
	}
}