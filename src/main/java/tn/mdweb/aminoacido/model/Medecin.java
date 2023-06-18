package tn.mdweb.aminoacido.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
 
@Entity  

@Table 
public class Medecin {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String MÉDECIN; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMÉDECIN() {
		return MÉDECIN;
	}
	public void setMÉDECIN(String mÉDECIN) {
		MÉDECIN = mÉDECIN;
	}
	@Override
	public String toString() {
		return "Medecin [id=" + id + ", MÉDECIN=" + MÉDECIN + "]";
	}
	
	
	
}  