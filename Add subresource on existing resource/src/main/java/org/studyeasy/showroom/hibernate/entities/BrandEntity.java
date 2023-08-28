package org.studyeasy.showroom.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="brands")
@Table(name="brands")
public class BrandEntity {
	@Id
	@Column(name="brandId")
	int brandId;
	
	@Column(name="brandName")
	String brandName;
	
	public BrandEntity() {
		
	}

	public BrandEntity(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
