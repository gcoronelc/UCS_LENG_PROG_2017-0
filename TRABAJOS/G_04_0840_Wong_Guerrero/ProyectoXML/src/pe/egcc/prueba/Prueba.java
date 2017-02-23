/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import pe.egcc.proyectoxml.model.dto;
import pe.egcc.proyectoxml.service.service;

/**
 *
 * @author David
 */
public class Prueba {
    public static void main(String[] args) {
        
        //Objeto del Servicio
        service servicio = new service();
        
        //Ingreso de Datos 
        int idCodigo = 99991;
        String Nombre = "Jorge";
        String ApPaterno = "Cruzado";
        String ApMaterno = "Gastelu";
        String NombreArchivo = "prueba01";
        
        dto Dto  = new dto(idCodigo, Nombre, ApPaterno, ApMaterno, NombreArchivo);
        
        //Proceso
        service.crearXML(Dto);        
    }   
}
