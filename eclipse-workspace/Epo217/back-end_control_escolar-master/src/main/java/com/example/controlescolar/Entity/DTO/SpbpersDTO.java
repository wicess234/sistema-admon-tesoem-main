package com.example.controlescolar.Entity.DTO;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class SpbpersDTO {
		
	private int spbpersId;
	@NotEmpty(message="El estado civil es obligatorio")
	private String spbpersCivil;
	private String spbpersFallecido;
	@NotEmpty(message="El campo sexo es obligatorio")
	private String spbpersSex;
	private Date spridenActivityDat;
	private String spridenUser;
	public SpbpersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpbpersDTO(int spbpersId, @NotEmpty(message = "El estado civil es obligatorio") String spbpersCivil,
			String spbpersFallecido, @NotEmpty(message = "El campo sexo es obligatorio") String spbpersSex,
			Date spridenActivityDat, String spridenUser) {
		super();
		this.spbpersId = spbpersId;
		this.spbpersCivil = spbpersCivil;
		this.spbpersFallecido = spbpersFallecido;
		this.spbpersSex = spbpersSex;
		this.spridenActivityDat = spridenActivityDat;
		this.spridenUser = spridenUser;
	}
	public int getSpbpersId() {
		return spbpersId;
	}
	public void setSpbpersId(int spbpersId) {
		this.spbpersId = spbpersId;
	}
	public String getSpbpersCivil() {
		return spbpersCivil;
	}
	public void setSpbpersCivil(String spbpersCivil) {
		this.spbpersCivil = spbpersCivil;
	}
	public String getSpbpersFallecido() {
		return spbpersFallecido;
	}
	public void setSpbpersFallecido(String spbpersFallecido) {
		this.spbpersFallecido = spbpersFallecido;
	}
	public String getSpbpersSex() {
		return spbpersSex;
	}
	public void setSpbpersSex(String spbpersSex) {
		this.spbpersSex = spbpersSex;
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
