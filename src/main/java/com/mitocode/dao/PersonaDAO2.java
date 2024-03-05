package com.mitocode.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.mitocode.model.Persona;

@Named //clase candidata para que sea inyectada en otro lado
public class PersonaDAO2{ //implements IDAO{
	//@Override
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<Persona>();
		for (int i = 1; i <= 200; i++) {
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
