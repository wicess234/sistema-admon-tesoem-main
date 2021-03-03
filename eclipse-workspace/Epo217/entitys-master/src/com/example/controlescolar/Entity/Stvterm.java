package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stvterm database table.
 * 
 */
@Entity
@NamedQuery(name="Stvterm.findAll", query="SELECT s FROM Stvterm s")
public class Stvterm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PERIODO_ID",insertable = true, updatable = true)
	private int periodoId;

	private String PERIODO_dESC;

	public Stvterm() {
	}

	public int getPeriodoId() {
		return this.periodoId;
	}

	public void setPeriodoId(int periodoId) {
		this.periodoId = periodoId;
	}

	public String getPERIODO_dESC() {
		return this.PERIODO_dESC;
	}

	public void setPERIODO_dESC(String PERIODO_dESC) {
		this.PERIODO_dESC = PERIODO_dESC;
	}

}