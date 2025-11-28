package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String fecha_Hora;
	private String estado;
	
	@ManyToOne
	private Usuario usuario ;
	
	@ManyToOne
	private Profesional profesional;
	
	@ManyToOne
	private Servicio servicio;
	
	public Cita() {
	}


	public Cita(Integer id, String fecha_Hora, String estado, Usuario usuario, Profesional profesional,
			Servicio servicio) {
		super();
		this.id = id;
		this.fecha_Hora = fecha_Hora;
		this.estado = estado;
		this.usuario = usuario;
		this.profesional = profesional;
		this.servicio = servicio;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	public Profesional getProfesional() {
		return profesional;
	}



	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}



	public Servicio getServicio() {
		return servicio;
	}





	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}





	@Override
	public String toString() {
		return "Cita [id=" + id + ", fecha_Hora=" + fecha_Hora + ", estado=" + estado + "]";
	}
	
	
}
