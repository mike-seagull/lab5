package lab5;


import java.util.Scanner;

import client.*;

public class Main {

	public static void main(String[] args) {
		SoapService ss = new SoapService();
		client.Soap soap = ss.getSoap();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input command:");
		String command = s.nextLine();
		String[] partsOfCommand = command.split(" ");
		try {
			double amount = Double.parseDouble(partsOfCommand[0]);
			String fromUnit = partsOfCommand[1];
			String toUnit = partsOfCommand[3];
			if (fromUnit.equals("in") && toUnit.equals("cm")) {
				System.out.println(soap.inToCm(amount));
			}else if (fromUnit.equals("cm") && toUnit.equals("in")) {
				System.out.println(soap.cmToIn(amount));
			}else if (fromUnit.equals("in") && toUnit.equals("ft")) {
				System.out.println(soap.inToFt(amount));
			}else if (fromUnit.equals("ft") && toUnit.equals("in")) {
				System.out.println(soap.ftToIn(amount));
			}else if (fromUnit.equals("ft") && toUnit.equals("m")) {
				System.out.println(soap.ftToM(amount));
			}else if (fromUnit.equals("m") && toUnit.equals("ft")) {
				System.out.println(soap.mToFt(amount));
			}else if (fromUnit.equals("ft") && toUnit.equals("mi")) {
				System.out.println(soap.ftToMi(amount));
			}else if (fromUnit.equals("mi") && toUnit.equals("ft")) {
				System.out.println(soap.miToFt(amount));
			}else if (fromUnit.equals("days") && toUnit.equals("months")) {
				System.out.println(soap.daysToMonths(amount));
			}else if (fromUnit.equals("months") && toUnit.equals("days")) {
				System.out.println(soap.monthsToDays(amount));	
			}else if (fromUnit.equals("weeks") && toUnit.equals("years")) {
				System.out.println(soap.weeksToYears(amount));
			}else if (fromUnit.equals("years") && toUnit.equals("weeks")) {
				System.out.println(soap.yearsToWeeks(amount));			
			}else {
				throw new Exception();
			}
		}catch (Exception e) {
			System.out.print("Error");
		}

		
	}

}
