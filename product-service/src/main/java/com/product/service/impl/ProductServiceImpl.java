package com.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.dto.ProductServiceDTO;
import com.product.entity.ProductServiceEntity;
import com.product.repo.ProductServiceRepo;
import com.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductServiceRepo productServiceRepo;

	@Override
	public ResponseEntity<String> saveDataIntoDB(ProductServiceDTO productServiceDTO) {

		System.out.println("Product Service DTO" + productServiceDTO);
		ProductServiceEntity entity = new ProductServiceEntity();

		entity.setProductName(productServiceDTO.getProductName());
		entity.setProductType(productServiceDTO.getProductType());
		entity.setProductPrice(productServiceDTO.getProductPrice());

		ProductServiceEntity saveAndFlush = productServiceRepo.saveAndFlush(entity);
		System.out.println("Data SAVED" + saveAndFlush);

		return new ResponseEntity<String>("Data Inserted", HttpStatus.OK);
	}

	@Override
	public ProductServiceEntity getDataFromDB(int id) {
		

		ProductServiceEntity productServiceEntity = productServiceRepo.findById(id).get();
		
		System.out.println(productServiceEntity.getId());

		return productServiceEntity;
	}

	@Override
	public ProductServiceEntity updateProduct(int id, ProductServiceEntity productServiceDTO) {
	
		productServiceDTO.setId(id);
		ProductServiceEntity entity = productServiceRepo.save(productServiceDTO);
		return entity;
	}

	@Override
	public String deleteProduct(int id) {
		productServiceRepo.deleteById(id);
		return null;
	}

}
