package com.imb.cal.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Asistencia extends BaseEntity {
	private Date fecha;
	
	@ManyToOne
	private Alumno alumno;
	
	@ManyToOne
	private Materia materia;
	
	private AsistenciaValor valor;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public AsistenciaValor getValor() {
		return valor;
	}
	public void setValor(AsistenciaValor valor) {
		this.valor = valor;
	}
	
	
	
}
