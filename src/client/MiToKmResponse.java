
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
 *         &lt;element name="miToKmReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "miToKmReturn"
})
@XmlRootElement(name = "miToKmResponse")
public class MiToKmResponse {

    protected double miToKmReturn;

    /**
     * Gets the value of the miToKmReturn property.
     * 
     */
    public double getMiToKmReturn() {
        return miToKmReturn;
    }

    /**
     * Sets the value of the miToKmReturn property.
     * 
     */
    public void setMiToKmReturn(double value) {
        this.miToKmReturn = value;
    }

}
