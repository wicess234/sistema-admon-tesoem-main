package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the stvtype database table.
 * 
 */
@Entity
@NamedQuery(name="Stvtype.findAll", query="SELECT s FROM Stvtype s")
public class Stvtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRADDR_TIPO", insertable = true, updatable = true)
	private int spraddrTipo;

	@Column(name="SPRADDR_DESC", insertable = true, updatable = true)
	private String spraddrDesc;

	//bi-directional many-to-one association to Spraddr
	@OneToMany(mappedBy="stvtype1")
	private List<Spraddr> spraddrs1;



	public Stvtype() {
	}

	public int getSpraddrTipo() {
		return this.spraddrTipo;
	}

	public void setSpraddrTipo(int spraddrTipo) {
		this.spraddrTipo = spraddrTipo;
	}

	public String getSpraddrDesc() {
		return this.spraddrDesc;
	}

	public void setSpraddrDesc(String spraddrDesc) {
		this.spraddrDesc = spraddrDesc;
	}

	public List<Spraddr> getSpraddrs1() {
		return this.spraddrs1;
	}

	public void setSpraddrs1(List<Spraddr> spraddrs1) {
		this.spraddrs1 = spraddrs1;
	}

	public Spraddr addSpraddrs1(Spraddr spraddrs1) {
		getSpraddrs1().add(spraddrs1);
		spraddrs1.setStvtype1(this);

		return spraddrs1;
	}

	public Spraddr removeSpraddrs1(Spraddr spraddrs1) {
		getSpraddrs1().remove(spraddrs1);
		spraddrs1.setStvtype1(null);

		return spraddrs1;
	}



}