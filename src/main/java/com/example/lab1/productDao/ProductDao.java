package com.example.lab1.productDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.lab1.product.Product;

@Transactional
@Repository
public class ProductDao {

	@PersistenceContext
	EntityManager em;

	public boolean create(Product product) {
		em.persist(product);
		return true;
	}

	public List<Product> reterive() {
		String Qstr = "SELECT product FROM Product product";
		TypedQuery<Product> query = em.createQuery(Qstr, Product.class);

		return query.getResultList();
	}

}
