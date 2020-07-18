package com.nish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nish.models.Shop;

public interface ShopRepository extends JpaRepository<Shop,Integer> {

}
