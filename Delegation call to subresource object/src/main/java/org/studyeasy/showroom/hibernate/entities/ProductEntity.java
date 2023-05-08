package org.studyeasy.showroom.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="products")
@Table(name="products")
public class ProductEntity {
	
	@Id
	@Column(name="productId")
	int productId;
	
	@ManyToOne(targetEntity = BrandEntity.class)
	@JoinColumn(name="brandId")
	//@Column(name="brandId")
	BrandEntity brandEntity;
	
	@Column(name="productName")
	String productName;
	
	@Column(name="category")
	String category;
	
	@Column(name="cost")
	String cost;

	public ProductEntity() {}
	
	public ProductEntity(int productId, String productName, String category, String cost) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.cost = cost;
	}

	public ProductEntity(int productId, BrandEntity brandEntity, String productName, String category, String cost) {
		this.productId = productId;
		this.brandEntity = brandEntity;
		this.productName = productName;
		this.category = category;
		this.cost = cost;
	}


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public BrandEntity getBrandEntity() {
		return brandEntity;
	}

	public void setBrandEntity(BrandEntity brandEntity) {
		this.brandEntity = brandEntity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}	
}
