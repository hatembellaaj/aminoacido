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

	//autowire the ArticleService class  
	@Autowired  
	SpecialiteService ss;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/specialite")
	private List<Specialite> getAllSpecialites()   
	{  
		return ss.getAllServices();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/specialite{id}")  
	private Specialite getSpecialite(@PathVariable("id") int id)   
	{  
		return ss.getSpecialitesById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/specialite/{id}")  
	private void deleteSpecialite(@PathVariable("id") int id)   
	{ 
		ss.delete(id);  
	} 

	//create new article
	@PostMapping("/specialite")  
	private int saveSpecialite(@RequestBody Specialite s)   
	{  
		ss.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/specialite")  
	private Specialite update(@RequestBody  Specialite s)   
	{  
		ss.saveOrUpdate(s);  
		return s;  
	}  
}


