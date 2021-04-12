
package co.gov.registraduria.commoncannonical.v3.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HeaderResponse" type="{http://registraduria.gov.co/commoncannonical/v3/schemas}HeaderResponse"/&gt;
 *         &lt;element name="DocumentStatus" type="{http://registraduria.gov.co/commoncannonical/v3/schemas}DocumentStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerResponse",
    "documentStatus"
})
@XmlRootElement(name = "getCustomerStatusRs")
public class GetCustomerStatusRs {

    @XmlElement(name = "HeaderResponse", required = true)
    protected HeaderResponse headerResponse;
    @XmlElement(name = "DocumentStatus", required = true)
    protected DocumentStatus documentStatus;

    /**
     * Obtiene el valor de la propiedad headerResponse.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResponse }
     *     
     */
    public HeaderResponse getHeaderResponse() {
        return headerResponse;
    }

    /**
     * Define el valor de la propiedad headerResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResponse }
     *     
     */
    public void setHeaderResponse(HeaderResponse value) {
        this.headerResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad documentStatus.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatus }
     *     
     */
    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Define el valor de la propiedad documentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatus }
     *     
     */
    public void setDocumentStatus(DocumentStatus value) {
        this.documentStatus = value;
    }

}
