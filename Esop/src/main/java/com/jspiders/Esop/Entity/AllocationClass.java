package com.jspiders.Esop.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="allocation_class")
public class AllocationClass implements Serializable {


	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long Id;
	
	@Column(name="allocated_date")
	private Date allocatedDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="garant_id")
	private Grant grant;
	
	@Column(name="grant_allocation")
	private String grantAllocation;
	
	
	
	@Column(name="status")
	private String status;
	
	@Column(name="allocated_year")
	private String allocatedYear;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Date getAllocatedDate() {
		return allocatedDate;
	}

	public void setAllocatedDate(Date allocatedDate) {
		this.allocatedDate = allocatedDate;
	}

	public Grant getGrant() {
		return grant;
	}

	public void setGrant(Grant grant) {
		this.grant = grant;
	}

	public String getGrantAllocation() {
		return grantAllocation;
	}

	public void setGrantAllocation(String grantAllocation) {
		this.grantAllocation = grantAllocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAllocatedYear() {
		return allocatedYear;
	}

	public void setAllocatedYear(String allocatedYear) {
		this.allocatedYear = allocatedYear;
	}

	@Override
	public String toString() {
		return "AllocationClass [Id=" + Id + ", allocatedDate=" + allocatedDate + ", grant=" + grant
				+ ", grantAllocation=" + grantAllocation + ", status=" + status + ", allocatedYear=" + allocatedYear
				+ "]";
	}



}
