
package co.gov.registraduria.commoncannonical.v3.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageKey complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MessageKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestUUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageKey", propOrder = {
    "requestVersion",
    "requestUUID"
})
public class MessageKey {

    protected String requestVersion;
    @XmlElement(required = true)
    protected String requestUUID;

    /**
     * Obtiene el valor de la propiedad requestVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestVersion() {
        return requestVersion;
    }

    /**
     * Define el valor de la propiedad requestVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestVersion(String value) {
        this.requestVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad requestUUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestUUID() {
        return requestUUID;
    }

    /**
     * Define el valor de la propiedad requestUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestUUID(String value) {
        this.requestUUID = value;
    }

}
