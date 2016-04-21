
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
 *         &lt;element name="monthsToDaysReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "monthsToDaysReturn"
})
@XmlRootElement(name = "monthsToDaysResponse")
public class MonthsToDaysResponse {

    protected double monthsToDaysReturn;

    /**
     * Gets the value of the monthsToDaysReturn property.
     * 
     */
    public double getMonthsToDaysReturn() {
        return monthsToDaysReturn;
    }

    /**
     * Sets the value of the monthsToDaysReturn property.
     * 
     */
    public void setMonthsToDaysReturn(double value) {
        this.monthsToDaysReturn = value;
    }

}
