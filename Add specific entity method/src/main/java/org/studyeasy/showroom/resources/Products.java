package org.studyeasy.showroom.resources;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import org.studyeasy.showroom.hibernate.entities.ProductEntity;
import org.studyeasy.showroom.services.ProductsService;

@Path("/showroom/brands")
public class Products {

	ProductsService productsService = new ProductsService();

	@GET
	@Path("/{brandId}/products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductsByBrand(@PathParam("brandId") int brandId,
			@QueryParam("category") String category, @QueryParam("start") int start, 
			@QueryParam("end") int end) {

		List<ProductEntity> ProductList;
		if (category != null) {
			ProductList = productsService.getProductsByBrandAndCategory(brandId, category);	
		} else {
			ProductList = productsService.getProductsByBrand(brandId);
		}
		if(end > 0) {
			ProductList = ProductList.subList(start, end);
		}
		return ProductList;
	}

}
