package com.jspiders.Esop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.Esop.Entity.AllocationClass;
@Repository
public interface AllocationRepository extends JpaRepository<AllocationClass, Long> {
	
	

}
