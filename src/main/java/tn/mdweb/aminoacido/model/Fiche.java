package tn.mdweb.aminoacido.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
 
@Entity  

@Table 

public class Fiche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;
	@Column  
	private String IdentifiantRegistre;  
	@Column 
	private String Sexe ;
	@Column 
	private String Age ;
	@Column 
	private String Consanguinité ;
	@Column 
	private String OrigineGéographiqueDuPère ;
	@Column 
	private String OrigineGéographiqueDeLaMère ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentifiantRegistre() {
		return IdentifiantRegistre;
	}
	public void setIdentifiantRegistre(String identifiantRegistre) {
		IdentifiantRegistre = identifiantRegistre;
	}
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getConsanguinité() {
		return Consanguinité;
	}
	public void setConsanguinité(String consanguinité) {
		Consanguinité = consanguinité;
	}
	public String getOrigineGéographiqueDuPère() {
		return OrigineGéographiqueDuPère;
	}
	public void setOrigineGéographiqueDuPère(String origineGéographiqueDuPère) {
		OrigineGéographiqueDuPère = origineGéographiqueDuPère;
	}
	public String getOrigineGéographiqueDeLaMère() {
		return OrigineGéographiqueDeLaMère;
	}
	public void setOrigineGéographiqueDeLaMère(String origineGéographiqueDeLaMère) {
		OrigineGéographiqueDeLaMère = origineGéographiqueDeLaMère;
	}
	
	@Override
	public String toString() {
		return "Fiche [id=" + id + ", IdentifiantRegistre=" + IdentifiantRegistre + ", Sexe=" + Sexe + ", Age=" + Age
				+ ", Consanguinité=" + Consanguinité + ", OrigineGéographiqueDuPère=" + OrigineGéographiqueDuPère
				+ ", OrigineGéographiqueDeLaMère=" + OrigineGéographiqueDeLaMère + "]";
	}
	
	
	
}
