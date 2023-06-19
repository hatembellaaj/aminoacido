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

	//autowire the ArticleService class  
	@Autowired  
	StructureService ss;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/structure")
	private List<Structure> getAllStructure()   
	{  
		return ss.getAllStructures();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/structure/{id}")  
	private Structure getArticle(@PathVariable("id") int id)   
	{  
		return ss.getStructuresById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/structure/{id}")  
	private void deleteStructure(@PathVariable("id") int id)   
	{  
		ss.delete(id);  
	} 

	//create new article
	@PostMapping("/structure")  
	private int saveStructure(@RequestBody Structure s)   
	{  
		ss.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/structure")  
	private Structure update(@RequestBody  Structure s)   
	{  
		ss.saveOrUpdate(s);  
		return s;  
	}  
}


