package com.maximiliano.cursojava.aula65;

public @interface InformacaoAula {

	String autor();
	int aulaNumero();
	String blog() default "http://maximiliano.blog";
	String site() default "http://maximiliano.com";
	
}
