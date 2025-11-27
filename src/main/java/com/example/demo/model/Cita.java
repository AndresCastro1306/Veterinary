package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String fecha_Hora;
	private String estado;
	
	public Cita() {
	}

	public Cita(Integer id, String fecha_Hora, String estado) {
		super();
		this.id = id;
		this.fecha_Hora = fecha_Hora;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFecha_Hora() {
		return fecha_Hora;
	}

	public void setFecha_Hora(String fecha_Hora) {
		this.fecha_Hora = fecha_Hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", fecha_Hora=" + fecha_Hora + ", estado=" + estado + "]";
	}
	
	
}
