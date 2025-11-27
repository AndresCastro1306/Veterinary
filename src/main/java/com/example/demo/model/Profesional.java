package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesionales")
public class Profesional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;

	private String nombre;

	private String especialidad;

	private String horario_disponible;
	
	public Profesional() {
	}

	public Profesional(Integer id, String nombre, String especialidad, String horario_disponible) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.horario_disponible = horario_disponible;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getHorario_disponible() {
		return horario_disponible;
	}

	public void setHorario_disponible(String horario_disponible) {
		this.horario_disponible = horario_disponible;
	}

	@Override
	public String toString() {
		return "Profesional [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad
				+ ", horario_disponible=" + horario_disponible + "]";
	}
	
	
}
