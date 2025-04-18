package com.imb.cal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class EstadoAcademico extends BaseEntity {
	@ManyToOne
	private Alumno alumno;
	
	@ManyToOne
	private Materia materia;
	
	@ManyToOne
	private Final evaluacionFinal;
	
	private EstadoAcademicoValor valor;
	
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
	public Final getEvaluacionFinal() {
		return evaluacionFinal;
	}
	public void setEvaluacionFinal(Final evaluacionFinal) {
		this.evaluacionFinal = evaluacionFinal;
	}
	public EstadoAcademicoValor getValor() {
		return valor;
	}
	public void setValor(EstadoAcademicoValor valor) {
		this.valor = valor;
	}
	
	
}
