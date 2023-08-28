package org.studyeasy.showroom.resources;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	@GET
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "list of brands";
	}

	@POST
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String postBrands() {
		return "Add a new brand";
	}
	
	@PUT
	@Path("/brands/{brandId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String putBrands(@PathParam("brandId")  int brandId) {
		return "update brand info with ID "+brandId;
	}
	
	@DELETE
	@Path("/brands/{brandId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteBrands(@PathParam("brandId") int brandId) {
		return "delete brand from db with ID "+brandId;
	}

}
