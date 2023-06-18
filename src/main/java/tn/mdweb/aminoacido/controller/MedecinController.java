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

import tn.mdweb.aminoacido.model.Medecin;
import tn.mdweb.aminoacido.service.MedecinService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class MedecinController {


	//autowire the MedecinService class  
	@Autowired  
	MedecinService ms;  

	//creating a get mapping that retrieves all the Medecin detail from the database   
	@GetMapping("/medecin")
	private List<Medecin> getAllMedecins()   
	{  
		return ms.getAllMedecins();  
	}  

	//creating a get mapping that retrieves the detail of a specific Medecin
	@GetMapping("/medecin/{id}")  
	private Medecin getMedecin(@PathVariable("id") int id)   
	{  
		return ms.getMedecinsById(id);  
	}  

	//creating a delete mapping that deletes a specified Medecin 
	@DeleteMapping("/medecin/{id}")  
	private void deleteMedecin(@PathVariable("id") int id)   
	{  
		ms.delete(id);  
	} 

	//create new Medecin
	@PostMapping("/medecin")  
	private int saveMedecin(@RequestBody Medecin m)   
	{  
		ms.saveOrUpdate(m);  
		return m.getId();  
	} 

	//creating put mapping that updates the Medecin detail
	@PutMapping("/medecin")  
	private Medecin update(@RequestBody  Medecin m)   
	{  
		ms.saveOrUpdate(m);  
		return m;  
	}  
}