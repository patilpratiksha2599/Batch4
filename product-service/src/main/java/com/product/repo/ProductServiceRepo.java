package com.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entity.ProductServiceEntity;

@Repository
public interface ProductServiceRepo extends JpaRepository<ProductServiceEntity, Integer> {

}
