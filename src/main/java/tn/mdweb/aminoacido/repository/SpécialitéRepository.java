package tn.mdweb.aminoacido.repository;


import org.springframework.data.repository.CrudRepository;

import tn.mdweb.aminoacido.model.Spécialité;

 
//repository that extends CrudRepository  

public interface SpécialitéRepository extends CrudRepository<Spécialité, Integer>  
{  
}  
