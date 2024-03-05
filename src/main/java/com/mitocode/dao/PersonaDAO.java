package com.mitocode.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.mitocode.model.Persona;

//@Named //clase candidata para que sea inyectada en otro lado
public class PersonaDAO implements	IDAO, Serializable {
	@Override
	//@RequestScoped
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<Persona>();
		for (int i = 1; i <= 100; i++) {
			Persona per = new Persona();
			per.setIdPersona(i);
			per.setNombres("Alex");
			per.setApellidos("Montalvo");
			per.setEdad(27);

			lista.add(per);
		}
		return lista;
	}
}
