package com.npci.SpringBootApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK")
public class Bank {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "BANK_NAME", nullable=false)
	private String bankName;
	
	@Column(name = "IFSC_Code", nullable=false)
	private String ifscCode;
	
	@Column(name = "BRANCH_NAME", nullable=false)
	private String branchName;
	
	@Column(name = "TYPE_OF_THE_BANK", nullable=false)
	private String typeOfTheBank;

	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankName=" + bankName + ", ifscCode=" + ifscCode + ", branchName=" + branchName
				+ ", typeOfTheBank=" + typeOfTheBank + "]";
	}

	public Bank(long id, String bankName, String ifscCode, String branchName, String typeOfTheBank) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.branchName = branchName;
		this.typeOfTheBank = typeOfTheBank;
	}

	public Bank() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getTypeOfTheBank() {
		return typeOfTheBank;
	}

	public void setTypeOfTheBank(String typeOfTheBank) {
		this.typeOfTheBank = typeOfTheBank;
	}
	
}
