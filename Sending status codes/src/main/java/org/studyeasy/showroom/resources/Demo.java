package org.studyeasy.showroom.resources;

import javax.servlet.ServletContext;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class Demo {
	
	@Context
	private UriInfo uriInfo;
	
	@Context
	private ServletContext servletContext;
	
	@GET
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerAttrib,
			@CookieParam("_xsrf") String xsrf) {
		
		return "Header Value: "+headerAttrib+ "  Cookie _xsrf value: "+xsrf;
	}
	
   @GET
   @Path("demo")
   public String contextDemo(@Context HttpHeaders header) {
	   return header.getRequestHeaders().keySet().toString();
	  // return "Absolute Path: "+uriInfo.getAbsolutePath().toString();
	   
   }
	

}






