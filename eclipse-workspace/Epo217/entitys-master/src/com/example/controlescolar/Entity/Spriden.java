package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spriden database table.
 * 
 */
@Entity
@NamedQuery(name="Spriden.findAll", query="SELECT s FROM Spriden s")
public class Spriden implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRIDEN_ID")
	private int spridenId;

	@Column(name="SPRIDEN_AP")
	private String spridenAp;

	@Column(name="SPRIDEN_APM")
	private String spridenApm;

	@Column(name="SPRIDEN_CHANGE_IND")
	private String spridenChangeInd;

	@Column(name="SPRIDEN_NOMBRE")
	private String spridenNombre;

	@Column(name="SPRIDEN_USER")
	private int spridenUser;

	private String spridencurp;
	//bi-directional many-to-one association to Stvprep
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PREPA_ID",insertable = true,updatable = true)
	private Stvprep stvprep1;



	public Spriden() {
	}

	public int getSpridenId() {
		return this.spridenId;
	}

	public void setSpridenId(int spridenId) {
		this.spridenId = spridenId;
	}

	public String getSpridenAp() {
		return this.spridenAp;
	}

	public void setSpridenAp(String spridenAp) {
		this.spridenAp = spridenAp;
	}

	public String getSpridenApm() {
		return this.spridenApm;
	}

	public void setSpridenApm(String spridenApm) {
		this.spridenApm = spridenApm;
	}

	public String getSpridenChangeInd() {
		return this.spridenChangeInd;
	}

	public void setSpridenChangeInd(String spridenChangeInd) {
		this.spridenChangeInd = spridenChangeInd;
	}

	public String getSpridenNombre() {
		return this.spridenNombre;
	}

	public void setSpridenNombre(String spridenNombre) {
		this.spridenNombre = spridenNombre;
	}

	public int getSpridenUser() {
		return this.spridenUser;
	}

	public void setSpridenUser(int spridenUser) {
		this.spridenUser = spridenUser;
	}

	public String getSpridencurp() {
		return this.spridencurp;
	}

	public void setSpridencurp(String spridencurp) {
		this.spridencurp = spridencurp;
	}

	public Stvprep getStvprep1() {
		return this.stvprep1;
	}

	public void setStvprep1(Stvprep stvprep1) {
		this.stvprep1 = stvprep1;
	}

}