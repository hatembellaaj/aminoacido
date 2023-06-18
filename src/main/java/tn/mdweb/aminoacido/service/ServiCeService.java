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
	ServiCeRepository eR;  
	  

	//getting all Services record by using the method findaAll() of CrudRepository  
	public List<ServiCe> getAllServiCes()   
	{  
		List<ServiCe> serviCes = new ArrayList<ServiCe>();  
		eR.findAll().forEach(e -> serviCes.add(e));  
		return serviCes;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public ServiCe getServiCesById(int id)   
	{  
		return eR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(ServiCe e)   
	{  
		eR.save(e);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		eR.deleteById(id);  
	} 

}