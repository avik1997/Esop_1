package com.jspiders.Esop.Dto;

import java.io.Serializable;

public class AllocationDto implements Serializable {
	
	private Long id;
	
	private Long grantedBy;
	
	private String grantAllocations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGrantedById() {
		return grantedById;
	}

	public void setGrantedById(Long grantedById) {
		this.grantedById = grantedById;
	}

	public String getGrantAllocations() {
		return grantAllocations;
	}

	public void setGrantAllocations(String grantAllocations) {
		this.grantAllocations = grantAllocations;
	}

	@Override
	public String toString() {
		return "AllocationDto [id=" + id + ", grantedById=" + grantedById + ", grantAllocations=" + grantAllocations
				+ "]";
	}
	
	
	
}
