package com.pablo.vega.similar.products.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pablo.vega.similar.products.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("SELECT DISTINCT p FROM Product p JOIN p.tags t WHERE t IN (SELECT t2 FROM Product p2 JOIN p2.tags t2 WHERE p2.id = :id) AND p.id != :id")
	List<Product> findRelatedProducts(@Param("id") Long id);
}
