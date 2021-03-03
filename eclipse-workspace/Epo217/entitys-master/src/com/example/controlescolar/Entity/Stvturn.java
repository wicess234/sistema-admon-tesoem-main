package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stvturn database table.
 * 
 */
@Entity
@NamedQuery(name="Stvturn.findAll", query="SELECT s FROM Stvturn s")
public class Stvturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVTURN_ID", insertable = true, updatable = true)
	private String stvturnId;

	@Column(name="STVTURN_DESC", insertable = true, updatable = true)
	private String stvturnDesc;

	public Stvturn() {
	}

	public String getStvturnId() {
		return this.stvturnId;
	}

	public void setStvturnId(String stvturnId) {
		this.stvturnId = stvturnId;
	}

	public String getStvturnDesc() {
		return this.stvturnDesc;
	}

	public void setStvturnDesc(String stvturnDesc) {
		this.stvturnDesc = stvturnDesc;
	}

}