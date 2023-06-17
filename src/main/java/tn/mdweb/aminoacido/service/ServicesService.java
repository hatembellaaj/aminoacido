package tn.mdweb.aminoacido.service;



import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.Services;
import tn.mdweb.aminoacido.repository.ServicesRepository;


//defining the business logic  
@Service 

public class ServicesService {

	@Autowired  
	ServicesRepository sR;  

	//getting all User record by using the method findaAll() of CrudRepository  
	public List<Services> getAllServices()   
	{  
		List<Services>Services = new ArrayList<Services>();  
		sR.findAll().forEach(s  -> Services.add(s));  
		return Services;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Services getServicesById(int id)   
	{  
		return sR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Services s)   
	{  
		sR.save(s);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		sR.deleteById(id);  
	} 

}
