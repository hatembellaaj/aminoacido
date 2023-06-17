package tn.mdweb.aminoacido.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Medecin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String nom;
	@Column
	private String prenom;

    @ManyToOne(optional=false)
	@JoinColumn(name="idStructure", referencedColumnName="id")
	private Structure structure;

    @ManyToOne(optional=false)
	@JoinColumn(name="idServices", referencedColumnName="id")
	private Services services;

    @ManyToOne(optional=false)
	@JoinColumn(name="idSpécialité", referencedColumnName="id")
	private Spécialité spécialité;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Structure getStructure() {
		return structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public Spécialité getSpécialité() {
		return spécialité;
	}

	public void setSpécialité(Spécialité spécialité) {
		this.spécialité = spécialité;
	}

	@Override
	public String toString() {
		return "Medecin [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", structure=" + structure + ", services="
				+ services + ", spécialité=" + spécialité + "]";
	}
    
}
