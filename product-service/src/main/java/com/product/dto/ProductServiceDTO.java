package com.product.dto;

public class ProductServiceDTO {

	private String productName;
	private String productType;
	private String productPrice;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductServiceDTO [productName=" + productName + ", productType=" + productType + ", productPrice="
				+ productPrice + "]";
	}

}
