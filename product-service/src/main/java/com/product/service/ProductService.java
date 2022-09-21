package com.product.service;

import org.springframework.http.ResponseEntity;

import com.product.dto.ProductServiceDTO;

public interface ProductService {

	ResponseEntity<String> saveDataIntoDB(ProductServiceDTO productServiceDTO);

}
