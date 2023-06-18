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
	SpecialiteRepository pR;  
	  

	//getting all Specialites record by using the method findaAll() of CrudRepository  
	public List<Specialite> getAllSpecialites()   
	{  
		List<Specialite> specialites = new ArrayList<Specialite>();  
		pR.findAll().forEach(p -> specialites.add(p));  
		return specialites;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Specialite getSpecialitesById(int id)   
	{  
		return pR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Specialite p)   
	{  
		pR.save(p);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		pR.deleteById(id);  
	} 

}