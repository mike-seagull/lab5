
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
 *         &lt;element name="ftToMiReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "ftToMiReturn"
})
@XmlRootElement(name = "ftToMiResponse")
public class FtToMiResponse {

    protected double ftToMiReturn;

    /**
     * Gets the value of the ftToMiReturn property.
     * 
     */
    public double getFtToMiReturn() {
        return ftToMiReturn;
    }

    /**
     * Sets the value of the ftToMiReturn property.
     * 
     */
    public void setFtToMiReturn(double value) {
        this.ftToMiReturn = value;
    }

}
