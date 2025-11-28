package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.model.Servicio;

public interface ServicioService {

	public Servicio save(Servicio servicio);
	public Optional<Servicio> get(Integer id);
	public void update(Servicio servicio);
	public void delete(Integer id);
	}
