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

import tn.mdweb.aminoacido.model.Structure;
import tn.mdweb.aminoacido.service.StructureService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")
public class StructureController {

	//autowire the StructureService class  
	@Autowired  
	StructureService ss;  

	//creating a get mapping that retrieves all the Structure detail from the database   
	@GetMapping("/structure")
	private List<Structure> getAllStructure() {  
		return ss.getAllStructure();  
	}  

	//creating a get mapping that retrieves the detail of a specific Structure
	@GetMapping("/structure/{id}")  
	private Structure getStructure(@PathVariable("id") int id) {  
		return ss.getStructureById(id);  
	}  

	//creating a delete mapping that deletes a specified Structure 
	@DeleteMapping("/structure/{id}")  
	private void deleteStructure(@PathVariable("id") int id) {  
		ss.delete(id);  
	} 

	//create new Structure
	@PostMapping("/structure")  
	private int saveUser(@RequestBody Structure s) {  
		ss.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the Structure detail
	@PutMapping("/structure")  
	private Structure update(@RequestBody  Structure s) {  
		ss.saveOrUpdate(s);  
		return s;  
	}  
}