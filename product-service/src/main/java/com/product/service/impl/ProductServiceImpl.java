package com.product.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.dto.ProductServiceDTO;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public ResponseEntity<String> saveDataIntoDB(ProductServiceDTO productServiceDTO) {

		return null;
	}

}
