package com.sps.mtom.client;

import java.net.MalformedURLException;
import java.util.Map;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.MTOMFeature;

import com.sps.ws.mtom.AttachmentType;
import com.sps.ws.wsdl.mtom.MTOM;
import com.sps.ws.wsdl.mtom.MtomPort;
import com.sun.xml.internal.ws.developer.JAXWSProperties;

public class MtomClient {
	private static final String endpointAddress = "http://localhost:8080/MtomService";

	public static void main(String[] args) throws MalformedURLException {
		MTOM service = new MTOM();
		MTOMFeature feature = new MTOMFeature();

		MtomPort port = service.getMtomSOAP(feature);

		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointAddress);
		Map<String, Object> ctxt = bp.getRequestContext();
		ctxt.put(JAXWSProperties.HTTP_CLIENT_STREAMING_CHUNK_SIZE, 8192);

		DataHandler dh = new DataHandler(new FileDataSource("temp/source/file.txt"));

		AttachmentType request = new AttachmentType();
		request.setBinaryData(dh);
		request.setFileName("temp/upload/file.txt");
		String result = port.transferFile(request);
		System.out.println(result);
	}
}
