package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the stvtele database table.
 * 
 */
@Entity
@NamedQuery(name="Stvtele.findAll", query="SELECT s FROM Stvtele s")
public class Stvtele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVTELE_TIPO")
	private int stvteleTipo;

	@Column(name="STVTELE_DESC", insertable = true, updatable = true)
	private String stvteleDesc;

	//bi-directional many-to-one association to Sprtele
	@OneToMany(mappedBy="stvtele1")
	private List<Sprtele> sprteles1;

	//bi-directional many-to-one association to Sprtele
	@OneToMany(mappedBy="stvtele2")
	private List<Sprtele> sprteles2;

	public Stvtele() {
	}

	public int getStvteleTipo() {
		return this.stvteleTipo;
	}

	public void setStvteleTipo(int stvteleTipo) {
		this.stvteleTipo = stvteleTipo;
	}

	public String getStvteleDesc() {
		return this.stvteleDesc;
	}

	public void setStvteleDesc(String stvteleDesc) {
		this.stvteleDesc = stvteleDesc;
	}

	public List<Sprtele> getSprteles1() {
		return this.sprteles1;
	}

	public void setSprteles1(List<Sprtele> sprteles1) {
		this.sprteles1 = sprteles1;
	}

	public Sprtele addSprteles1(Sprtele sprteles1) {
		getSprteles1().add(sprteles1);
		sprteles1.setStvtele1(this);

		return sprteles1;
	}

	public Sprtele removeSprteles1(Sprtele sprteles1) {
		getSprteles1().remove(sprteles1);
		sprteles1.setStvtele1(null);

		return sprteles1;
	}

	public List<Sprtele> getSprteles2() {
		return this.sprteles2;
	}

	public void setSprteles2(List<Sprtele> sprteles2) {
		this.sprteles2 = sprteles2;
	}

	public Sprtele addSprteles2(Sprtele sprteles2) {
		getSprteles2().add(sprteles2);
		sprteles2.setStvtele2(this);

		return sprteles2;
	}

	public Sprtele removeSprteles2(Sprtele sprteles2) {
		getSprteles2().remove(sprteles2);
		sprteles2.setStvtele2(null);

		return sprteles2;
	}

}