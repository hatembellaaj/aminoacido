package tn.mdweb.aminoacido.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.Medecin;
import tn.mdweb.aminoacido.repository.MedecinRepository;


//defining the business logic  
@Service 


public class MedecinService {


	@Autowired  
	MedecinRepository mR;  
	  

	//getting all Medecins record by using the method findaAll() of CrudRepository  
	public List<Medecin> getAllMedecins()   
	{  
		List<Medecin> medecins = new ArrayList<Medecin>();  
		mR.findAll().forEach(m -> medecins.add(m));  
		return medecins;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Medecin getMedecinsById(int id)   
	{  
		return mR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Medecin m)   
	{  
		mR.save(m);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		mR.deleteById(id);  
	} 

}