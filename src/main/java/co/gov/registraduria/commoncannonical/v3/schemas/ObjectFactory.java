
package co.gov.registraduria.commoncannonical.v3.schemas;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.registraduria.commoncannonical.v3.schemas package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.registraduria.commoncannonical.v3.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerStatusRq }
     * 
     */
    public GetCustomerStatusRq createGetCustomerStatusRq() {
        return new GetCustomerStatusRq();
    }

    /**
     * Create an instance of {@link HeaderRequest }
     * 
     */
    public HeaderRequest createHeaderRequest() {
        return new HeaderRequest();
    }

    /**
     * Create an instance of {@link IssuedIdent }
     * 
     */
    public IssuedIdent createIssuedIdent() {
        return new IssuedIdent();
    }

    /**
     * Create an instance of {@link GetCustomerStatusRs }
     * 
     */
    public GetCustomerStatusRs createGetCustomerStatusRs() {
        return new GetCustomerStatusRs();
    }

    /**
     * Create an instance of {@link HeaderResponse }
     * 
     */
    public HeaderResponse createHeaderResponse() {
        return new HeaderResponse();
    }

    /**
     * Create an instance of {@link DocumentStatus }
     * 
     */
    public DocumentStatus createDocumentStatus() {
        return new DocumentStatus();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link MessageKey }
     * 
     */
    public MessageKey createMessageKey() {
        return new MessageKey();
    }

    /**
     * Create an instance of {@link MessageInfo }
     * 
     */
    public MessageInfo createMessageInfo() {
        return new MessageInfo();
    }

}
