
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
 *         &lt;element name="HeaderRequest" type="{http://registraduria.gov.co/commoncannonical/v3/schemas}HeaderRequest"/&gt;
 *         &lt;element name="IssuedIdent" type="{http://registraduria.gov.co/commoncannonical/v3/schemas}IssuedIdent"/&gt;
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
    "headerRequest",
    "issuedIdent"
})
@XmlRootElement(name = "getCustomerStatusRq")
public class GetCustomerStatusRq {

    @XmlElement(name = "HeaderRequest", required = true)
    protected HeaderRequest headerRequest;
    @XmlElement(name = "IssuedIdent", required = true)
    protected IssuedIdent issuedIdent;

    /**
     * Obtiene el valor de la propiedad headerRequest.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRequest }
     *     
     */
    public HeaderRequest getHeaderRequest() {
        return headerRequest;
    }

    /**
     * Define el valor de la propiedad headerRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRequest }
     *     
     */
    public void setHeaderRequest(HeaderRequest value) {
        this.headerRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad issuedIdent.
     * 
     * @return
     *     possible object is
     *     {@link IssuedIdent }
     *     
     */
    public IssuedIdent getIssuedIdent() {
        return issuedIdent;
    }

    /**
     * Define el valor de la propiedad issuedIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuedIdent }
     *     
     */
    public void setIssuedIdent(IssuedIdent value) {
        this.issuedIdent = value;
    }

}
