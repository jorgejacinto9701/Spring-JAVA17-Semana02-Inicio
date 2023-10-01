package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Deporte;

public interface DeporteRepository extends JpaRepository<Deporte, Integer>{


	public abstract List<Deporte> findByOrderByNombreAsc();
	
	
}
