package com.maximiliano.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResuceBundle {

	public static void main(String[] args) {

		System.out.println("locale atual: "+Locale.getDefault());
		
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println("Hello en_US: "+ rb.getString("hello"));
		
		System.out.println("World en_US: "+ rb.getString("world"));
		
		//Locale.setDefault(new Locale("en_US", "en_US"));
		rb = ResourceBundle.getBundle("meu-texto",new Locale("en_US", "en_US"));
		
		System.out.println("Ola pt_Br: "+ rb.getString("hello"));
		System.out.println("Mundo pt_Br: "+ rb.getString("world"));
		
		
	}
}
