/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.Marilyn_Mendieta.evaluacion3M5A.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author HP
 */
@Document(collection = "Profesor")
@Data
public class Profesor {
        @Id
    private Long id_profesor;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private Depto departamentos;
    
}
