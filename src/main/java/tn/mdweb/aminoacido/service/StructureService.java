package tn.mdweb.aminoacido.service;



import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.Structure;
import tn.mdweb.aminoacido.repository.StructureRepository;


//defining the business logic  
@Service 

public class StructureService {

	@Autowired  
	StructureRepository sR;  

	//getting all User record by using the method findaAll() of CrudRepository  
	public List<Structure> getAllStructure()   
	{  
		List<Structure>Structure = new ArrayList<Structure>();  
		sR.findAll().forEach(s  -> Structure.add(s));  
		return Structure;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Structure getStructureById(int id)   
	{  
		return sR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Structure s)   
	{  
		sR.save(s);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		sR.deleteById(id);  
	} 

}
