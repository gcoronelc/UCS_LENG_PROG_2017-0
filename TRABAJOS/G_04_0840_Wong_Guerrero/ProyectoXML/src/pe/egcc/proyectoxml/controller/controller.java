/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.proyectoxml.controller;

import pe.egcc.proyectoxml.model.dto;
import pe.egcc.proyectoxml.service.service;

/**
 *
 * @author David
 */
public class controller {
    
    private service servicio;
    
    public void crearXML(dto Dto ){
        servicio.crearXML(Dto);
    }
}
