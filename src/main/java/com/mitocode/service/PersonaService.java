package com.mitocode.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mitocode.dao.IDAO;
import com.mitocode.model.Persona;

//@Named
//@RequestScoped
public class PersonaService implements IService, Serializable{
	
	//@Inject //Traido una instancia de lo que hay en IDAO osea puede ser PersonaDAO o PeronsaDAO2 depende de la llamada
	private IDAO dao; //creamos un objeto de la interfaz
	
//	public PersonaService(IDAO idao) {
//		dao = idao;
//	}
	
	@Override
	public List<Persona> listar(){
		return dao.listar();
	}
}
