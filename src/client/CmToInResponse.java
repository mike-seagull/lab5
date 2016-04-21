
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
 *         &lt;element name="cmToInReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "cmToInReturn"
})
@XmlRootElement(name = "cmToInResponse")
public class CmToInResponse {

    protected double cmToInReturn;

    /**
     * Gets the value of the cmToInReturn property.
     * 
     */
    public double getCmToInReturn() {
        return cmToInReturn;
    }

    /**
     * Sets the value of the cmToInReturn property.
     * 
     */
    public void setCmToInReturn(double value) {
        this.cmToInReturn = value;
    }

}
