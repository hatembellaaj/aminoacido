package tn.mdweb.aminoacido.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.ServiCe;
import tn.mdweb.aminoacido.repository.ServiCeRepository;



//defining the business logic  
@Service 

public class ServiCeService {

	@Autowired  
	ServiCeRepository sR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<ServiCe> getAllServices()   
	{  
		List<ServiCe> services = new ArrayList<ServiCe>();  
		sR.findAll().forEach(s  -> services.add(s));  
		return services;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public ServiCe getServicesById(int id)   
	{  
		return sR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(ServiCe s)   
	{  
		sR.save(s);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		sR.deleteById(id);  
	} 

}