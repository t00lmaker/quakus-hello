package org.acme.getting.started.exception;

import java.io.Serializable;

import javax.ws.rs.core.Response.Status;

public class BadRequestException extends StatusException implements Serializable{

	private static final long serialVersionUID = -8876058608382464468L;

    public BadRequestException() {
        super();
    }
    public BadRequestException(String msg)   {
        super(msg);
    }
    public BadRequestException(String msg, Exception e)  {
        super(msg, e);
    }
    
    @Override
    public Status getStatus() {
    	return Status.BAD_REQUEST;
    }
}
