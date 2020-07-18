package com.nish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nish.models.ProductDSE;
import com.nish.models.ProductDSEId;

public interface ProductDSERepository extends JpaRepository<ProductDSE,ProductDSEId> {

}
