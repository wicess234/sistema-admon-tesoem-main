package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROL_ID")
	private int rolId;

	@Column(name="ROL_DESC")
	private String rolDesc;

	public Rol() {
	}

	public int getRolId() {
		return this.rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public String getRolDesc() {
		return this.rolDesc;
	}

	public void setRolDesc(String rolDesc) {
		this.rolDesc = rolDesc;
	}

}