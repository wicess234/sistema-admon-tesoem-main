package com.example.controlescolar.Entity.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.controlescolar.Entity.Stvprep;

@XmlRootElement(name = "spridem")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpridemDTO  implements Serializable{
		
	
	private int spridenId;
	@NotBlank(message="El campo es obligatorio")
	private String spridenAp;
	private String spridenApm;
	private String spridenChangeInd;
	@NotBlank(message="El campo es obligatorio")
	private String spridenNombre;
	private int spridenUser;
	@NotBlank(message="El campo es obligatorio")
	private String spridencurp;
	private int stvprep1;
	public SpridemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpridemDTO(int spridenId, @NotBlank(message = "El campo es obligatorio") String spridenAp, String spridenApm,
			String spridenChangeInd, @NotBlank(message = "El campo es obligatorio") String spridenNombre,
			int spridenUser, @NotBlank(message = "El campo es obligatorio") String spridencurp, int stvprep1) {
		super();
		this.spridenId = spridenId;
		this.spridenAp = spridenAp;
		this.spridenApm = spridenApm;
		this.spridenChangeInd = spridenChangeInd;
		this.spridenNombre = spridenNombre;
		this.spridenUser = spridenUser;
		this.spridencurp = spridencurp;
		this.stvprep1 = stvprep1;
	}

	public int getSpridenId() {
		return spridenId;
	}
	public void setSpridenId(int spridenId) {
		this.spridenId = spridenId;
	}
	public String getSpridenAp() {
		return spridenAp;
	}
	public void setSpridenAp(String spridenAp) {
		this.spridenAp = spridenAp;
	}
	public String getSpridenApm() {
		return spridenApm;
	}
	public void setSpridenApm(String spridenApm) {
		this.spridenApm = spridenApm;
	}
	public String getSpridenChangeInd() {
		return spridenChangeInd;
	}
	public void setSpridenChangeInd(String spridenChangeInd) {
		this.spridenChangeInd = spridenChangeInd;
	}
	public String getSpridenNombre() {
		return spridenNombre;
	}
	public void setSpridenNombre(String spridenNombre) {
		this.spridenNombre = spridenNombre;
	}
	public int getSpridenUser() {
		return spridenUser;
	}
	public void setSpridenUser(int spridenUser) {
		this.spridenUser = spridenUser;
	}
	public String getSpridencurp() {
		return spridencurp;
	}
	public void setSpridencurp(String spridencurp) {
		this.spridencurp = spridencurp;
	}

	public int getStvprep1() {
		return stvprep1;
	}

	public void setStvprep1(int stvprep1) {
		this.stvprep1 = stvprep1;
	}

	
	
	
}
