package tn.mdweb.aminoacido.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.mdweb.aminoacido.model.Doctor;
import tn.mdweb.aminoacido.repository.DoctorRepository;






//defining the business logic  
@Service 

public class DoctorService {

	@Autowired  
	DoctorRepository dR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Doctor> getAlldoctors()   
	{  
		List<Doctor> doctors = new ArrayList<Doctor>();  
		dR.findAll().forEach(d  -> doctors.add(d));  
		return doctors;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Doctor getdoctorById(int id)   
	{  
		return dR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Doctor d)   
	{  
		dR.save(d);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		dR.deleteById(id);  
	} 

}
