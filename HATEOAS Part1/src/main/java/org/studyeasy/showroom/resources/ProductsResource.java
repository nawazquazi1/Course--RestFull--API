package org.studyeasy.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.studyeasy.showroom.model.Product;
import org.studyeasy.showroom.services.ProductsService;

@Path("/showroom/brands")
public class ProductsResource {

	ProductsService productsService = new ProductsService();

	@GET
	@Path("/{brandId}/products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductsByBrand(@PathParam("brandId") int brandId,
			@QueryParam("category") String category, @QueryParam("start") int start, 
			@QueryParam("end") int end) {

		List<Product> ProductList;
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
