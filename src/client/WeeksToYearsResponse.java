
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
 *         &lt;element name="weeksToYearsReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "weeksToYearsReturn"
})
@XmlRootElement(name = "weeksToYearsResponse")
public class WeeksToYearsResponse {

    protected double weeksToYearsReturn;

    /**
     * Gets the value of the weeksToYearsReturn property.
     * 
     */
    public double getWeeksToYearsReturn() {
        return weeksToYearsReturn;
    }

    /**
     * Sets the value of the weeksToYearsReturn property.
     * 
     */
    public void setWeeksToYearsReturn(double value) {
        this.weeksToYearsReturn = value;
    }

}
