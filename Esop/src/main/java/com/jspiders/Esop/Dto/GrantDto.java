package com.jspiders.Esop.Dto;

import java.io.Serializable;
import java.util.Date;



public class GrantDto implements Serializable {
	

	private String grantNumber;

	
	private String noOfGrants;
	

	private String plan;


	private Date grantDate;
	
	
	private String employee;

	
	private String grantedBy;

	
	private String grantStatus;


	private boolean accepted;

	
	private Date acceptedDate;


	public String getGrantNumber() {
		return grantNumber;
	}


	public void setGrantNumber(String grantNumber) {
		this.grantNumber = grantNumber;
	}


	public String getNoOfGrants() {
		return noOfGrants;
	}


	public void setNoOfGrants(String noOfGrants) {
		this.noOfGrants = noOfGrants;
	}


	public String getPlan() {
		return plan;
	}


	public void setPlan(String plan) {
		this.plan = plan;
	}


	public Date getGrantDate() {
		return grantDate;
	}


	public void setGrantDate(Date grantDate) {
		this.grantDate = grantDate;
	}


	public String getEmployee() {
		return employee;
	}


	public void setEmployee(String employee) {
		this.employee = employee;
	}


	public String getGrantedBy() {
		return grantedBy;
	}


	public void setGrantedBy(String grantedBy) {
		this.grantedBy = grantedBy;
	}


	public String getGrantStatus() {
		return grantStatus;
	}


	public void setGrantStatus(String grantStatus) {
		this.grantStatus = grantStatus;
	}


	public boolean isAccepted() {
		return accepted;
	}


	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}


	public Date getAcceptedDate() {
		return acceptedDate;
	}


	public void setAcceptedDate(Date acceptedDate) {
		this.acceptedDate = acceptedDate;
	}


	@Override
	public String toString() {
		return "GrantDto [grantNumber=" + grantNumber + ", noOfGrants=" + noOfGrants + ", plan=" + plan + ", grantDate="
				+ grantDate + ", employee=" + employee + ", grantedBy=" + grantedBy + ", grantStatus=" + grantStatus
				+ ", accepted=" + accepted + ", acceptedDate=" + acceptedDate + "]";
	}

	
	
}
