
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
 *         &lt;element name="daysToMonthsReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "daysToMonthsReturn"
})
@XmlRootElement(name = "daysToMonthsResponse")
public class DaysToMonthsResponse {

    protected double daysToMonthsReturn;

    /**
     * Gets the value of the daysToMonthsReturn property.
     * 
     */
    public double getDaysToMonthsReturn() {
        return daysToMonthsReturn;
    }

    /**
     * Sets the value of the daysToMonthsReturn property.
     * 
     */
    public void setDaysToMonthsReturn(double value) {
        this.daysToMonthsReturn = value;
    }

}
