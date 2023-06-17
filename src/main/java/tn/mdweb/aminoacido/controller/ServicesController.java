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

import tn.mdweb.aminoacido.model.Services;
import tn.mdweb.aminoacido.service.ServicesService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")
public class ServicesController {

	//autowire the ServicesService class  
	@Autowired  
	ServicesService ss;  

	//creating a get mapping that retrieves all the Services detail from the database   
	@GetMapping("/service")
	private List<Services> getAllServices() {  
		return ss.getAllServices();  
	}  

	//creating a get mapping that retrieves the detail of a specific Services
	@GetMapping("/service/{id}")  
	private Services getServices(@PathVariable("id") int id) {  
		return ss.getServicesById(id);  
	}  

	//creating a delete mapping that deletes a specified Services  
	@DeleteMapping("/service/{id}")  
	private void deleteServices(@PathVariable("id") int id) {  
		ss.delete(id);  
	} 

	//create new Services
	@PostMapping("/service")  
	private int saveUser(@RequestBody Services s) {  
		ss.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the Services detail
	@PutMapping("/service")  
	private Services update(@RequestBody  Services s) {  
		ss.saveOrUpdate(s);  
		return s;  
	}  
}