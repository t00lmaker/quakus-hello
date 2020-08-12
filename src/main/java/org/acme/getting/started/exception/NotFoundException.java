package org.acme.getting.started.exception;

import java.io.Serializable;

import javax.ws.rs.core.Response.Status;

public class NotFoundException extends StatusException implements Serializable{
	
	private static final long serialVersionUID = 8192175281665740859L;

	public NotFoundException() {
        super();
    }
    public NotFoundException(String msg)   {
        super(msg);
    }
    public NotFoundException(String msg, Exception e)  {
        super(msg, e);
    }
    
    @Override
    public Status getStatus() {
    	return Status.NOT_FOUND;
    }
}
