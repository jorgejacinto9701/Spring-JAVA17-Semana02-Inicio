package com.empresa.service;

import java.util.List;

import com.empresa.entity.Modalidad;

public interface ModalidadService  {

	public abstract List<Modalidad> listaModalidadPorNombre(String nombre);
	public abstract Modalidad insertaModalidad(Modalidad obj);
	
}

