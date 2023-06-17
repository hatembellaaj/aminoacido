package tn.mdweb.aminoacido.repository;


import org.springframework.data.repository.CrudRepository;

import tn.mdweb.aminoacido.model.Fiche;

 
//repository that extends CrudRepository  

public interface FicheRepository extends CrudRepository<Fiche, Integer>  
{  
}  
