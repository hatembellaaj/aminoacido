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

import tn.mdweb.aminoacido.model.Spécialité;
import tn.mdweb.aminoacido.service.SpécialitéService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")
public class SpécialitéController {

	//autowire the SpécialitéService class  
	@Autowired  
	SpécialitéService ss;  

	//creating a get mapping that retrieves all the Structure detail from the database   
	@GetMapping("/specialite")
	private List<Spécialité> getAllSpécialité() {  
		return ss.getAllSpécialité();  
	}  

	//creating a get mapping that retrieves the detail of a specific Spécialité
	@GetMapping("/specialite/{id}")  
	private Spécialité getSpécialité(@PathVariable("id") int id) {  
		return ss.getSpécialitéById(id);  
	}  

	//creating a delete mapping that deletes a specified Spécialité 
	@DeleteMapping("/specialite/{id}")  
	private void deleteSpécialité(@PathVariable("id") int id) {  
		ss.delete(id);  
	} 

	//create new Spécialité
	@PostMapping("/specialite")  
	private int saveUser(@RequestBody Spécialité s) {  
		ss.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the Structure detail
	@PutMapping("/specialite")  
	private Spécialité update(@RequestBody  Spécialité s) {  
		ss.saveOrUpdate(s);  
		return s;  
	}  
}