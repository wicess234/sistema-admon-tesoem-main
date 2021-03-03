package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spbpers database table.
 * 
 */
@Entity
@Table(name="spbpers")
@NamedQuery(name="Spbper.findAll", query="SELECT s FROM Spbper s")
public class Spbper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPBPERS_ID")
	private int spbpersId;

	@Column(name="SPBPERS_CIVIL")
	private String spbpersCivil;

	@Column(name="SPBPERS_FALLECIDO")
	private String spbpersFallecido;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SPBPERS_FECH_NAC")
	private Date spbpersFechNac;

	@Column(name="SPBPERS_SEX")
	private String spbpersSex;

	@Column(name="SPBPERS_USER")
	private String spbpersUser;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SPRIDEN_ACTIVITY_DAT")
	private Date spridenActivityDat;

	public Spbper() {
	}

	public int getSpbpersId() {
		return this.spbpersId;
	}

	public void setSpbpersId(int spbpersId) {
		this.spbpersId = spbpersId;
	}

	public String getSpbpersCivil() {
		return this.spbpersCivil;
	}

	public void setSpbpersCivil(String spbpersCivil) {
		this.spbpersCivil = spbpersCivil;
	}

	public String getSpbpersFallecido() {
		return this.spbpersFallecido;
	}

	public void setSpbpersFallecido(String spbpersFallecido) {
		this.spbpersFallecido = spbpersFallecido;
	}

	public Date getSpbpersFechNac() {
		return this.spbpersFechNac;
	}

	public void setSpbpersFechNac(Date spbpersFechNac) {
		this.spbpersFechNac = spbpersFechNac;
	}

	public String getSpbpersSex() {
		return this.spbpersSex;
	}

	public void setSpbpersSex(String spbpersSex) {
		this.spbpersSex = spbpersSex;
	}

	public String getSpbpersUser() {
		return this.spbpersUser;
	}

	public void setSpbpersUser(String spbpersUser) {
		this.spbpersUser = spbpersUser;
	}

	public Date getSpridenActivityDat() {
		return this.spridenActivityDat;
	}

	public void setSpridenActivityDat(Date spridenActivityDat) {
		this.spridenActivityDat = spridenActivityDat;
	}

}