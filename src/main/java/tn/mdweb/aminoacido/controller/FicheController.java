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

import tn.mdweb.aminoacido.model.Fiche;
import tn.mdweb.aminoacido.service.FicheService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class FicheController {


	//autowire the MedecinService class  
	@Autowired  
	FicheService fs;  

	//creating a get mapping that retrieves all the Fiche detail from the database   
	@GetMapping("/fiche")
	private List<Fiche> getAllFiches()   
	{  
		return fs.getAllFiches();  
	}  

	//creating a get mapping that retrieves the detail of a specific Fiche
	@GetMapping("/fiche/{id}")  
	private Fiche getFiche(@PathVariable("id") int id)   
	{  
		return fs.getFichesById(id);  
	}  

	//creating a delete mapping that deletes a specified Fiche 
	@DeleteMapping("/fiche/{id}")  
	private void deleteFiche(@PathVariable("id") int id)   
	{  
		fs.delete(id);  
	} 

	//create new Fiche
	@PostMapping("/fiche")  
	private int saveMedecin(@RequestBody Fiche f)   
	{  
		fs.saveOrUpdate(f);  
		return f.getId();  
	} 

	//creating put mapping that updates the Fiche detail
	@PutMapping("/fiche")  
	private Fiche update(@RequestBody  Fiche f)   
	{  
		fs.saveOrUpdate(f);  
		return f;  
	}  
}
