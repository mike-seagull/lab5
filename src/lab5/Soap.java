package lab5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Soap
 */
@WebServlet("/Soap")
public class Soap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Soap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	public String dummyMethod() {
		return "Work please";
	}
	public double inToCm(double inches) {
		return inches * 2.54;
	}
	public double cmToIn(double cm) {
		return cm / 2.54;
	}
	public double inToFt(double in) {
		return in / 12;
	}
	public double ftToIn(double ft) {
		return ft * 12;
	}
	public double ftToMi(double ft) {
		return ft / 5280;
	}
	public double miToFt(double mi) {
		return mi * 5280;
	}
	public double ftToM(double ft) {
		return ft / 3.28084;
	}
	public double mToFt(double m) {
		return m * 3.28084;
	}
	public double miToKm(double mi) {
		return mi * 1.60934;
	}
	public double kmToMi(double km) {
		return km / 1.60934;
	}
	public double daysToMonths(double days) {
		return days / 30;
	}
	public double monthsToDays(double months) {
		return months * 30;
	}
	public double weeksToYears(double weeks) {
		return weeks / 52;
	}
	public double yearsToWeeks(double years) {
		return years * 52;
	}
}
