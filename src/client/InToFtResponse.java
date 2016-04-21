
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
 *         &lt;element name="inToFtReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "inToFtReturn"
})
@XmlRootElement(name = "inToFtResponse")
public class InToFtResponse {

    protected double inToFtReturn;

    /**
     * Gets the value of the inToFtReturn property.
     * 
     */
    public double getInToFtReturn() {
        return inToFtReturn;
    }

    /**
     * Sets the value of the inToFtReturn property.
     * 
     */
    public void setInToFtReturn(double value) {
        this.inToFtReturn = value;
    }

}
