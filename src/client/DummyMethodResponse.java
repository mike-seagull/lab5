
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dummyMethodReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dummyMethodReturn"
})
@XmlRootElement(name = "dummyMethodResponse")
public class DummyMethodResponse {

    @XmlElement(required = true)
    protected String dummyMethodReturn;

    /**
     * Gets the value of the dummyMethodReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDummyMethodReturn() {
        return dummyMethodReturn;
    }

    /**
     * Sets the value of the dummyMethodReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDummyMethodReturn(String value) {
        this.dummyMethodReturn = value;
    }

}
