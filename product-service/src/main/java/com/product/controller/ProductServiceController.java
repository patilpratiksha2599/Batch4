package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.dto.ProductServiceDTO;
import com.product.entity.ProductServiceEntity;
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

	@GetMapping(value = "/productservice/{id}")
	public ResponseEntity<ProductServiceEntity> getDataFromDB(@PathVariable("id") int id) {

		System.out.println("ProductServiceController getDataFromDB method START");
		System.out.println("ID" + id);
		ProductServiceEntity response = productService.getDataFromDB(id);
		System.out.println("Response" + response);
		System.out.println("ProductServiceController getDataFromDB method END");
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@PutMapping(value = "/productservice/update/{id}")
	public ResponseEntity<ProductServiceEntity> updateProduct(@PathVariable("id") int id,
			@RequestBody ProductServiceEntity productServiceDTO) {
		System.out.println("ProductServiceController updateProduct method START");
		ProductServiceEntity response = productService.updateProduct(id, productServiceDTO);
		System.out.println("Response " + response);
		System.out.println("ProductServiceController updateProduct method END");
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@DeleteMapping(value = "/productservice/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		System.out.println("ProductServiceController updateProduct method START");
		String response = productService.deleteProduct(id);
		System.out.println("Response " + response);
		System.out.println("ProductServiceController updateProduct method END");
		return new ResponseEntity<String>("Record is deleted", HttpStatus.OK);
	}

}
