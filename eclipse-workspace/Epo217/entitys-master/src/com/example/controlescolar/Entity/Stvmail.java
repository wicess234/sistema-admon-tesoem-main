package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the stvmail database table.
 * 
 */
@Entity
@NamedQuery(name="Stvmail.findAll", query="SELECT s FROM Stvmail s")
public class Stvmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVMAIL_ID")
	private int stvmailId;

	@Column(name="STVMAIL_DESC")
	private String stvmailDesc;

	//bi-directional many-to-one association to Sprmail
	@OneToMany(mappedBy="stvmail1")
	private List<Sprmail> sprmails1;


	public Stvmail() {
	}

	public int getStvmailId() {
		return this.stvmailId;
	}

	public void setStvmailId(int stvmailId) {
		this.stvmailId = stvmailId;
	}

	public String getStvmailDesc() {
		return this.stvmailDesc;
	}

	public void setStvmailDesc(String stvmailDesc) {
		this.stvmailDesc = stvmailDesc;
	}

	public List<Sprmail> getSprmails1() {
		return this.sprmails1;
	}

	public void setSprmails1(List<Sprmail> sprmails1) {
		this.sprmails1 = sprmails1;
	}

	public Sprmail addSprmails1(Sprmail sprmails1) {
		getSprmails1().add(sprmails1);
		sprmails1.setStvmail1(this);

		return sprmails1;
	}

	public Sprmail removeSprmails1(Sprmail sprmails1) {
		getSprmails1().remove(sprmails1);
		sprmails1.setStvmail1(null);

		return sprmails1;
	}




}