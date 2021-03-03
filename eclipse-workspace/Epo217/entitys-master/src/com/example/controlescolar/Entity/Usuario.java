package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USUARIO_ID")
	private int usuarioId;

	@Column(name="USUARIO_NAME")
	private String usuarioName;

	@Column(name="USUARIO_PASS")
	private String usuarioPass;

	@Column(name="USUARIO_ROL_ID")
	private int usuarioRolId;

	@Column(name="USUARIO_TOKEN")
	private String usuarioToken;

	public Usuario() {
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioName() {
		return this.usuarioName;
	}

	public void setUsuarioName(String usuarioName) {
		this.usuarioName = usuarioName;
	}

	public String getUsuarioPass() {
		return this.usuarioPass;
	}

	public void setUsuarioPass(String usuarioPass) {
		this.usuarioPass = usuarioPass;
	}

	public int getUsuarioRolId() {
		return this.usuarioRolId;
	}

	public void setUsuarioRolId(int usuarioRolId) {
		this.usuarioRolId = usuarioRolId;
	}

	public String getUsuarioToken() {
		return this.usuarioToken;
	}

	public void setUsuarioToken(String usuarioToken) {
		this.usuarioToken = usuarioToken;
	}

}