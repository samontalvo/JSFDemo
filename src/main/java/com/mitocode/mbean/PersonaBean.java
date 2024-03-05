package com.mitocode.mbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mitocode.model.Persona;
import com.mitocode.service.IService;

//@Named
//@ViewScoped
public class PersonaBean implements Serializable{
	private List<Persona> lista;
	private Persona persona;
	//@Inject
	private IService service;

	public PersonaBean() {
		this.lista = new ArrayList<Persona>();
		//this.service = new PersonaService(new PersonaDAO2());
		this.listar();
	}
	
	public void listar() {
		this.lista = this.service.listar();
	}
	
	public void enviar(Persona per) {
		this.setPersona(per);
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}	
}
