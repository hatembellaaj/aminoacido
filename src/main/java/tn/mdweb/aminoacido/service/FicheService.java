package tn.mdweb.aminoacido.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.Fiche;
import tn.mdweb.aminoacido.repository.FicheRepository;


//defining the business logic  
@Service 

public class FicheService {



	@Autowired  
	FicheRepository fR;  
	  

	//getting all Fiches record by using the method findaAll() of CrudRepository  
	public List<Fiche> getAllFiches()   
	{  
		List<Fiche> fiches = new ArrayList<Fiche>();  
		fR.findAll().forEach(f -> fiches.add(f));  
		return fiches;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Fiche getFichesById(int id)   
	{  
		return fR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Fiche f)   
	{  
		fR.save(f);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fR.deleteById(id);  
	} 

}