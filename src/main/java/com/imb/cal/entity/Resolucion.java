package com.imb.cal.entity;

import jakarta.persistence.Entity;

@Entity 
public class Resolucion extends BaseEntity {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
