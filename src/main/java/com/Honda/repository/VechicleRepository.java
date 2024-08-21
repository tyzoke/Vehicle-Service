package com.Honda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Honda.entity.Vechicle;

public interface VechicleRepository extends JpaRepository<Vechicle, Long> {

	

}
