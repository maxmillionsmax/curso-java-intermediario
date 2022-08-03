package com.maximiliano.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;

public class Aula98BigIntergerBigDecimal {

	public static void main(String[] args) throws ParseException {

		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);
		
		BigDecimal _a = new BigDecimal("0.03");
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);
		
		System.out.println(_c);
		
		BigDecimal bd1 = new BigDecimal("123456789876548979.36165768");
		BigDecimal bd2 = new BigDecimal("996966999966548979.36165768");
		
		System.out.println(bd1.add(bd2));
		
		System.out.println(bd1.multiply(bd2));
		
		System.out.println(bd1.divide(new BigDecimal(2)));
		
		BigInteger bi = new BigInteger("100000000000000000000000000000000");
		System.out.println(bi);
	}
}
