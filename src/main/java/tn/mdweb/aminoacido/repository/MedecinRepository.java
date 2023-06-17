package tn.mdweb.aminoacido.repository;


import org.springframework.data.repository.CrudRepository;

import tn.mdweb.aminoacido.model.Medecin;

 
//repository that extends CrudRepository  

public interface MedecinRepository extends CrudRepository<Medecin, Integer>  
{  
}  
