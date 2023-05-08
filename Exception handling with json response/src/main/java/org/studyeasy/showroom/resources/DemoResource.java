package org.studyeasy.showroom.resources;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.studyeasy.showroom.model.ErrorPayload;

@Path("/")
public class DemoResource {
	
	@Context
	private UriInfo uriInfo;
	
	@Context
	private ServletContext servletContext;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations() {
		return "Hello Jas-rs";
	}
	
   @GET
   @Path("/demo")
   @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
   public String contextDemo(@HeaderParam("header") String header) throws Exception {
	   ErrorPayload error = new ErrorPayload(404, "The value of custom header not found");
	   Response response = Response.status(404).entity(error).build();
	   if(header == null) {
		   throw new WebApplicationException(response);
	   }
	   return "The value of custom header value is : "+header;
   }
	

}






