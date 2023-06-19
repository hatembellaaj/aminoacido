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

		//autowire the ArticleService class  
		@Autowired  
		ServiCeService ss;  

		//creating a get mapping that retrieves all the Article detail from the database   
		@GetMapping("/srvice")
		private List<ServiCe> getAllServiCes()   
		{  
			return ss.getAllServices();  
		}  

		//creating a get mapping that retrieves the detail of a specific article  
		@GetMapping("/service/{id}")  
		private ServiCe getService(@PathVariable("id") int id)   
		{  
			return ss.getServicesById(id);  
		}  

		//creating a delete mapping that deletes a specified article  
		@DeleteMapping("/service/{id}")  
		private void deleteService(@PathVariable("id") int id)   
		{ 
			ss.delete(id);  
		} 

		//create new article
		@PostMapping("/service")  
		private int saveServiCe(@RequestBody ServiCe s)   
		{  
			ss.saveOrUpdate(s);  
			return s.getId();  
		} 

		//creating put mapping that updates the article detail
		@PutMapping("/service")  
		private ServiCe update(@RequestBody  ServiCe s)   
		{  
			ss.saveOrUpdate(s);  
			return s;  
		}  
	}
	
