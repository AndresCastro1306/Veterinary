package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy = "profesional")
	private List<Cita> citas;
	
	public Profesional() {
	}

	

	public Profesional(Integer id, String nombre, String especialidad, String horario_disponible, Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.horario_disponible = horario_disponible;
		this.usuario = usuario;
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

	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	public List<Cita> getCitas() {
		return citas;
	}



	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}



	@Override
	public String toString() {
		return "Profesional [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad
				+ ", horario_disponible=" + horario_disponible + "]";
	}
	
	
}
