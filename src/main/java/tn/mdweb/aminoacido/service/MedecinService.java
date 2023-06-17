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

	//getting all User record by using the method findaAll() of CrudRepository  
	public List<Medecin> getAllMedecin()   
	{  
		List<Medecin> Medecin = new ArrayList<Medecin>();  
		mR.findAll().forEach(m  -> Medecin.add(m));  
		return Medecin;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Medecin getMedecinById(int id)   
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
