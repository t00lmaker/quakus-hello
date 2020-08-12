package org.acme.getting.started.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.getting.started.model.Delivery;
import org.acme.getting.started.model.ResquestDelivery;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

@Path("/upload")
public class DeliveryController {

    @POST
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes({MediaType.MULTIPART_FORM_DATA})
	public Delivery upload(@MultipartForm  ResquestDelivery delivery) {
    	try {
			delivery(delivery.getFile(), delivery.getFilename());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Delivery();
	}
    
    private void delivery(byte[] content, String filename) throws IOException {

		String pathname = "/home/luan/"+filename;
		File file = new File(pathname);

		if (!file.exists()) {
			file.createNewFile();
			System.out.println("arquivo criado em "+pathname);
		}

		FileOutputStream fop = new FileOutputStream(file);

		fop.write(content);
		fop.flush();
		fop.close();

	}
	
	
}
