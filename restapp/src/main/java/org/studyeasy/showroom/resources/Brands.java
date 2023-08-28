package org.studyeasy.showroom.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	@GET
	@Path("/getBrands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "list of brands";
	}

	@POST
	@Path("/setBrand")
	@Produces(MediaType.TEXT_PLAIN)
	public String setBrands() {
		return "Add a new brand";
	}

}
