package org.studyeasy.showroom.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.studyeasy.showroom.model.ErrorPayload;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		ErrorPayload error = new ErrorPayload(500, "Internal server error");
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
	}

}
