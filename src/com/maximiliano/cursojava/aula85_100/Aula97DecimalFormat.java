package com.maximiliano.cursojava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class Aula97DecimalFormat {

	public static void main(String[] args) throws ParseException {

		String padrao= "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		
		//df.applyPattern(padrao);
		
		System.out.println(df.format(123456546878.6854));
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(123456546878.6854));
		
		String padrao3 = "###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(123456546878.6854));
		
		String padrao4 = "###,#00.00%";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(321546999));
		
		
		
		
		
	}
}
