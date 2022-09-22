package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.dto.ProductServiceDTO;
import com.product.service.ProductService;

@RestController
public class ProductServiceController {

	@Autowired
	ProductService productService;

	@PostMapping(value = "/productservice")
	public ResponseEntity<String> saveDataIntoDB(@RequestBody ProductServiceDTO productServiceDTO) {

		System.out.println("ProductServiceController saveDataIntoDB method START");
		ResponseEntity<String> response = productService.saveDataIntoDB(productServiceDTO);
		System.out.println("Response" + response);
		System.out.println("ProductServiceController saveDataIntoDB method END");
		return response;
	}

}
