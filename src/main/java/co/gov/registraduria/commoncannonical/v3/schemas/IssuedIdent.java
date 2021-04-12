
package co.gov.registraduria.commoncannonical.v3.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IssuedIdent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IssuedIdent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issuedIdentType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="issuedIdentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedIdent", propOrder = {
    "issuedIdentType",
    "issuedIdentValue"
})
public class IssuedIdent {

    protected int issuedIdentType;
    @XmlElement(required = true)
    protected String issuedIdentValue;

    /**
     * Obtiene el valor de la propiedad issuedIdentType.
     * 
     */
    public int getIssuedIdentType() {
        return issuedIdentType;
    }

    /**
     * Define el valor de la propiedad issuedIdentType.
     * 
     */
    public void setIssuedIdentType(int value) {
        this.issuedIdentType = value;
    }

    /**
     * Obtiene el valor de la propiedad issuedIdentValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentValue() {
        return issuedIdentValue;
    }

    /**
     * Define el valor de la propiedad issuedIdentValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentValue(String value) {
        this.issuedIdentValue = value;
    }

}
