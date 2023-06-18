package tn.mdweb.aminoacido.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
 
@Entity  

@Table
public class Specialite {




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String SPÉCIALITÉ; 
	@Column  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSPÉCIALITÉ() {
		return SPÉCIALITÉ;
	}
	public void setSPÉCIALITÉ(String sPÉCIALITÉ) {
		SPÉCIALITÉ = sPÉCIALITÉ;
	}
	@Override
	public String toString() {
		return "Specialite [id=" + id + ", SPÉCIALITÉ=" + SPÉCIALITÉ + "]";
	}

	
	
}  