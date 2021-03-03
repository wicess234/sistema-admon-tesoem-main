package com.example.controlescolar.Entity.DTO;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class EmailDTO {
	
	private int sprmailId;

	private Date sprmailActivityDat;
	private int sprmailNumber;
	@NotEmpty(message="El campo correo electronico no puede ir vacio")
	@Email(message="escribe un correo valido")
	private String sprmailUser;
	private String sprmailsprmailNumseq;
	public EmailDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailDTO(int sprmailId, Date sprmailActivityDat, int sprmailNumber,
			@NotEmpty(message = "El campo correo electronico no puede ir vacio") @Email(message = "escribe un correo valido") String sprmailUser,
			String sprmailsprmailNumseq) {
		super();
		this.sprmailId = sprmailId;
		this.sprmailActivityDat = sprmailActivityDat;
		this.sprmailNumber = sprmailNumber;
		this.sprmailUser = sprmailUser;
		this.sprmailsprmailNumseq = sprmailsprmailNumseq;
	}
	public int getSprmailId() {
		return sprmailId;
	}
	public void setSprmailId(int sprmailId) {
		this.sprmailId = sprmailId;
	}
	public Date getSprmailActivityDat() {
		return sprmailActivityDat;
	}
	public void setSprmailActivityDat(Date sprmailActivityDat) {
		this.sprmailActivityDat = sprmailActivityDat;
	}
	public int getSprmailNumber() {
		return sprmailNumber;
	}
	public void setSprmailNumber(int sprmailNumber) {
		this.sprmailNumber = sprmailNumber;
	}
	public String getSprmailUser() {
		return sprmailUser;
	}
	public void setSprmailUser(String sprmailUser) {
		this.sprmailUser = sprmailUser;
	}
	public String getSprmailsprmailNumseq() {
		return sprmailsprmailNumseq;
	}
	public void setSprmailsprmailNumseq(String sprmailsprmailNumseq) {
		this.sprmailsprmailNumseq = sprmailsprmailNumseq;
	}
	
}
