package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opccarr database table.
 * 
 */
@Entity
@NamedQuery(name="Opccarr.findAll", query="SELECT o FROM Opccarr o")
public class Opccarr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PERIODO_ID")
	private int periodoId;

	@Column(name="SPRIDEN_ID")
	private int spridenId;

	@Column(name="STVCARR_ID")
	private int stvcarrId;

	@Column(name="STVTURN_ID")
	private String stvturnId;

	public Opccarr() {
	}

	public int getPeriodoId() {
		return this.periodoId;
	}

	public void setPeriodoId(int periodoId) {
		this.periodoId = periodoId;
	}

	public int getSpridenId() {
		return this.spridenId;
	}

	public void setSpridenId(int spridenId) {
		this.spridenId = spridenId;
	}

	public int getStvcarrId() {
		return this.stvcarrId;
	}

	public void setStvcarrId(int stvcarrId) {
		this.stvcarrId = stvcarrId;
	}

	public String getStvturnId() {
		return this.stvturnId;
	}

	public void setStvturnId(String stvturnId) {
		this.stvturnId = stvturnId;
	}

}