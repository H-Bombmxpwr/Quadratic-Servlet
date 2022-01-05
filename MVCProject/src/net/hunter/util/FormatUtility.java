package net.hunter.util;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatUtility {
	private static final NumberFormat m_numFormat = NumberFormat.getNumberInstance(Locale.US);

	public static String formatInputString(String input) {
		String[] epicArray = input.split(",");
		if (epicArray.length < 2) {
			return "You fool thats too little values";
		}
		StringBuffer disp = new StringBuffer();
		for (int i = 0; i < epicArray.length; i++) {
			int num = Integer.parseInt(epicArray[i]);
			disp.append(FormatUtility.formatNumber(num));
			if (i < (epicArray.length - 1)) {
				disp.append(" and ");
			}
		}
		return (disp.toString());
	}

	/*
	 * This method formats an integer as a String using US Locale
	 * 
	 * @param number Integer number to be formatted
	 * 
	 * @return formatted number as a String super dope
	 */
	public static String formatNumber(int number) {
		return m_numFormat.format(number);
	}
}
