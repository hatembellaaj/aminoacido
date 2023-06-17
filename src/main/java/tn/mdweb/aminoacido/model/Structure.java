package tn.mdweb.aminoacido.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "structure")
public class Structure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String type;

	@Column
	private String nomDeLEtablissement;

	@Column
	private String service;

	@Column
	private String medecin;

	@Column
	private String specialite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNomDeLEtablissement() {
		return nomDeLEtablissement;
	}

	public void setNomDeLEtablissement(String nomDeLEtablissement) {
		this.nomDeLEtablissement = nomDeLEtablissement;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Structure [id=" + id + ", type=" + type + ", nomDeLEtablissement=" + nomDeLEtablissement + ", service="
				+ service + ", medecin=" + medecin + ", specialite=" + specialite + "]";
	}

	
}
