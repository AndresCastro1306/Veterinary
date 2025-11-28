package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CitaRepository;
import com.example.demo.model.Cita;

@Service
public class CitaServiceImpl implements CitaService{
	
	@Autowired
	private CitaRepository citaRepository;

	@Override
	public Cita save(Cita cita) {
		
		return citaRepository.save(cita);
	}

	@Override
	public Optional<Cita> get(Integer id) {
		
		return citaRepository.findById(id);
	}

	@Override
	public void update(Cita servicio) {
		citaRepository.save(servicio);
		
	}

	@Override
	public void delete(Integer id) {
	citaRepository.deleteById(id);
		
	}

}
