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
public class Structure {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id; 
	
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idservice", referencedColumnName="id")
	private ServiCe service;
	
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idmedecin", referencedColumnName="id")
	private Medecin medecin;

	
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idspécialité", referencedColumnName="id")
	private Specialite specialite;


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Structure [id=" + id + "]";
	}  
	
	
}  