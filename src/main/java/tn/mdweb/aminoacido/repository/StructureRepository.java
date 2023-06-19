package tn.mdweb.aminoacido.repository;

import org.springframework.data.repository.CrudRepository;

import tn.mdweb.aminoacido.model.Structure;



 
//repository that extends CrudRepository  

public interface StructureRepository extends CrudRepository<Structure, Integer>  
{  
}  