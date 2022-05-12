package com.jspiders.Esop.Repository;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.jspiders.Esop.Dto.AllocationDto;

@Repository
public class MySqlImplementation implements MySqlService{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public AllocationDto getAllocationSum() {
		
		
	
	//AllocationDto forObject = jdbcTemplate.queryForObject("select Plan.id,Grant.grantedBy,AllocationClass.grantAllocation from springproject.plan join springproject.Grant on Plan.id=Grant.plan join springproject.AllocationClass on Grant.id=AllocationClass.grant",AllocationDto.class);
	AllocationDto forObject = jdbcTemplate.queryForObject("select springproject.plan_details.id,springproject.grant_details.granted_by_id,springproject.allocation_class.grant_allocation from springproject.plan_details join springproject.grant_details on plan_details.id=grant_details.plan_id join springproject.allocation_class on grant_details.id=allocation_class.garant_id",AllocationDto.class);
	
	System.out.println(forObject);
	
	return forObject;
	
	
	
	}

}
