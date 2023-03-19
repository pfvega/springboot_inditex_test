package com.pablo.vega.similar.products.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablo.vega.similar.products.controller.DTO.ProductDetail;
import com.pablo.vega.similar.products.dao.ProductRepository;
import com.pablo.vega.similar.products.domain.Product;
import com.pablo.vega.similar.products.service.commons.MyModelMapper;

@Service
public class ProductService {
	@Autowired
    private ProductRepository productRepository;
	
	@Autowired
	private MyModelMapper modelMapper;
    
    public List<ProductDetail> findRelatedProducts(String productId) {
    	List<Product> productList = productRepository.findRelatedProducts(Long.parseLong(productId));
    	
    	return productList.stream()
                .map(product -> modelMapper.map(product, ProductDetail.class))
                .collect(Collectors.toList());
    }
}
