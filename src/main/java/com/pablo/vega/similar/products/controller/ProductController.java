package com.pablo.vega.similar.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.vega.similar.products.controller.DTO.ProductDetail;
import com.pablo.vega.similar.products.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/product/{productId}/similar")	
	@Operation(summary = "Obtiene un producto por su ID", operationId = "getProductById")
    public ResponseEntity<List<ProductDetail>> getSimilarProducts(
    		@PathVariable (required = true) String productId
    ) {
        List<ProductDetail> similarProducts = productService.findRelatedProducts(productId);
        
        return ResponseEntity.ok(similarProducts);
    }
	
	
	
}
