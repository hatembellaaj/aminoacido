package tn.mdweb.aminoacido.service;



import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.Spécialité;
import tn.mdweb.aminoacido.repository.SpécialitéRepository;


//defining the business logic  
@Service 

public class SpécialitéService {

	@Autowired  
	SpécialitéRepository sR;  

	//getting all User record by using the method findaAll() of CrudRepository  
	public List<Spécialité> getAllSpécialité()   
	{  
		List<Spécialité>Spécialité = new ArrayList<Spécialité>();  
		sR.findAll().forEach(s  -> Spécialité.add(s));  
		return Spécialité;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Spécialité getSpécialitéById(int id)   
	{  
		return sR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Spécialité s)   
	{  
		sR.save(s);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		sR.deleteById(id);  
	} 

}
