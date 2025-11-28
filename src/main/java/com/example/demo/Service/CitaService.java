package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.model.Cita;


public interface CitaService {

	public Cita save(Cita cita);
	public Optional<Cita> get(Integer id);
	public void update(Cita servicio);
	public void delete(Integer id);
}
