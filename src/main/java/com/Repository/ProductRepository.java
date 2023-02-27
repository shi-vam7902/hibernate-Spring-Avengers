package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
