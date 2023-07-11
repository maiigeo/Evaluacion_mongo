/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.Marilyn_Mendieta.evaluacion3M5A.repository;


import com.prueba.Marilyn_Mendieta.evaluacion3M5A.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author HP
 */
public interface PersonaRepository extends MongoRepository<Profesor, Long>{
    
}
