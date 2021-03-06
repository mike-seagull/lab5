
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Soap", targetNamespace = "http://lab5")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Soap {


    /**
     * 
     * @param cm
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "cmToInReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "cmToIn", targetNamespace = "http://lab5", className = "client.CmToIn")
    @ResponseWrapper(localName = "cmToInResponse", targetNamespace = "http://lab5", className = "client.CmToInResponse")
    public double cmToIn(
        @WebParam(name = "cm", targetNamespace = "http://lab5")
        double cm);

    /**
     * 
     * @param km
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "kmToMiReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "kmToMi", targetNamespace = "http://lab5", className = "client.KmToMi")
    @ResponseWrapper(localName = "kmToMiResponse", targetNamespace = "http://lab5", className = "client.KmToMiResponse")
    public double kmToMi(
        @WebParam(name = "km", targetNamespace = "http://lab5")
        double km);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "dummyMethodReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "dummyMethod", targetNamespace = "http://lab5", className = "client.DummyMethod")
    @ResponseWrapper(localName = "dummyMethodResponse", targetNamespace = "http://lab5", className = "client.DummyMethodResponse")
    public String dummyMethod();

    /**
     * 
     * @param ft
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "ftToMiReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "ftToMi", targetNamespace = "http://lab5", className = "client.FtToMi")
    @ResponseWrapper(localName = "ftToMiResponse", targetNamespace = "http://lab5", className = "client.FtToMiResponse")
    public double ftToMi(
        @WebParam(name = "ft", targetNamespace = "http://lab5")
        double ft);

    /**
     * 
     * @param mi
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "miToFtReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "miToFt", targetNamespace = "http://lab5", className = "client.MiToFt")
    @ResponseWrapper(localName = "miToFtResponse", targetNamespace = "http://lab5", className = "client.MiToFtResponse")
    public double miToFt(
        @WebParam(name = "mi", targetNamespace = "http://lab5")
        double mi);

    /**
     * 
     * @param ft
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "ftToInReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "ftToIn", targetNamespace = "http://lab5", className = "client.FtToIn")
    @ResponseWrapper(localName = "ftToInResponse", targetNamespace = "http://lab5", className = "client.FtToInResponse")
    public double ftToIn(
        @WebParam(name = "ft", targetNamespace = "http://lab5")
        double ft);

    /**
     * 
     * @param in
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "inToFtReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "inToFt", targetNamespace = "http://lab5", className = "client.InToFt")
    @ResponseWrapper(localName = "inToFtResponse", targetNamespace = "http://lab5", className = "client.InToFtResponse")
    public double inToFt(
        @WebParam(name = "in", targetNamespace = "http://lab5")
        double in);

    /**
     * 
     * @param ft
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "ftToMReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "ftToM", targetNamespace = "http://lab5", className = "client.FtToM")
    @ResponseWrapper(localName = "ftToMResponse", targetNamespace = "http://lab5", className = "client.FtToMResponse")
    public double ftToM(
        @WebParam(name = "ft", targetNamespace = "http://lab5")
        double ft);

    /**
     * 
     * @param m
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "mToFtReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "mToFt", targetNamespace = "http://lab5", className = "client.MToFt")
    @ResponseWrapper(localName = "mToFtResponse", targetNamespace = "http://lab5", className = "client.MToFtResponse")
    public double mToFt(
        @WebParam(name = "m", targetNamespace = "http://lab5")
        double m);

    /**
     * 
     * @param days
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "daysToMonthsReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "daysToMonths", targetNamespace = "http://lab5", className = "client.DaysToMonths")
    @ResponseWrapper(localName = "daysToMonthsResponse", targetNamespace = "http://lab5", className = "client.DaysToMonthsResponse")
    public double daysToMonths(
        @WebParam(name = "days", targetNamespace = "http://lab5")
        double days);

    /**
     * 
     * @param months
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "monthsToDaysReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "monthsToDays", targetNamespace = "http://lab5", className = "client.MonthsToDays")
    @ResponseWrapper(localName = "monthsToDaysResponse", targetNamespace = "http://lab5", className = "client.MonthsToDaysResponse")
    public double monthsToDays(
        @WebParam(name = "months", targetNamespace = "http://lab5")
        double months);

    /**
     * 
     * @param mi
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "miToKmReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "miToKm", targetNamespace = "http://lab5", className = "client.MiToKm")
    @ResponseWrapper(localName = "miToKmResponse", targetNamespace = "http://lab5", className = "client.MiToKmResponse")
    public double miToKm(
        @WebParam(name = "mi", targetNamespace = "http://lab5")
        double mi);

    /**
     * 
     * @param weeks
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "weeksToYearsReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "weeksToYears", targetNamespace = "http://lab5", className = "client.WeeksToYears")
    @ResponseWrapper(localName = "weeksToYearsResponse", targetNamespace = "http://lab5", className = "client.WeeksToYearsResponse")
    public double weeksToYears(
        @WebParam(name = "weeks", targetNamespace = "http://lab5")
        double weeks);

    /**
     * 
     * @param inches
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "inToCmReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "inToCm", targetNamespace = "http://lab5", className = "client.InToCm")
    @ResponseWrapper(localName = "inToCmResponse", targetNamespace = "http://lab5", className = "client.InToCmResponse")
    public double inToCm(
        @WebParam(name = "inches", targetNamespace = "http://lab5")
        double inches);

    /**
     * 
     * @param years
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "yearsToWeeksReturn", targetNamespace = "http://lab5")
    @RequestWrapper(localName = "yearsToWeeks", targetNamespace = "http://lab5", className = "client.YearsToWeeks")
    @ResponseWrapper(localName = "yearsToWeeksResponse", targetNamespace = "http://lab5", className = "client.YearsToWeeksResponse")
    public double yearsToWeeks(
        @WebParam(name = "years", targetNamespace = "http://lab5")
        double years);

}
