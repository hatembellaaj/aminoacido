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

import tn.mdweb.aminoacido.model.ServiCe;
import tn.mdweb.aminoacido.service.ServiCeService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class ServiCeController {






	//autowire the ServiceService class  
	@Autowired  
	ServiCeService ss;  

	//creating a get mapping that retrieves all the Service detail from the database   
	@GetMapping("/serviCe")
	private List<ServiCe> getAllServiCes()   
	{  
		return ss.getAllServiCes();  
	}  

	//creating a get mapping that retrieves the detail of a specific Service  
	@GetMapping("/serviCe/{id}")  
	private ServiCe getServiCe(@PathVariable("id") int id)   
	{  
		return ss.getServiCesById(id);  
	}  

	//creating a delete mapping that deletes a specified Service
	@DeleteMapping("/serviCe/{id}")  
	private void deleteServiCe(@PathVariable("id") int id)   
	{  
		ss.delete(id);  
	} 

	//create new Service
	@PostMapping("/serviCe")  
	private int saveServiCe(@RequestBody ServiCe s)   
	{  
		ss.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the Service detail
	@PutMapping("/serviCe")  
	private ServiCe update(@RequestBody  ServiCe s)   
	{  
		ss.saveOrUpdate(s);  
		return s;  
	}  
}