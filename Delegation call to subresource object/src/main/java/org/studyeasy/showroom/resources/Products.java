package org.studyeasy.showroom.resources;

import java.util.List;


import org.studyeasy.showroom.hibernate.entities.ProductEntity;
import org.studyeasy.showroom.services.ProductsService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//@Path("/showroom/brands")
public class Products {
	ProductsService productsService = new ProductsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductsByBrand(@PathParam("brandId") int brandId) {
		List<ProductEntity> productList = productsService.getProductsByBrand(brandId);
		return productList;
	}
}