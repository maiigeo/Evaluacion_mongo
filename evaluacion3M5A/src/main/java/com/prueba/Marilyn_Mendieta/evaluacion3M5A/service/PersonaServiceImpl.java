/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.Marilyn_Mendieta.evaluacion3M5A.service;


import com.prueba.Marilyn_Mendieta.evaluacion3M5A.model.Profesor;
import com.prueba.Marilyn_Mendieta.evaluacion3M5A.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Profesor, Long> 
    implements GenericService<Profesor, Long> {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return personaRepository;
    }


    
}

