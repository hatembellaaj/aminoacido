package tn.mdweb.aminoacido.repository;


import org.springframework.data.repository.CrudRepository;

import tn.mdweb.aminoacido.model.Services;

 
//repository that extends CrudRepository  

public interface ServicesRepository extends CrudRepository<Services, Integer>  
{  
}  
