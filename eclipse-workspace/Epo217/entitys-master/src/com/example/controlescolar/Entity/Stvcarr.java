package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stvcarr database table.
 * 
 */
@Entity
@NamedQuery(name="Stvcarr.findAll", query="SELECT s FROM Stvcarr s")
public class Stvcarr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CARRERA_ID")
	private int carreraId;

	private String CARRERA_deSC;

	public Stvcarr() {
	}

	public int getCarreraId() {
		return this.carreraId;
	}

	public void setCarreraId(int carreraId) {
		this.carreraId = carreraId;
	}

	public String getCARRERA_deSC() {
		return this.CARRERA_deSC;
	}

	public void setCARRERA_deSC(String CARRERA_deSC) {
		this.CARRERA_deSC = CARRERA_deSC;
	}

}