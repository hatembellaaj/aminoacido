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

import tn.mdweb.aminoacido.model.Doctor;
import tn.mdweb.aminoacido.service.DoctorService;




//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class DoctorController {

	//autowire the ArticleService class  
	@Autowired  
	DoctorService ds;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/doctor")
	private List<Doctor> getAllDoctors()   
	{  
		return ds.getAlldoctors();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/doctor{id}")  
	private Doctor getDoctors(@PathVariable("id") int id)   
	{  
		return ds.getDoctorById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/doctor/{id}")  
	private void deleteDoctor(@PathVariable("id") int id)   
	{ 
		ds.delete(id);  
	} 

	//create new article
	@PostMapping("/doctor")  
	private int saveDoctor(@RequestBody Doctor d)   
	{  
		ds.saveOrUpdate(d);  
		return d.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/doctor")  
	private Doctor update(@RequestBody  Doctor d)   
	{  
		ds.saveOrUpdate(d);  
		return d;  
	}  
}


