package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sesion database table.
 * 
 */
@Entity
@NamedQuery(name="Sesion.findAll", query="SELECT s FROM Sesion s")
public class Sesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SESION_ID")
	private int sesionId;

	@Column(name="SESION_ROL_ID")
	private int sesionRolId;

	@Column(name="SESION_TOKEN")
	private int sesionToken;

	@Column(name="SESION_USUARIO_ID")
	private int sesionUsuarioId;

	public Sesion() {
	}

	public int getSesionId() {
		return this.sesionId;
	}

	public void setSesionId(int sesionId) {
		this.sesionId = sesionId;
	}

	public int getSesionRolId() {
		return this.sesionRolId;
	}

	public void setSesionRolId(int sesionRolId) {
		this.sesionRolId = sesionRolId;
	}

	public int getSesionToken() {
		return this.sesionToken;
	}

	public void setSesionToken(int sesionToken) {
		this.sesionToken = sesionToken;
	}

	public int getSesionUsuarioId() {
		return this.sesionUsuarioId;
	}

	public void setSesionUsuarioId(int sesionUsuarioId) {
		this.sesionUsuarioId = sesionUsuarioId;
	}

}