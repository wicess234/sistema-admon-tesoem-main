package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the stvprep database table.
 * 
 */
@Entity
@NamedQuery(name="Stvprep.findAll", query="SELECT s FROM Stvprep s")
public class Stvprep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PREPA_ID")
	private int prepaId;

	@Column(name="PREPA_DESC")
	private String prepaDesc;

	//bi-directional many-to-one association to Spriden
	@OneToMany(mappedBy="stvprep1")
	private List<Spriden> spridens1;



	public Stvprep() {
	}

	public int getPrepaId() {
		return this.prepaId;
	}

	public void setPrepaId(int prepaId) {
		this.prepaId = prepaId;
	}

	public String getPrepaDesc() {
		return this.prepaDesc;
	}

	public void setPrepaDesc(String prepaDesc) {
		this.prepaDesc = prepaDesc;
	}

	public List<Spriden> getSpridens1() {
		return this.spridens1;
	}

	public void setSpridens1(List<Spriden> spridens1) {
		this.spridens1 = spridens1;
	}





}