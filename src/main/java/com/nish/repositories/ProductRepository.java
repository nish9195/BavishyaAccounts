package com.nish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nish.models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
