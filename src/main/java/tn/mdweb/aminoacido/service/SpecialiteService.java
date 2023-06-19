package tn.mdweb.aminoacido.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.Specialite;
import tn.mdweb.aminoacido.repository.SpecialiteRepository;





//defining the business logic  
@Service 

public class SpecialiteService {

	@Autowired  
	SpecialiteRepository sR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Specialite> getAllspecialites()   
	{  
		List<Specialite> specialites = new ArrayList<Specialite>();  
		sR.findAll().forEach(s  -> specialites.add(s));  
		return specialites;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Specialite getspecialiteById(int id)   
	{  
		return sR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Specialite s)   
	{  
		sR.save(s);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		sR.deleteById(id);  
	} 

}
