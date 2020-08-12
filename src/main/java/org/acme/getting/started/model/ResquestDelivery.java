package org.acme.getting.started.model;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class ResquestDelivery {

    @FormParam("json")
    @PartType(MediaType.TEXT_PLAIN)
	private String jsonParams;

    @FormParam("filename")
    @PartType(MediaType.TEXT_PLAIN)
	private String filename;
    
	@FormParam("file")
	@PartType(MediaType.APPLICATION_OCTET_STREAM)
	private byte[] file;
	

	public String getJsonParams() {
		return jsonParams;
	}

	public void setJsonParams(String jsonParams) {
		this.jsonParams = jsonParams;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
