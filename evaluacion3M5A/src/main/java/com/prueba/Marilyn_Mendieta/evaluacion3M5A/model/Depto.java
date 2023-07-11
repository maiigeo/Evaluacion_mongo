/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.Marilyn_Mendieta.evaluacion3M5A.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author HP
 */
@Document(collection = "Depto")
@Data
public class Depto {
    private String Nombre;
    private String Director;
    private String Descripcion;
    
}
