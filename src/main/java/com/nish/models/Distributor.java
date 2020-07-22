package com.nish.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Distributor {
	
	@Id
	@GeneratedValue(generator="userId")
	private int distributorId;
	
	private String distributorName;
	
	private String email;
	
	private String phoneNo;
	
	private String password;
	
	@OneToMany(mappedBy="distributor")
	@JsonBackReference(value = "dses")
	private List<DSE> dses;
	
	@OneToMany(mappedBy="distributor")
	private List<ProductDistributor> productDistributors;
	
	@OneToMany(mappedBy="distributor")
	private List<DistributorRecharge> distributorRecharges;
	
	public Distributor() {}

	public Distributor(int distributorId, String distributorName, String email, String phoneNo, String password,
			List<DSE> dses, List<ProductDistributor> productDistributors,
			List<DistributorRecharge> distributorRecharges) {
		super();
		this.distributorId = distributorId;
		this.distributorName = distributorName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.dses = dses;
		this.productDistributors = productDistributors;
		this.distributorRecharges = distributorRecharges;
	}

	public int getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<DSE> getDses() {
		return dses;
	}

	public void setDses(List<DSE> dses) {
		this.dses = dses;
	}

	public List<ProductDistributor> getProductDistributors() {
		return productDistributors;
	}

	public void setProductDistributors(List<ProductDistributor> productDistributors) {
		this.productDistributors = productDistributors;
	}

	public List<DistributorRecharge> getDistributorRecharges() {
		return distributorRecharges;
	}

	public void setDistributorRecharges(List<DistributorRecharge> distributorRecharges) {
		this.distributorRecharges = distributorRecharges;
	}

	@Override
	public String toString() {
		return "Distributor [distributorId=" + distributorId + ", distributorName=" + distributorName + ", email="
				+ email + ", phoneNo=" + phoneNo + ", password=" + password + ", dses=" + dses
				+ ", productDistributors=" + productDistributors + ", distributorRecharges=" + distributorRecharges
				+ "]";
	}

}
