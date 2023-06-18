



package tn.mdweb.aminoacido.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
 
@Entity  

@Table
public class ServiCe {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name; 
	@Column  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name  + "]";
	}
	
	
}  