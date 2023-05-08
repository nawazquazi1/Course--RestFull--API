package org.studyeasy.showroom.resources;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Demo {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerAttrib,
			@CookieParam("_xsrf") String xsrf) {
		
		return "Header Value: "+headerAttrib+ "  Cookie _xsrf value: "+xsrf;
	}

}
