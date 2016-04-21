
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="convertInToCmReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "convertInToCmReturn"
})
@XmlRootElement(name = "convertInToCmResponse")
public class ConvertInToCmResponse {

    protected double convertInToCmReturn;

    /**
     * Gets the value of the convertInToCmReturn property.
     * 
     */
    public double getConvertInToCmReturn() {
        return convertInToCmReturn;
    }

    /**
     * Sets the value of the convertInToCmReturn property.
     * 
     */
    public void setConvertInToCmReturn(double value) {
        this.convertInToCmReturn = value;
    }

}
