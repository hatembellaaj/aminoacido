package tn.mdweb.aminoacido.repository;

import org.springframework.data.repository.CrudRepository;

import tn.mdweb.aminoacido.model.Doctor;








 
//repository that extends CrudRepository  

public interface DoctorRepository extends CrudRepository<Doctor, Integer>  
{  
}  