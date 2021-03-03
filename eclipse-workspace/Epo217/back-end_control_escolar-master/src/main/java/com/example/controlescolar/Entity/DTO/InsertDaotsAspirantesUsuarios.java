package com.example.controlescolar.Entity.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "spridem")
@XmlAccessorType(XmlAccessType.FIELD)
public class InsertDaotsAspirantesUsuarios  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Inserta datos en tabla Spridem
	
	
	
	public InsertDaotsAspirantesUsuarios(int spridenId, String spridenApMat,
			@NotEmpty(message = "El campo apellido paterno es obligatorio") String spridenApPat, Date spridenChangeInd,
			@NotEmpty(message = "El campo nombre es obligatorio") String spridenName) {
		super();
		this.spridenId = spridenId;
		this.spridenApMat = spridenApMat;
		this.spridenApPat = spridenApPat;
		this.spridenChangeInd = spridenChangeInd;
		this.spridenName = spridenName;
	}
	public InsertDaotsAspirantesUsuarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getSpridenId() {
		return spridenId;
	}
	public String getSpridenApMat() {
		return spridenApMat;
	}
	public String getSpridenApPat() {
		return spridenApPat;
	}
	public Date getSpridenChangeInd() {
		return spridenChangeInd;
	}
	public String getSpridenName() {
		return spridenName;
	}
	public void setSpridenId(int spridenId) {
		this.spridenId = spridenId;
	}
	public void setSpridenApMat(String spridenApMat) {
		this.spridenApMat = spridenApMat;
	}
	public void setSpridenApPat(String spridenApPat) {
		this.spridenApPat = spridenApPat;
	}
	public void setSpridenChangeInd(Date spridenChangeInd) {
		this.spridenChangeInd = spridenChangeInd;
	}
	public void setSpridenName(String spridenName) {
		this.spridenName = spridenName;
	}
	private int spridenId;
	
	private String spridenApMat;
	@NotEmpty(message="El campo apellido paterno es obligatorio")
	private String spridenApPat;
	private Date spridenChangeInd;
	@NotEmpty(message="El campo nombre es obligatorio")
	private String spridenName;
	
	
	

	
	
	
	

}
