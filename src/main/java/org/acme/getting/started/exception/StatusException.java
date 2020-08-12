package org.acme.getting.started.exception;

import javax.ws.rs.core.Response.Status;

public class StatusException extends Exception {
	
	private static final long serialVersionUID = 3412244979624713601L;

	public StatusException() {
        super();
    }
    public StatusException(String msg)   {
        super(msg);
    }
    public StatusException(String msg, Exception e)  {
        super(msg, e);
    }
    
    public Status getStatus() {
    	return Status.INTERNAL_SERVER_ERROR;
    }
}
