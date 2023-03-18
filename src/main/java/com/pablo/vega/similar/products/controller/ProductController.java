package com.pablo.vega.similar.products.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.vega.similar.products.controller.DTO.ProductDetail;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ProductController {

	@GetMapping("/product/{productId}/similar")	
	@Operation(summary = "Obtiene un producto por su ID", operationId = "getProductById")
    public ResponseEntity<List<ProductDetail>> getSimilarProducts(
    		@PathVariable (required = true) String productId
    ) {
        List<ProductDetail> similarProducts = new ArrayList<ProductDetail>();
        
        similarProducts.add(new ProductDetail("1", "product1", 20.50d, true));
        similarProducts.add(new ProductDetail("2", "product2", 30.50d, true));
        similarProducts.add(new ProductDetail("3", "product3", 20.50d, true));
        
        
        // Aquí puedes agregar los elementos a la lista
        return ResponseEntity.ok(similarProducts);
    }
	
	
	
}
