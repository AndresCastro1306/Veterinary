package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Servicio;


@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer>{

}
