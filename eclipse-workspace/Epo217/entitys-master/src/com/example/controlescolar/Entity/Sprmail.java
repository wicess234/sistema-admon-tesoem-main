package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sprmail database table.
 * 
 */
@Entity
@NamedQuery(name="Sprmail.findAll", query="SELECT s FROM Sprmail s")
public class Sprmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRMAIL_ID")
	private int sprmailId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SPRMAIL_ACTIVITY_DAT")
	private Date sprmailActivityDat;

	@Column(name="SPRMAIL_MAIL")
	private int sprmailMail;

	@Column(name="SPRMAIL_NUMSEQ")
	private String sprmailNumseq;

	//bi-directional many-to-one association to Stvmail
	@ManyToOne
	@JoinColumn(name="STVMAIL_TIPO",insertable =false, updatable = false)
	private Stvmail stvmail1;

	//bi-directional many-to-one association to Stvmail
	
	public Sprmail() {
	}

	public int getSprmailId() {
		return this.sprmailId;
	}

	public void setSprmailId(int sprmailId) {
		this.sprmailId = sprmailId;
	}

	public Date getSprmailActivityDat() {
		return this.sprmailActivityDat;
	}

	public void setSprmailActivityDat(Date sprmailActivityDat) {
		this.sprmailActivityDat = sprmailActivityDat;
	}

	public int getSprmailMail() {
		return this.sprmailMail;
	}

	public void setSprmailMail(int sprmailMail) {
		this.sprmailMail = sprmailMail;
	}

	public String getSprmailNumseq() {
		return this.sprmailNumseq;
	}

	public void setSprmailNumseq(String sprmailNumseq) {
		this.sprmailNumseq = sprmailNumseq;
	}

	public Stvmail getStvmail1() {
		return this.stvmail1;
	}

	public void setStvmail1(Stvmail stvmail1) {
		this.stvmail1 = stvmail1;
	}


}