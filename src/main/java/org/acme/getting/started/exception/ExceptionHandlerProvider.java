package org.acme.getting.started.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionHandlerProvider implements ExceptionMapper<StatusException> {
	
	@Override
	public Response toResponse(StatusException exception) {
		
		exception.printStackTrace();
		
		return Response
					.status(exception.getStatus())
					.entity(exception.getMessage())
					.build();  
	}
}
