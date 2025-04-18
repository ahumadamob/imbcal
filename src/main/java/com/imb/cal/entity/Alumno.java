package com.imb.cal.entity;

import jakarta.persistence.Entity;

@Entity
public class Alumno extends Persona {
	private int matricula;
	private int division;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}

}
