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
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Structure> getAllStructures()   
	{  
		List<Structure> structures = new ArrayList<Structure>();  
		sR.findAll().forEach(s  -> structures.add(s));  
		return structures;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Structure getStructuresById(int id)   
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