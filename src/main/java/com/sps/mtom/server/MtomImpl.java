package com.sps.mtom.server;

import java.io.File;
import java.io.FileOutputStream;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

import com.sps.ws.mtom.AttachmentType;

@MTOM
@WebService(serviceName = "MTOM", 
	portName = "MtomSOAP", 
	targetNamespace = "http://ws.sps.com/wsdl/Mtom/", 
	endpointInterface = "com.sps.ws.wsdl.mtom.MtomPort", 
	wsdlLocation = "Mtom.wsdl")
public class MtomImpl {

	@WebMethod
	public String transferFile(AttachmentType request) throws Exception {
		try {
			DataHandler dh = request.getBinaryData();
			File file = new File(request.getFileName());

			FileOutputStream fileOutputStream = new FileOutputStream(file);
			dh.writeTo(fileOutputStream);
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (Exception e) {
			throw new Exception();
		}
		return "File has been trasferred successfully.";
	}
}
