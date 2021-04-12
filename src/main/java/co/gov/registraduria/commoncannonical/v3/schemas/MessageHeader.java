
package co.gov.registraduria.commoncannonical.v3.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageKey" type="{http://registraduria.gov.co/commoncannonical/v3/schemas}MessageKey" minOccurs="0"/&gt;
 *         &lt;element name="MessageInfo" type="{http://registraduria.gov.co/commoncannonical/v3/schemas}MessageInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", propOrder = {
    "messageKey",
    "messageInfo"
})
public class MessageHeader {

    @XmlElement(name = "MessageKey")
    protected MessageKey messageKey;
    @XmlElement(name = "MessageInfo")
    protected MessageInfo messageInfo;

    /**
     * Obtiene el valor de la propiedad messageKey.
     * 
     * @return
     *     possible object is
     *     {@link MessageKey }
     *     
     */
    public MessageKey getMessageKey() {
        return messageKey;
    }

    /**
     * Define el valor de la propiedad messageKey.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageKey }
     *     
     */
    public void setMessageKey(MessageKey value) {
        this.messageKey = value;
    }

    /**
     * Obtiene el valor de la propiedad messageInfo.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfo }
     *     
     */
    public MessageInfo getMessageInfo() {
        return messageInfo;
    }

    /**
     * Define el valor de la propiedad messageInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfo }
     *     
     */
    public void setMessageInfo(MessageInfo value) {
        this.messageInfo = value;
    }

}
