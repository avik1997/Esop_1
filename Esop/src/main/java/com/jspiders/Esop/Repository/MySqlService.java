package com.jspiders.Esop.Repository;

import org.springframework.stereotype.Repository;

import com.jspiders.Esop.Dto.AllocationDto;

@Repository
public interface MySqlService {
	
	
	public AllocationDto getAllocationSum();

}
