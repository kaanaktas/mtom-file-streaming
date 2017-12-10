
package com.sps.ws.mtom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sps.ws.mtom package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransferResponse_QNAME = new QName("http://ws.sps.com/mtom/", "TransferResponse");
    private final static QName _TransferRequest_QNAME = new QName("http://ws.sps.com/mtom/", "TransferRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sps.ws.mtom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sps.com/mtom/", name = "TransferResponse")
    public JAXBElement<String> createTransferResponse(String value) {
        return new JAXBElement<String>(_TransferResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sps.com/mtom/", name = "TransferRequest")
    public JAXBElement<AttachmentType> createTransferRequest(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_TransferRequest_QNAME, AttachmentType.class, null, value);
    }

}
