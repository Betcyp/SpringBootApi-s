package com.npci.SpringBootApi.dto;

public class ProductDto {
	
	private Long id;
	private String productName;
	private String productVersion;
	//private long userId;
	private String banks;
	
	public ProductDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public String getBanks() {
		return banks;
	}

	public void setBanks(String banks) {
		this.banks = banks;
	}
	
	/*public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}*/
	
	
}
