package com.product.service;

import org.springframework.http.ResponseEntity;

import com.product.dto.ProductServiceDTO;
import com.product.entity.ProductServiceEntity;

public interface ProductService {

	ResponseEntity<String> saveDataIntoDB(ProductServiceDTO productServiceDTO);

	ProductServiceEntity getDataFromDB(int id);

	ProductServiceEntity updateProduct(int id, ProductServiceEntity productServiceDTO);

	String deleteProduct(int id);

}
