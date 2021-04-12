
package co.gov.registraduria.commoncannonical.v3.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentStatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userFolder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="internalFileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatus", propOrder = {
    "documentStatusCode",
    "userFolder",
    "internalFileName",
    "fileName",
    "token"
})
public class DocumentStatus {

    @XmlElement(name = "DocumentStatusCode")
    protected int documentStatusCode;
    @XmlElement(required = true)
    protected String userFolder;
    @XmlElement(required = true)
    protected String internalFileName;
    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(name = "Token", required = true)
    protected String token;

    /**
     * Obtiene el valor de la propiedad documentStatusCode.
     * 
     */
    public int getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * Define el valor de la propiedad documentStatusCode.
     * 
     */
    public void setDocumentStatusCode(int value) {
        this.documentStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad userFolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFolder() {
        return userFolder;
    }

    /**
     * Define el valor de la propiedad userFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFolder(String value) {
        this.userFolder = value;
    }

    /**
     * Obtiene el valor de la propiedad internalFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalFileName() {
        return internalFileName;
    }

    /**
     * Define el valor de la propiedad internalFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalFileName(String value) {
        this.internalFileName = value;
    }

    /**
     * Obtiene el valor de la propiedad fileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
