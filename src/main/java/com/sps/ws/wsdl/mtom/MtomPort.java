
package com.sps.ws.wsdl.mtom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.sps.ws.mtom.AttachmentType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MtomPort", targetNamespace = "http://ws.sps.com/wsdl/Mtom/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.sps.ws.mtom.ObjectFactory.class,
    org.w3._2005._05.xmlmime.ObjectFactory.class
})
public interface MtomPort {


    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "transferFile")
    @WebResult(name = "TransferResponse", targetNamespace = "http://ws.sps.com/mtom/", partName = "Response")
    public String transferFile(
        @WebParam(name = "TransferRequest", targetNamespace = "http://ws.sps.com/mtom/", partName = "Request")
        AttachmentType request);

}