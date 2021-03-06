
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
 *         &lt;element name="ftToInReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "ftToInReturn"
})
@XmlRootElement(name = "ftToInResponse")
public class FtToInResponse {

    protected double ftToInReturn;

    /**
     * Gets the value of the ftToInReturn property.
     * 
     */
    public double getFtToInReturn() {
        return ftToInReturn;
    }

    /**
     * Sets the value of the ftToInReturn property.
     * 
     */
    public void setFtToInReturn(double value) {
        this.ftToInReturn = value;
    }

}
