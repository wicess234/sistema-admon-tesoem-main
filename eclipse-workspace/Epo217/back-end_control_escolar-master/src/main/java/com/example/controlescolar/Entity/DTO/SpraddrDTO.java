package com.example.controlescolar.Entity.DTO;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class SpraddrDTO {
		
	private int spraddrId;
	@NotEmpty(message="El campo calle es obligatorio")
	private String spraddrCalle;
	@NotEmpty(message="El campo ciudad es obligatorio")
	private String spraddrCiudad;
	@NotEmpty(message="La colonia es obligatoria")
	private String spraddrColonia;
	@NotEmpty(message="El campo Codigo Postal es obligatorio")
	private String spraddrCp;
	@NotEmpty(message="El campo Estado es obligatorio")
	private String spraddrEstado;
	private String spraddrMunODel;
	private String spraddrNum;
	@NotEmpty(message="El campo pais es obligatorio")
	private String spraddrPais;
	private String spraddrTipo;
	private String spraddrnumseq;
	private Date spridenActivityDat;
	private String spridenUser;
	public SpraddrDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpraddrDTO(int spraddrId, @NotEmpty(message = "El campo calle es obligatorio") String spraddrCalle,
			@NotEmpty(message = "El campo ciudad es obligatorio") String spraddrCiudad,
			@NotEmpty(message = "La colonia es obligatoria") String spraddrColonia,
			@NotEmpty(message = "El campo Codigo Postal es obligatorio") String spraddrCp,
			@NotEmpty(message = "El campo Estado es obligatorio") String spraddrEstado, String spraddrMunODel,
			String spraddrNum, @NotEmpty(message = "El campo pais es obligatorio") String spraddrPais,
			String spraddrTipo, String spraddrnumseq, Date spridenActivityDat, String spridenUser) {
		super();
		this.spraddrId = spraddrId;
		this.spraddrCalle = spraddrCalle;
		this.spraddrCiudad = spraddrCiudad;
		this.spraddrColonia = spraddrColonia;
		this.spraddrCp = spraddrCp;
		this.spraddrEstado = spraddrEstado;
		this.spraddrMunODel = spraddrMunODel;
		this.spraddrNum = spraddrNum;
		this.spraddrPais = spraddrPais;
		this.spraddrTipo = spraddrTipo;
		this.spraddrnumseq = spraddrnumseq;
		this.spridenActivityDat = spridenActivityDat;
		this.spridenUser = spridenUser;
	}
	public int getSpraddrId() {
		return spraddrId;
	}
	public void setSpraddrId(int spraddrId) {
		this.spraddrId = spraddrId;
	}
	public String getSpraddrCalle() {
		return spraddrCalle;
	}
	public void setSpraddrCalle(String spraddrCalle) {
		this.spraddrCalle = spraddrCalle;
	}
	public String getSpraddrCiudad() {
		return spraddrCiudad;
	}
	public void setSpraddrCiudad(String spraddrCiudad) {
		this.spraddrCiudad = spraddrCiudad;
	}
	public String getSpraddrColonia() {
		return spraddrColonia;
	}
	public void setSpraddrColonia(String spraddrColonia) {
		this.spraddrColonia = spraddrColonia;
	}
	public String getSpraddrCp() {
		return spraddrCp;
	}
	public void setSpraddrCp(String spraddrCp) {
		this.spraddrCp = spraddrCp;
	}
	public String getSpraddrEstado() {
		return spraddrEstado;
	}
	public void setSpraddrEstado(String spraddrEstado) {
		this.spraddrEstado = spraddrEstado;
	}
	public String getSpraddrMunODel() {
		return spraddrMunODel;
	}
	public void setSpraddrMunODel(String spraddrMunODel) {
		this.spraddrMunODel = spraddrMunODel;
	}
	public String getSpraddrNum() {
		return spraddrNum;
	}
	public void setSpraddrNum(String spraddrNum) {
		this.spraddrNum = spraddrNum;
	}
	public String getSpraddrPais() {
		return spraddrPais;
	}
	public void setSpraddrPais(String spraddrPais) {
		this.spraddrPais = spraddrPais;
	}
	public String getSpraddrTipo() {
		return spraddrTipo;
	}
	public void setSpraddrTipo(String spraddrTipo) {
		this.spraddrTipo = spraddrTipo;
	}
	public String getSpraddrnumseq() {
		return spraddrnumseq;
	}
	public void setSpraddrnumseq(String spraddrnumseq) {
		this.spraddrnumseq = spraddrnumseq;
	}
	public Date getSpridenActivityDat() {
		return spridenActivityDat;
	}
	public void setSpridenActivityDat(Date spridenActivityDat) {
		this.spridenActivityDat = spridenActivityDat;
	}
	public String getSpridenUser() {
		return spridenUser;
	}
	public void setSpridenUser(String spridenUser) {
		this.spridenUser = spridenUser;
	}
	
	
}
