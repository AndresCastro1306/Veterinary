package com.example.demo.Service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ServicioRepository;
import com.example.demo.model.Servicio;

@Service
public class ServicioServiceImpl implements ServicioService{

	@Autowired
	private ServicioRepository servicioRepository;
	
	@Override
	public Servicio save(Servicio servicio) {
	
		return servicioRepository.save(servicio);
	}

	@Override
	public Optional<Servicio> get(Integer id) {
		
		return servicioRepository.findById(id);
	}

	@Override
	public void update(Servicio servicio) {
		servicioRepository.save(servicio);
	}

	@Override
	public void delete(Integer id) {
		servicioRepository.deleteById(id);
		
	}
	
	

}
