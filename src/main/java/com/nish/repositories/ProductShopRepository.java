package com.nish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nish.models.ProductShop;
import com.nish.models.ProductShopId;

public interface ProductShopRepository extends JpaRepository<ProductShop,ProductShopId> {

}
