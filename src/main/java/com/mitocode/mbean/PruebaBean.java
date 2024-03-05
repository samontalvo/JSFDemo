package com.mitocode.mbean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped //peticion y olvida
public class PruebaBean implements Serializable{
	private String texto;
	private String saludo;
	
	public void saludar() {
		this.saludo = "Hola " + this.texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
