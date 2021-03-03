package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spraddr database table.
 * 
 */
@Entity
@NamedQuery(name="Spraddr.findAll", query="SELECT s FROM Spraddr s")
public class Spraddr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRADDR_ID")
	private int spraddrId;

	@Column(name="SPRADDR_CALLE")
	private String spraddrCalle;

	@Column(name="SPRADDR_CIUDAD")
	private String spraddrCiudad;

	@Column(name="SPRADDR_COLONIA")
	private String spraddrColonia;

	@Column(name="SPRADDR_CP")
	private String spraddrCp;

	@Column(name="SPRADDR_ESTADO")
	private String spraddrEstado;

	@Column(name="SPRADDR_MUN_O_DEL")
	private String spraddrMunODel;

	@Column(name="SPRADDR_NUM")
	private String spraddrNum;

	@Column(name="SPRADDR_NUMSEQ")
	private String spraddrNumseq;

	@Column(name="SPRADDR_PAIS")
	private String spraddrPais;

	@Temporal(TemporalType.TIMESTAMP)
	private Date SPRIDEN_aCTIVITY_DAT;

	@Column(name="SPRIDEN_USER")
	private String spridenUser;

	//bi-directional many-to-one association to Stvtype
	@ManyToOne
	@JoinColumn(name="SPRADDR_TIPO",insertable = false,updatable = false)
	private Stvtype stvtype1;

	//bi-directional many-to-one association to Stvtype
	@ManyToOne
	@JoinColumn(name="SPRADDR_TIPO",insertable = false,updatable = false)
	private Stvtype stvtype2;

	public Spraddr() {
	}

	public int getSpraddrId() {
		return this.spraddrId;
	}

	public void setSpraddrId(int spraddrId) {
		this.spraddrId = spraddrId;
	}

	public String getSpraddrCalle() {
		return this.spraddrCalle;
	}

	public void setSpraddrCalle(String spraddrCalle) {
		this.spraddrCalle = spraddrCalle;
	}

	public String getSpraddrCiudad() {
		return this.spraddrCiudad;
	}

	public void setSpraddrCiudad(String spraddrCiudad) {
		this.spraddrCiudad = spraddrCiudad;
	}

	public String getSpraddrColonia() {
		return this.spraddrColonia;
	}

	public void setSpraddrColonia(String spraddrColonia) {
		this.spraddrColonia = spraddrColonia;
	}

	public String getSpraddrCp() {
		return this.spraddrCp;
	}

	public void setSpraddrCp(String spraddrCp) {
		this.spraddrCp = spraddrCp;
	}

	public String getSpraddrEstado() {
		return this.spraddrEstado;
	}

	public void setSpraddrEstado(String spraddrEstado) {
		this.spraddrEstado = spraddrEstado;
	}

	public String getSpraddrMunODel() {
		return this.spraddrMunODel;
	}

	public void setSpraddrMunODel(String spraddrMunODel) {
		this.spraddrMunODel = spraddrMunODel;
	}

	public String getSpraddrNum() {
		return this.spraddrNum;
	}

	public void setSpraddrNum(String spraddrNum) {
		this.spraddrNum = spraddrNum;
	}

	public String getSpraddrNumseq() {
		return this.spraddrNumseq;
	}

	public void setSpraddrNumseq(String spraddrNumseq) {
		this.spraddrNumseq = spraddrNumseq;
	}

	public String getSpraddrPais() {
		return this.spraddrPais;
	}

	public void setSpraddrPais(String spraddrPais) {
		this.spraddrPais = spraddrPais;
	}

	public Date getSPRIDEN_aCTIVITY_DAT() {
		return this.SPRIDEN_aCTIVITY_DAT;
	}

	public void setSPRIDEN_aCTIVITY_DAT(Date SPRIDEN_aCTIVITY_DAT) {
		this.SPRIDEN_aCTIVITY_DAT = SPRIDEN_aCTIVITY_DAT;
	}

	public String getSpridenUser() {
		return this.spridenUser;
	}

	public void setSpridenUser(String spridenUser) {
		this.spridenUser = spridenUser;
	}

	public Stvtype getStvtype1() {
		return this.stvtype1;
	}

	public void setStvtype1(Stvtype stvtype1) {
		this.stvtype1 = stvtype1;
	}

	public Stvtype getStvtype2() {
		return this.stvtype2;
	}

	public void setStvtype2(Stvtype stvtype2) {
		this.stvtype2 = stvtype2;
	}

}