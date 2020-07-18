package com.nish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nish.models.ProductDistributor;
import com.nish.models.ProductDistributorId;

public interface ProductDistributorRepository extends JpaRepository<ProductDistributor,ProductDistributorId> {

}
