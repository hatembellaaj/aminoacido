package tn.mdweb.aminoacido.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.mdweb.aminoacido.model.Specialite;
import tn.mdweb.aminoacido.service.SpecialiteService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class SpecialiteController {



	//autowire the SpecialiteService class  
	@Autowired  
	SpecialiteService ps;  

	//creating a get mapping that retrieves all the Specialite detail from the database   
	@GetMapping("/specialite")
	private List<Specialite> getAllSpecialites()   
	{  
		return ps.getAllSpecialites();  
	}  

	//creating a get mapping that retrieves the detail of a specific Specialite  
	@GetMapping("/specialite/{id}")  
	private Specialite getSpecialite(@PathVariable("id") int id)   
	{  
		return ps.getSpecialitesById(id);  
	}  

	//creating a delete mapping that deletes a specified Specialite  
	@DeleteMapping("/specialite/{id}")  
	private void deleteSpecialite(@PathVariable("id") int id)   
	{  
		ps.delete(id);  
	} 

	//create new specialite
	@PostMapping("/specialite")  
	private int saveSpecialite(@RequestBody Specialite p)   
	{  
		ps.saveOrUpdate(p);  
		return p.getId();  
	} 

	//creating put mapping that updates the specialite detail
	@PutMapping("/specialite")  
	private Specialite update(@RequestBody  Specialite p)   
	{  
		ps.saveOrUpdate(p);  
		return p;  
	}  
}