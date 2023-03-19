package com.pablo.vega.similar.products.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pablo.vega.similar.products.domain.Product;

public class ProductDAO {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	
	public List<Product> getSimilarProducts(Long productoId){
		
//		TypedQuery<Product> query = entityManager.createQuery(Stringformat
//			
//		);
		
		
		return null;
	}
}
