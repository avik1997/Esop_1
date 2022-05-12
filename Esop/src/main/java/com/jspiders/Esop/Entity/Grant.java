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
@Table(name="grant_details")
public class Grant implements Serializable {
	
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="grant_number")
	private String grantNumber;

	@Column(name="no_of_grants")
	private String noOfGrants;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="plan_id")
	private Plan plan;

	@Column(name="grant_date")
	private Date grantDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Employee employee;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="granted_by_id")
	private Employee grantedBy;

	@Column(name="grant_status")
	private String grantStatus;

	@Column(name="accepted")
	private boolean accepted;

	@Column(name="accepted_date")
	private Date acceptedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Date getGrantDate() {
		return grantDate;
	}

	public void setGrantDate(Date grantDate) {
		this.grantDate = grantDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getGrantedBy() {
		return grantedBy;
	}

	public void setGrantedBy(Employee grantedBy) {
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
		return "Grant [id=" + id + ", grantNumber=" + grantNumber + ", noOfGrants=" + noOfGrants + ", plan=" + plan
				+ ", grantDate=" + grantDate + ", employee=" + employee + ", grantedBy=" + grantedBy + ", grantStatus="
				+ grantStatus + ", accepted=" + accepted + ", acceptedDate=" + acceptedDate + "]";
	}


	
}
