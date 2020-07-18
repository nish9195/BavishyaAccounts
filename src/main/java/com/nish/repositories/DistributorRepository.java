package com.nish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nish.models.Distributor;

public interface DistributorRepository extends JpaRepository<Distributor,Integer> {

}
