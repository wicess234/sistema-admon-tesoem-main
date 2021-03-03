package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sprtele database table.
 * 
 */
@Entity
@NamedQuery(name="Sprtele.findAll", query="SELECT s FROM Sprtele s")
public class Sprtele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRTELE_ID")
	private int sprteleId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SPRIDEN_ACTIVITY_DAT",insertable = true, updatable = true)
	private Date spridenActivityDat;

	@Column(name="SPRIDEN_USER",insertable = true, updatable = true)
	private String spridenUser;

	@Column(name="SPRTELE_NUMBER",insertable = true, updatable = true)
	private int sprteleNumber;

	@Column(name="SPRTELE_NUMSEQ",insertable = true, updatable = true)
	private String sprteleNumseq;

	//bi-directional many-to-one association to Stvtele
	@ManyToOne
	@JoinColumn(name="STVTELE_TIPO",insertable =false, updatable = false)
	private Stvtele stvtele1;

	//bi-directional many-to-one association to Stvtele
	@ManyToOne
	@JoinColumn(name="STVTELE_TIPO",insertable =false, updatable = false)
	private Stvtele stvtele2;

	public Sprtele() {
	}

	public int getSprteleId() {
		return this.sprteleId;
	}

	public void setSprteleId(int sprteleId) {
		this.sprteleId = sprteleId;
	}

	public Date getSpridenActivityDat() {
		return this.spridenActivityDat;
	}

	public void setSpridenActivityDat(Date spridenActivityDat) {
		this.spridenActivityDat = spridenActivityDat;
	}

	public String getSpridenUser() {
		return this.spridenUser;
	}

	public void setSpridenUser(String spridenUser) {
		this.spridenUser = spridenUser;
	}

	public int getSprteleNumber() {
		return this.sprteleNumber;
	}

	public void setSprteleNumber(int sprteleNumber) {
		this.sprteleNumber = sprteleNumber;
	}

	public String getSprteleNumseq() {
		return this.sprteleNumseq;
	}

	public void setSprteleNumseq(String sprteleNumseq) {
		this.sprteleNumseq = sprteleNumseq;
	}

	public Stvtele getStvtele1() {
		return this.stvtele1;
	}

	public void setStvtele1(Stvtele stvtele1) {
		this.stvtele1 = stvtele1;
	}

	public Stvtele getStvtele2() {
		return this.stvtele2;
	}

	public void setStvtele2(Stvtele stvtele2) {
		this.stvtele2 = stvtele2;
	}

}